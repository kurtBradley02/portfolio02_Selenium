package A_Models;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class PageModel01 {
	
	public WebDriver driver;

	public PageModel01(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public void takeScreenShot(String module) throws IOException {
		   // Take screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save screenshot to a file
        
        String filename = module + "  - screenshot_" + System.currentTimeMillis() + ".png";
        
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        
        FileUtils.copyFile(screenshot, new File("C:\\Users\\kurtb\\eclipse-workspace\\SampleSelenium\\artifacts\\"+formattedDate+"\\"+filename+".png"));

	}

}
