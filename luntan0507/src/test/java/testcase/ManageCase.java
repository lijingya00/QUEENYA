package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagePage;
import pageHelper.HelperPublishPage;
import pageHelper.HelperResponsePage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class ManageCase extends BasicTestCase{
    @Test
    public void managecase() throws InterruptedException {
        HelperLoginPage.logins(seleniumUtil,"admin","123456");
         HelperManagePage.manage(seleniumUtil,"123456");
        HelperLoginPage.logins(seleniumUtil,"jingjingya","jingya00");
        HelperPublishPage.newPublis(seleniumUtil,"lalalalal","yayayayayayaya");
        HelperResponsePage.response(seleniumUtil,"wery wery very good");
    }
}
