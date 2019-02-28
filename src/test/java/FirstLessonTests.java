import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class FirstLessonTests {
    private final String googleUrl = "https://google.com";

    @Test
    public void chromeDriverTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to(googleUrl);
        driver.close();
    }

    @Test
    public void chromeDriverHeadless() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to(googleUrl);
        driver.close();
    }

    @Test
    public void edgeDriverTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to(googleUrl);
        driver.close();
    }

    @Test
    public void ieDriverTest() {
        WebDriverManager.iedriver().setup();

        InternetExplorerOptions caps = new InternetExplorerOptions();
        caps.setCapability("ignoreZoomSetting", true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

        WebDriver driver = new InternetExplorerDriver(caps);
        driver.navigate().to(googleUrl);
        driver.close();
    }

    @Test
    public void fireFoxDriverTest() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to(googleUrl);
        driver.close();
    }
}                                               
