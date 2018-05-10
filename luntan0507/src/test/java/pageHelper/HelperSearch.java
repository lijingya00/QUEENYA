package pageHelper;

import page.PageSearch;
import util.SeleniumUtil;


/**
 * Created by lenovo on 2018/5/9.
 */
public class HelperSearch {
    public static void searchContent(SeleniumUtil seleniumUtil, String text){
        seleniumUtil.click(PageSearch.SEARCHBAR);
        seleniumUtil.sendkeys(PageSearch.SEARCHBAR,text);
        seleniumUtil.click(PageSearch.CLICKSEARCH);
        seleniumUtil.handles();
        seleniumUtil.waitForElementLoad(PageSearch.SEARCHRESULT,5);
        seleniumUtil.assertForText(PageSearch.SEARCHRESULT,text);
        seleniumUtil.click(PageSearch.LOGOUT);

    }

}
