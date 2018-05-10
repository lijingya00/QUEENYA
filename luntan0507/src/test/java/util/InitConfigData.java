package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lenovo on 2018/5/8.
 */
public class InitConfigData {
    public  static String browserName;
    public static String serverURL;
    public static WebDriver driver;
    private static final Logger logger=Logger.getLogger("InitConfigData.class");
    public static void initConfigData() throws IOException {
        Properties p=new Properties();
        //加载配置文件
        InputStream ips=new FileInputStream(".\\browser.properties");
        p.load(ips);
        browserName = p.getProperty("browserName");
        serverURL=p.getProperty("URL");
    }
    static {
        try{
            initConfigData();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
