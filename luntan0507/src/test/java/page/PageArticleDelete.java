package page;

import org.openqa.selenium.By;

/**
 * Created by lenovo on 2018/5/9.
 */
public class PageArticleDelete {
    /*选中删除的文章*/
    public static final By SELECTED=By.xpath("//*[@id=\"normalthread_20\"]/tr/th/a[2]");
    /*选中删除*/
    public static final By DELETE=By.xpath("/html/body/div[7]/div[4]/div[3]/a[1]");
    /*点击确定按钮*/
    public static final By DEFINITE=By.id("modsubmit");
}
