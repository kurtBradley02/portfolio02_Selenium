package B_PageObjects;

import java.io.IOException;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import A_Models.PageModel01;
import io.cucumber.java.en.*;


public class LoginPage extends PageModel01{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@Given("User is logging in Demo Login")
	public void user_is_logging_in_demo_login() {
		driver.get("https://exppractices.web.app/");
	}

	@When("User inputs username {string} and password {string}")
	public void user_inputs_username_and_password(String string, String string2) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id=\"toSubmit\"]")).click();
	}

	@When("User inputs username {string} and wrong password {string}")
	public void user_inputs_username_and_wrong_password(String string, String string2) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id=\"toSubmit\"]")).click();
	}

	@When("User inputs wrong username {string} and password {string}")
	public void user_inputs_wrong_username_and_password(String string, String string2) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id=\"toSubmit\"]")).click();
	}
	
	@Then("Assert on")
	public void assert_on(String scenario) throws IOException {
		
	   WebElement errMsg = driver.findElement(By.xpath("//*[@id=\"testOutput\"]"));
	   Asserts.check(errMsg.isDisplayed(), "Asserts on output is displayed");
	   takeScreenShot("Login - " +scenario);
	   
	}


}
