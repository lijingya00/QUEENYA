package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPublishPage;
import pageHelper.HelperResponsePage;

/**
 * Created by lenovo on 2018/5/7.
 */
public class Login_Pulish_Response_LogOut extends BasicTestCase{
   @Test
    public void login() throws InterruptedException {
       HelperLoginPage.logins(seleniumUtil,"admin","123456");
       HelperPublishPage.publis(seleniumUtil,"LALALAL","YAYAYAYAY");

      HelperResponsePage.response(seleniumUtil,"good");
       HelperLoginPage.logOut(seleniumUtil);
   }
}
