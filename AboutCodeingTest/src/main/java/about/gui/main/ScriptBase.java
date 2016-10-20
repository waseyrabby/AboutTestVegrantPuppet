package about.gui.main;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;

/**
 * Created by wasey on 10/20/16.
 */
public class ScriptBase extends UiBeforeAfter
{
    private boolean acceptNextAlert = true;




    protected WebDriver driver;
    private ThreadLocal<ApplicationController> threadedApplication = null;

    @BeforeMethod
    public void startUp(){
        driver = Driver.getInstance().getDriver();
        driver.navigate().to("http://awesome.dev/");
        threadedApplication = new ThreadLocal<ApplicationController>(){
            @Override
            protected ApplicationController initialValue()
            {
                return new ApplicationController(Driver.getInstance().getDriver());
            }
            ;
        };

    }

    public ApplicationController nss(){
        return threadedApplication.get();
    }

    @AfterMethod
    public void tearDown(){
        Driver.getInstance().removeDriver();
    }
















//Reuswable Mathods

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            org.openqa.selenium.Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();



            if (acceptNextAlert) {

                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
