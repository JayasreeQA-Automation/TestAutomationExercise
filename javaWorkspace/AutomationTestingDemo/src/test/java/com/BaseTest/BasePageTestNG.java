package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BasePageTestNG {

	protected WebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;

	@BeforeSuite
	public void beforeSuiteSetup() {
		System.out.println("BeforeSuite: Initializing Extent Reports.");
		// Setting up Extent Reports
	}

	@BeforeClass
	public void setup() {
		System.out.println("BeforeClass: setUpMethod : Initializing WebDriver...");
		driver = new ChromeDriver(); //I used ChromeDriver and we use any WebDriver like FirefoxDriver, EdgeDriver, etc.
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("AfterClass: Closing WebDriver...");
		if (driver != null) {
			driver.quit(); // Close browser and end WebDriver session
		}

	}
}
