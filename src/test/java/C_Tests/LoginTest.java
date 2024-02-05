package C_Tests;


import org.testng.annotations.Test;

import A_Models.TestModel01;
import B_PageObjects.LoginPage;
import io.cucumber.java.en.When;

public class LoginTest extends TestModel01{
	
	@Test(priority = 0)
	public void LoginSuccess() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		
		login.user_is_logging_in_demo_login();
		login.user_inputs_username_and_password("admin","admin");
		login.assert_on();
		
		Thread.sleep(5000);
		
		System.out.println("Login Success - finished");

	}
	
	@Test(priority = 1)
	public void LoginWrongPassword() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		
		login.user_is_logging_in_demo_login();
		login.user_inputs_username_and_wrong_password("admin","admi");
		login.assert_on();
		
		Thread.sleep(5000);
		
		System.out.println("Login Wrong Password - finished");

	}
	
	@Test(priority = 2)
	public void LoginWrongUsername() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		
		login.user_is_logging_in_demo_login();
		login.user_inputs_wrong_username_and_password("admi","admin");
		login.assert_on();
		
		Thread.sleep(5000);
		
		System.out.println("Login Wrong Username - finished");

	}
}
