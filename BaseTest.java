package runCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

@BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();
    driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
}
@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
