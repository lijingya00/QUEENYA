package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.InitConfigData;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by lenovo on 2018/5/7.
 */
public class BasicTestCase {
    public SeleniumUtil seleniumUtil;
    public WebDriver driver;
    @BeforeMethod
    public void initTests() throws IOException {
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        driver=seleniumUtil.getWebDriver(InitConfigData.browserName);
        seleniumUtil.getUrl(InitConfigData.serverURL);
    }
    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }
}
