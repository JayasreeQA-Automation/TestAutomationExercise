package com.BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageTestNG {
	WebDriver driver;

	@FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
	WebElement logoImg;

	@FindBy(xpath = "//i[@class='fa fa-home']")
	WebElement home;

	@FindBy(xpath = "//a[@href=\"/products\"]")
	WebElement products;

	@FindBy(xpath = "(//a[@href=\"/view_cart\"])[1]")
	WebElement cart;

	@FindBy(xpath = "//a[@href=\"/login\"]")
	WebElement login;

	// Constructor to initialize the driver and PageFactory elements
	public HomePage(WebDriver driver) {
		this.driver = driver; // Initialize driver
		PageFactory.initElements(driver, this); // Initialize PageFactory elements
	}

	public void clickProducts() {
		products.click();
	}

	public void clickcart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
	}

	public void clickLogin() {
		login.click();
	}

	public void verifyLogoIsDisplayed() {
		if (logoImg.isDisplayed()) {
			System.out.println("Logo is displayed.");
		} else {
			System.out.println("Logo is not displayed.");
		}
	}

}
