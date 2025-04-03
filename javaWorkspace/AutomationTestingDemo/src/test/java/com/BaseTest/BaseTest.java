package com.BaseTest;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

//Right-click on your project in the Project Explorer.

//Select Build Path > Configure Build Path.

//Under the Libraries tab, click Add External JARs....

//Add the necessary JAR files (like Selenium JARs, TestNG JARs, etc.) to your project.

//Click Apply and Close.

public class BaseTest {
	
	public WebDriver driver;

	
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver(); // Launch the browser & Initialize the Driver//won't throw NullPointerException
		// Maximize browser window
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("http://automationexercise.com");

		// Click on the login button
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

		// Enter user information
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jaya");
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("contact.jayasreem@gmail.com");
		
		// Click the submit button to create the account
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		// Verify that "Enter Account Information" is visible (Assertion)
        try {
            Assert.assertTrue("Text is not visible", driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the driver after the test
        driver.quit();
    }
		
		
		
		
		
	
	
	public static void main(String[] args) {
		BaseTest test = new BaseTest();
		test.setUp();
		System.out.println("Successfully landed the home page");
		System.out.println("Test execution Completed");
		
		
	}

}
