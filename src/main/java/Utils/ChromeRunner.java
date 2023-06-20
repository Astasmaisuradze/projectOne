package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void openChrome(){
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
    }

    @AfterTest
    public void closeChrome(){
       driver.close();
    }

}
