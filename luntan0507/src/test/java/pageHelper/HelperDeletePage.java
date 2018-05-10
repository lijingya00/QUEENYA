package pageHelper;

import org.apache.log4j.Logger;
import page.PageArticleDelete;
import page.PagePublish_Response;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/7.
 */
public class HelperDeletePage {
    private static Logger logger = Logger.getLogger("HelperDeletePage.class");
    public static void defaultmood(SeleniumUtil seleniumUtil) {
        //点击默认模板
        seleniumUtil.waitForElementLoad(PagePublish_Response.DEFAULTMOOD,5);
        seleniumUtil.click(PagePublish_Response.DEFAULTMOOD);
    }

    public static void article(SeleniumUtil seleniumUtil) {
        //点击要删除的文章
        seleniumUtil.waitForElementLoad(PageArticleDelete.SELECTED,5);
        seleniumUtil.click(PageArticleDelete.SELECTED);
    }

    public static void delete(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageArticleDelete.DELETE,5);
        //点击删除
        seleniumUtil.click(PageArticleDelete.DELETE);
        //点击确定删除
        seleniumUtil.click(PageArticleDelete.DEFINITE);
    }

    public static void dele(SeleniumUtil seleniumUtil) {
        defaultmood(seleniumUtil);
        article(seleniumUtil);
    }
}




