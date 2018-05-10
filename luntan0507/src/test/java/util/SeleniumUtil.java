package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;


/**
 * Created by lenovo on 2018/5/7.
 */
public class SeleniumUtil {
    //类属性
    private static Logger logger = Logger.getLogger("SeleniumUtil.class");
    public WebDriver driver;
    public WebElement element = null;

    /* 加载驱动*/
    public WebDriver getWebDriver(String webDriver) {
        if ("chrome".equals(webDriver)) {
            System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("chromedriver");
        } else if ("firefox".equals(webDriver)) {
            System.setProperty("webdriver.gecko.driver", "D:\\360安全浏览器下载\\Mozilla firefox\\geckodriver.exe");
            logger.info("firefox");
        }else{
            logger.error("不被识别的浏览器");
        }
        return driver;
    }

    /*打开网址*/
    public void getUrl(String url) {
        driver.get(url);
        logger.info("获取到的浏览区网址为：" + url);
    }
    /** 返回元素对应的定位值 */

    /**
     * 识别一个元素
     */
    public WebElement element(By by) {
        try {
            element = driver.findElement(by);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("没有找到该元素");
        }
        return element;
    }

    /*识别一组元素*/
    public List<WebElement> elements(By by) {
        logger.info("返回一组元素");
        return driver.findElements(by);
    }

    /*点击元素*/
    public void click(By by) {
        element = driver.findElement(by);
        element.click();
        logger.info("对" + element + "该元素进行了点击操作");
    }
    /*输入内容*/

    public void sendkeys(By by, String text) {
        element = driver.findElement(by);
        element.sendKeys(text);
        logger.info("以向文本框输入：" + text);
    }

    /**
     * 设置显示等待元素
     */
    public void waitForElementLoad(final By by, int timeOut) {
        logger.info("开始查找元素：" + by);
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 3000);
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e) {
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }

    //句柄
    public  void handles() {
    Set<String> windowsHandles = driver.getWindowHandles();
    for(String handle:windowsHandles)
    {
        driver.switchTo().window(handle);
        logger.info("找到句柄"+handle);
    }

    }
    //iframe
    public void iframe(String id) {
        driver.switchTo().frame(id);
    }
    /**校验文本是否与预期一致*/
    public void assertForText(By actual, String expected){
        try{
            Assert.assertEquals( driver.findElement(actual).getText(), expected);
        } catch (AssertionError e){
            logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
            Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
        }
        logger.info("找到了期望的文字: [" + expected + "]");
    }
    /**获取控件的内容*/
    public String getText(By by){
        String str = driver.findElement(by).getText().trim();
        System.out.println(str);
        return str;
    }

}
