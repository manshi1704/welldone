package step_Definition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class step_def {
	
	 WebDriver driver;
	  
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_d4.05.02\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   
	   driver.get("http://localhost:8083/TestMeApp/");
	   driver.manage().window().maximize();
	  
	}
	
	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page()
	{
		 driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters{string} and {string}")
	public void user_enters_and(String username, String password) {
	driver.findElement(By.name("userName")).click();
	driver.findElement(By.name("userName")).sendKeys(username);
	driver.findElement(By.name("password")).click();
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("Login")).click();
	driver.findElement(By.linkText(" SignOut")).getText();
	//Assert.assertEquals(" Sign Out", "driver.findElement(By.linkText(\" SignOut\")).getText()");
	}


	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		
	}


}
