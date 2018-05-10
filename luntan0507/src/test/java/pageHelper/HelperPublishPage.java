package pageHelper;

import org.apache.log4j.Logger;
import page.PageManage;
import page.PagePublish_Response;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/7.
 */
public class HelperPublishPage {
    private static Logger logger=Logger.getLogger("HelperPublishPage.class");
    //点击默认模板
    public static void defaultmood(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PagePublish_Response.DEFAULTMOOD,5);
        seleniumUtil.click(PagePublish_Response.DEFAULTMOOD);
    }
    //点击新模板
    public static void clickNewMood(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageManage.NEWMOOD,5);
        seleniumUtil.click(PageManage.NEWMOOD);
    }
    //点击标题框熟人内容
    public static void gettitle(SeleniumUtil seleniumUtil, String title){
        seleniumUtil.click(PagePublish_Response.GETTITLE);
        seleniumUtil.sendkeys(PagePublish_Response.GETTITLE,title);
    }
    //点击内容框
    public static void getcontent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.click(PagePublish_Response.CONTENT);
        seleniumUtil.sendkeys(PagePublish_Response.CONTENT,text);
        seleniumUtil.waitForElementLoad(PagePublish_Response.CONTENT ,5);
}
    //点击发表按钮
    public static void publishs(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePublish_Response.PUBLISH);
    }
    public static void publis(SeleniumUtil seleniumUtil, String title, String text) {
        defaultmood(seleniumUtil);
        gettitle(seleniumUtil,title);
        getcontent(seleniumUtil,text);
        publishs(seleniumUtil);
    }
    public static void newPublis(SeleniumUtil seleniumUtil, String title, String text) {
       clickNewMood(seleniumUtil);
        gettitle(seleniumUtil,title);
        getcontent(seleniumUtil,text);
        publishs(seleniumUtil);
    }

}
