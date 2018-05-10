package pageHelper;

import page.PageLogin_LogOut;
import page.PageManage;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperManagePage {
    //点击登录管理中心页面
    public static void managePage(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManage.MANAGE,5);
        seleniumUtil.click(PageManage.MANAGE);

    }
    //输入登录密码
    public static void writePasswd(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.handles();
        seleniumUtil.waitForElementLoad(PageManage.PASSWDBUTTON,5);
        seleniumUtil.sendkeys(PageManage.PASSWDBUTTON, text);
        seleniumUtil.click(PageManage.PASSWDSUBMIT);
    }
    //点击论坛
    public static void forum(SeleniumUtil seleniumUtil){
        seleniumUtil.handles();
        seleniumUtil.waitForElementLoad(PageManage.FORUM,30);
        seleniumUtil.click(PageManage.FORUM);
    }
    //添加新板块
    public static void addMood(SeleniumUtil seleniumUtil) {

        seleniumUtil.waitForElementLoad(PageManage.MOOD,15);
        seleniumUtil.click(PageManage.MOOD);
        seleniumUtil.click(PageManage.SUBMIT);
    }
    //管理员推出
    public static void logOut(SeleniumUtil seleniumUtil){
        seleniumUtil.handles();
        seleniumUtil.waitForElementLoad(PageManage.ADMINLOGOUT,5);
        seleniumUtil.click(PageManage.ADMINLOGOUT);
    }
    //点击新模块
    public static void newMood(SeleniumUtil seleniumUtil){

        seleniumUtil.click(PageManage.NEWMOOD);
    }
    public static void manage(SeleniumUtil seleniumUtil,String passwd) {
        managePage(seleniumUtil);
       writePasswd(seleniumUtil,passwd);
        forum(seleniumUtil);
        seleniumUtil.iframe("main");
        addMood(seleniumUtil);
        logOut(seleniumUtil);
       seleniumUtil.click( PageLogin_LogOut.QUIT);
    }
}
