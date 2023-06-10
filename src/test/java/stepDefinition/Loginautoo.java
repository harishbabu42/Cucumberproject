package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import harishacademygroup.Cucumberproject.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginautoo extends Base {

	WebDriver driver;
	

	@Given("launch browser and go to google")
	public void launch_browser_and_go_to_google() throws IOException {
		// Write code here that turns the phrase above into concrete actions

		driver = initializeDriver();
		driver.get("https://www.google.com/");

	}

	@When("search with {string}")
	public void search_with(String name) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	@Then("take the screenshot")
	public void take_the_screenshot() throws IOException {
		// Write code here that turns the phrase above into concrete actions

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\Screenshots\\1.png"));
		
	}

}
