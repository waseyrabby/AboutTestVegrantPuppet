package about.gui.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static about.gui.main.UiAppConstant.RemoteURL;

/**
 * Created by wasey on 10/20/16.
 */
public class Driver
{

    private RemoteWebDriver remotedriver;
    private Driver()
    {
        //Do-nothing..Do not allow to initialize this class from outside
    }
    private static Driver instance = new Driver();

    public static Driver getInstance()
    {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue()
        {

            String driverName = about.gui.main.ResourceFactory.getInstance().getProperty("DRIVER").toString();
            if(driverName.toUpperCase().contentEquals("CHROME")){
                String chromeBinayPath;
                chromeBinayPath =  System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeBinayPath);
                return new ChromeDriver();
            }
            else if(driverName.toUpperCase().contentEquals("IE")){
                String ieBinayPath;
                ieBinayPath = System.getProperty("user.dir") + "/src/main/resources/IEDriverServer.exe";
                System.setProperty("webdriver.ie.driver", ieBinayPath );
                return new InternetExplorerDriver();
            }
            else if(driverName.toUpperCase().contentEquals("FIREFOX")){
                return new FirefoxDriver();
            }
            else if(driverName.toUpperCase().contentEquals("PHANTOMJS")){
                String phantomBinayPath;
                phantomBinayPath = System.getProperty("user.dir") + "/src/main/resources/phantomjs.exe";
                System.setProperty("phantomjs.binary.path", phantomBinayPath);
                return new PhantomJSDriver();
            }


            else {
                return new FirefoxDriver(); // can be replaced with other browser drivers
            }
        }
    };
    public WebDriver getremotedriver() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "7.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "XP");
        caps.setCapability("browserstack.debug", "true");

        WebDriver driver = new RemoteWebDriver(new URL(RemoteURL), caps);

        return driver;
    }

    public WebDriver getDriver() // call this method to get the driver object and launch the browser
    {
        return driver.get();
    }


    public void removeDriver() // Quits the driver and closes the browser
    {
        driver.get().quit();
        driver.remove();
    }
}
