package pageHelper;

import org.apache.log4j.Logger;
import page.PagePublish_Response;
import util.SeleniumUtil;

/**
 * Created by lenovo on 2018/5/8.
 */
public class HelperResponsePage {
    private static Logger logger=Logger.getLogger("HelperResponsePage");
    //点击回复
    public static void response(SeleniumUtil seleniumUtil,String responseText){
        seleniumUtil.waitForElementLoad(PagePublish_Response.CONTENT,5);
        seleniumUtil.click(PagePublish_Response.CONTENT);
        seleniumUtil.sendkeys(PagePublish_Response.CONTENT,responseText);
        seleniumUtil.waitForElementLoad(PagePublish_Response.PUBLISHBUTTON,5);
        seleniumUtil.click(PagePublish_Response.PUBLISHBUTTON);
    }

}
