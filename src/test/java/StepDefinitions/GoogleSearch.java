package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class GoogleSearch {
	
	WebDriver driver;
	@Given("browser is launched")
	public void browser_is_launched() {
		
		String ProjectPath=System.getProperty("user.dir");
		
		System.out.println(ProjectPath);
	    System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://flipkart.com");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}

	@And("user enters the text on searchbox")
	public void user_enters_the_text_on_searchbox() throws InterruptedException {
		System.out.println("output2"); 
		driver.findElement(By.xpath("(//*[@title='Search for Products, Brands and More'])[2]")).sendKeys("Mobiles");
	Thread.sleep(5000);
	}

	@When("user hits enter")
	public void user_hits_enter() {
		driver.findElement(By.xpath("(//*[@title='Search for Products, Brands and More'])[2]")).sendKeys(Keys.ENTER);
		System.out.println("output3");  
	}

	@Then("Search results are displayed")
	public void search_results_are_displayed() {
		System.out.println("output4");
		driver.quit();
	}
}
