package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppSteps {
	
	WebDriver driver;
	@Given("application is launched")
	public void application_is_launched() {
	 String filepath=System.getProperty(("user.dir"));
	 System.setProperty("webdriver.chromedriver.driver", filepath+"/src/test/resources/Drivers/chromedriver.exe");
	 driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}

	@Given("user enters the (.*) and (.*)")
	public void user_enters_the_username_and(Integer int1) {
	  
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(null);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(null);

	}

	@When("user clicks on logon")
	public void user_clicks_on_logon() {
		driver.findElement(By.xpath("//*[@id='login']")).click();
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
	    System.out.println("logged in successfully");
	}




}
