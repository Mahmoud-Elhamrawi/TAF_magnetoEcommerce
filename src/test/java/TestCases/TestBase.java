package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {

    public WebDriver driver ;


    @BeforeClass
    public void setUp()
    {
        driver = new FirefoxDriver() ;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://live.techpanda.org/index.php/");
    }


    @AfterClass
    public void cleanUp()
    {
        driver.quit();
    }
}
