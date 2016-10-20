package about.gui.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

/**
 * Created by wasey on 10/20/16.
 */
public class UiAction
{
    private WebDriver driver = null;
    private int TimeoutValue = 30;


    public UiAction(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

    }

    public void verifytitle(){
        String title=driver.getTitle();
        System.out.println("App title is:- "+title);
        Assert.assertEquals(title,"");
    }
}
