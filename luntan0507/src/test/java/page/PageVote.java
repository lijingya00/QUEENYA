package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/9.
 */
public class PageVote {
    /*点击发帖*/
      public  static final By BUTTON_PUBLISH=By.xpath("//*[@id=\"newspecial\"]/img");
    /*选择投票贴*/
    public static final By BUTTON_VOTE=By.xpath("//*[@id=\"editorbox\"]/ul/li[2]/a");
    /*发起投票标题*/
    public static final By TEXT_TITLE=By.name("subject");
    /*发起投票内容*/
    public static final By TEXT_CONTENT1=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");
    public static final By TEXT_CONTENT2=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");
    public static final By TEXT_CONTENT3=By.xpath("//*[@id=\"pollm_c_1\"]/p[3]/input");
    public static final By TEXT_CONTENT4=By.id("e_iframe");
    /*点击发表*/
    public static final By BUTTON_PUBLISH2=By.id("postsubmit");
    /*点击选项*/
    public static final By BUTTON_OPTION1=By.id("option_1");
    /*点击提交选项*/
    public static final By SUBMIT_VOTE=By.id("pollsubmit");
    /*获取投票选项名称*/
    public static final By OPTION_CONTENT1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[1]/td[1]/label");
    public static final By OPTION_CONTENT2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[3]/td[1]/label");
    public static final By OPTION_CONTENT3=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[5]/td[1]/label");
    /*获取比例*/
    public static final By OPTION_BILI1=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[2]/td[2]");
    public static final By OPTION_BILI2=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[4]/td[2]");
    public static final By OPTION_BILI3=By.xpath("//*[@id=\"poll\"]/div[2]/table/tbody/tr[6]/td[2]");

}
