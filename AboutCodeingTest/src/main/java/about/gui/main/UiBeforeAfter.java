package about.gui.main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;

/**
 * Created by wasey on 10/20/16.
 */
public class UiBeforeAfter {

    public WebDriver driver;
    protected String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception

    {

        Driver.getInstance().getDriver().manage().deleteAllCookies();
        Driver.getInstance().getDriver().manage().window().getSize();
        Driver.getInstance().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Driver.getInstance().getDriver().manage().window().maximize();



    }



    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {

        Driver.getInstance().getDriver().close();
        Driver.getInstance().getDriver().quit();
        Driver.getInstance().removeDriver();

        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}
