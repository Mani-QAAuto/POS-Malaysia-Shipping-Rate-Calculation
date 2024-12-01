package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class caluculateRate {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		//launch the chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to url
		driver.get("https://www.pos.com.my/send/ratecalculator");
		String actualTitle = driver.getTitle();
		//get the title and verify
		Assert.assertTrue(actualTitle.contains("Parcel Shipment"), "Title is Not Matching..!");
		System.out.println("Title is Matching..! " + actualTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void CaluclateRate() {
		// Enter "From" postcode Default country malaysia 
		driver.findElement(By.xpath("//input[@type='number' and @formcontrolname='postcodeFrom']")).sendKeys("35600");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement countryInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-0")));
		// Clear the field
		countryInput.clear();
		// Click on the input field to show the "To" dropdown
		countryInput.click();
		// Type the name of the country(India) in the input field
		countryInput.sendKeys("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// Clicking on the Country (India)
		driver.findElement(By.id("mat-option-50")).click();
		// Entering parcel weight 
		driver.findElement(By.xpath("//input[@type='number' and @placeholder='eg. 0.1kg']")).sendKeys("5");
		// Clicking on Calculate button
		driver.findElement(By.xpath("//a[@type=' button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void VerifyQuotes() {

		// Find the element you want to scroll to
		WebElement targetElement = driver.findElement(By.xpath("//h1[@class='text-3xl font-extrabold text-gray-900 sm:text-4xl']"));

		// Scroll to the element using JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		
		// Getting Text or price of the  first quote to validate
		String quote1_price = driver.findElement(By.xpath("(//h3[@class=\"text-2xl font-extrabold text-blue-900\"])[1]")).getText();
		// Validating the quotes retrieved
		Assert.assertTrue(quote1_price.contains("RM"), "No quotes retrived..!");
		System.out.println("User can see Multiple quotes and shipment options..!");
		System.out.println("The First Quote price is: " + quote1_price);
		
		// Getting Text or price of the  second quote
		String quote2_price = driver.findElement(By.xpath("(//h3[@class=\"text-2xl font-extrabold text-blue-900\"])[2]")).getText();
		System.out.println("The Second Quote price is: " + quote2_price);

	}

	@AfterTest

	public void TearDown() {
		
		//close the browser
		driver.quit();

	}

}
