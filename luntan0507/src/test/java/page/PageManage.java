package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageManage {

   /* 点击管理中心*/
    public static final By MANAGE=By.xpath("/html/body/div[6]/div/div[1]/div/p[1]/a[6]");
    /*点击输入密码框*/
    public static final By PASSWDBUTTON=By.className("txt");
    /*点击密码提交框*/
    public static final By PASSWDSUBMIT=By.className("btn");
    /*点击论坛*/
    public static final By FORUM=By.xpath("//*[@id=\"header_forum\"]");
    /*点击添加新板块*/
    public static final By MOOD=By.className("addtr");
    /*点击提交*/
    public  static final By SUBMIT=By.id("submit_editsubmit");
    /*点击管理员退出按钮*/
    public static final By ADMINLOGOUT=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
    /*点击新模板*/
    public static final By NEWMOOD=By.xpath("/html/body/div[7]/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/td[2]/h2/a");

}
