package pageHelper;

import page.PageVote;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/10.
 */
public class HelperVote {
    //点击发帖发表
    public static void publishVote(SeleniumUtil seleniumUtil,String title,String text1,String text2,String text3,String text4){
        seleniumUtil.click(PageVote.BUTTON_PUBLISH);
        seleniumUtil.click(PageVote.BUTTON_VOTE);
        seleniumUtil.click(PageVote.TEXT_TITLE);
        seleniumUtil.sendkeys(PageVote.TEXT_TITLE,title);
        seleniumUtil.click(PageVote.TEXT_CONTENT1);
        seleniumUtil.sendkeys(PageVote.TEXT_CONTENT1,text1);
        seleniumUtil.sendkeys(PageVote.TEXT_CONTENT2,text2);
        seleniumUtil.sendkeys(PageVote.TEXT_CONTENT3,text3);
        seleniumUtil.waitForElementLoad(PageVote.TEXT_CONTENT4,5);

        seleniumUtil.click(PageVote.TEXT_CONTENT4);
        seleniumUtil.sendkeys(PageVote.TEXT_CONTENT4,text4);
        seleniumUtil.click(PageVote.BUTTON_PUBLISH2);
    }
    //选择投票
    public static void vote(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageVote.BUTTON_OPTION1,5);
        seleniumUtil.click(PageVote.BUTTON_OPTION1);
        seleniumUtil.click(PageVote.SUBMIT_VOTE);
    }
    //获取选项名称
    public static void getTest(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageVote.OPTION_CONTENT1,5);
        seleniumUtil.getText(PageVote.OPTION_CONTENT1);
        seleniumUtil.getText(PageVote.OPTION_CONTENT2);
        seleniumUtil.getText(PageVote.OPTION_CONTENT3);
    }
    //获取选项名称
    public static void getBIli(SeleniumUtil seleniumUtil){
        seleniumUtil.getText(PageVote.OPTION_BILI1);
        seleniumUtil.getText(PageVote.OPTION_BILI2);
        seleniumUtil.getText(PageVote.OPTION_BILI3);
    }

}
