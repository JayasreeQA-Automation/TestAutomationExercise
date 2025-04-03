package com.BaseTest;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



public class TestAutomationExercise extends BasePageTestNG {

	@Test
	public void testClickMethods() {
		HomePage homePage = new HomePage(driver);
		homePage.clickcart();
		homePage.clickProducts();
		homePage.clickLogin();
		homePage.verifyLogoIsDisplayed();
	}

}
