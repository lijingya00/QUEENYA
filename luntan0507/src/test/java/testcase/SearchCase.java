package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperSearch;

/**
 * Created by lenovo on 2018/5/9.
 */
public class SearchCase extends BasicTestCase{
    @Test
    public void searchCase(){
        HelperLoginPage.logins(seleniumUtil,"admin","123456");

        HelperSearch.searchContent(seleniumUtil,"haotest");

    }
}
