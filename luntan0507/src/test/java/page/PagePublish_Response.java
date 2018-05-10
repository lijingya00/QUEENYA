package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/8.
 */
public class PagePublish_Response {
    /* 点击默认板块*/
    public static final By DEFAULTMOOD=By.xpath("/html/body/div[7]/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/h2/a");
   /*新模板*/
    public static  final By NEWMOOD=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");
    /*点击板块标题栏*/
    public static final By GETTITLE=By.id("subject");
    /*获取文章内容输入框*/
    public  static final By CONTENT=By.id("fastpostmessage");
    /*获取发表按钮*/
    public static final By PUBLISH=By.id("fastpostsubmit");
    /*点击新帖*/
    public static final By CLICKARTICLE=By.className("new");
    /*点击回复*/
    public static final By RESPONSE=By.xpath("/html/body/div[7]/div[4]/div[1]/a[2]/img");
    /*点击回复框*/
    public static final By RESPONSECONTENT=By.id("fastpostmessage");
    /*点击发表*/
    public static final By PUBLISHBUTTON=By.id("fastpostsubmit");

}
