package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/7.
 */
public class PageLogin_LogOut {
    /*用户名输入框*/
    public  static final By USERNAME=By.id("ls_username");
    /*密码输入框*/
    public static final By PASSWORD=By.id("ls_password");
    /*点击顶部登录按钮*/
    public static final By LOGINBUTTON=By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[3]/button");
    /* 点击退出*/
    public static final By QUIT=By.xpath("/html/body/div[6]/div/div[1]/div/p[1]/a[7]");

}
