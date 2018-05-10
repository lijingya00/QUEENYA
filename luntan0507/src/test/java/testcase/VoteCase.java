package testcase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPublishPage;
import pageHelper.HelperVote;

/**
 * Created by lenovo on 2018/5/10.
 */
public class VoteCase extends BasicTestCase{
   @Test
    public void publishVote(){
       HelperLoginPage.logins(seleniumUtil,"admin","123456");
       HelperPublishPage.defaultmood(seleniumUtil);
       HelperVote.publishVote(seleniumUtil,"你喜欢哪门课？","Java","自动化","安全","选吧");
       HelperVote.vote(seleniumUtil);
       HelperVote.getTest(seleniumUtil);
       HelperVote.getBIli(seleniumUtil);

   }
}
