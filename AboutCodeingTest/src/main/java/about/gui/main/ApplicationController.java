package about.gui.main;

import org.openqa.selenium.WebDriver;

/**
 * Created by wasey on 10/20/16.
 */
public class ApplicationController


{



    private WebDriver driver;
    private UiAction Action;







    public ApplicationController(WebDriver driver) {
        this.driver = driver;

      Action=new UiAction(driver);

    }

    public WebDriver getDriver() {
        return driver;
    }
    public UiAction Action() {
        return Action;
    }


    public void GOToApplication(){
        driver.navigate().to(ResourceFactory.getInstance().getProperty("APP_URL").toString());
    }


}
