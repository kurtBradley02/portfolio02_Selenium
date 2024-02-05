package A_Models;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestModel01 {
	
    public WebDriver driver;
	
	@BeforeTest
	public void initiate() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	}

	
	@AfterTest
	public void endTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
