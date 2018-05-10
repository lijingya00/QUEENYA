package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogin_LogOut;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/7.
 */
public class HelperLoginPage {
    private static Logger logger=Logger.getLogger("HelperLoginPage.class");
    //点击用户名框并输入用户名
    public static void user( SeleniumUtil seleniumUtil,String user){
        seleniumUtil.waitForElementLoad(PageLogin_LogOut.USERNAME,5);
        seleniumUtil.click(PageLogin_LogOut.USERNAME);
        seleniumUtil.sendkeys(PageLogin_LogOut.USERNAME,user);
    }
    //点击密码框并输入密码
    public static void passwd( SeleniumUtil seleniumUtil,String passwd){
        seleniumUtil.click(PageLogin_LogOut.PASSWORD);
        seleniumUtil.sendkeys(PageLogin_LogOut.PASSWORD,passwd);
    }
    //点击登录
    public static void login( SeleniumUtil seleniumUtil){

        seleniumUtil.click(PageLogin_LogOut.LOGINBUTTON);
    }

    //点击退出
    public static void logOut(SeleniumUtil seleniumUtil) {
        seleniumUtil.click(PageLogin_LogOut.QUIT);
    }

    public static void logins(SeleniumUtil seleniumUtil, String user, String passwd) {
        user(seleniumUtil,user);
        passwd(seleniumUtil,passwd);
        login(seleniumUtil);
    }


}
