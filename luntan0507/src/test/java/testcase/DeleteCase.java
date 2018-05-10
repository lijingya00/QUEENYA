package testcase;
import org.testng.annotations.Test;
import pageHelper.HelperDeletePage;
import pageHelper.HelperLoginPage;

/**
 * Created by lenovo on 2018/5/8.
 */
public class DeleteCase extends BasicTestCase {
    @Test
    public  void delete() throws InterruptedException{
        HelperLoginPage.logins(seleniumUtil,"admin","123456");
        HelperDeletePage.dele(seleniumUtil);
    }
}
