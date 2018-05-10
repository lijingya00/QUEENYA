package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/9.
 */
public class PageSearch {
   /* 搜索框*/
    public static final By SEARCHBAR=By.name("srchtxt");
    /*点击搜索*/
    public  static final By CLICKSEARCH=By.name("searchsubmit");

    /*搜索结果*/
    public static final By SEARCHRESULT=By.xpath("//*[@id=\"32\"]/h3/a/strong/font");
/*退出*/
    public static final By LOGOUT=By.xpath("//*[@id=\"toptb\"]/div[2]/a[2]");
}
