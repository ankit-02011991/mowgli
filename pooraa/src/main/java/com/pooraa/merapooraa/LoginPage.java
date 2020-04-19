package com.pooraa.merapooraa;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.pooraa.merapooraa.locators.*;
//import common.modules.CompareStrings;
import utility.GetCellDataFromXlsx;
import utility.InitialiseLogging;

public class LoginPage {
	
		public static WebDriver RedirectionToCatalogPage(WebDriver driver)
				throws Exception {
			    InitialiseLogging.IntialiseLoggingLog4j();			
				//Assert.assertTrue(LoginPageLocators.MeraPooraaTitle(driver).isDisplayed(), "");
				//String ExpectedText = GetCellDataFromXlsx.GetCellData("merapooraa", "String", "loginpage", 1, 0);
				//String ActualText = LoginPageLocators.MeraPooraaTitle(driver).getText();
				// compare both strings
				//CompareStrings.CompareTwoStrings(driver, ActualText, ExpectedText);
				
				Assert.assertTrue(LoginPageLocators.MeraPooraaUsername(driver).isDisplayed(), "");
				LoginPageLocators.MeraPooraaUsername(driver)
						.sendKeys(GetCellDataFromXlsx.GetCellData("merapooraa", "Numeric", "loginpage", 1, 3));
				Thread.sleep(1000);
				
				Assert.assertTrue(LoginPageLocators.MeraPooraaPassword(driver).isDisplayed(), "");
				LoginPageLocators.MeraPooraaPassword(driver)
						.sendKeys(GetCellDataFromXlsx.GetCellData("merapooraa", "Numeric", "loginpage", 1, 5));
				Thread.sleep(1000);
				
			
				LoginPageLocators.MeraPooraaLogin(driver).click();
			return driver;
		}

}
