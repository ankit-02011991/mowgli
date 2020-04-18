package com.pooraa.merapooraa;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.pooraa.merapooraa.locators.*;
import common.modules.CompareStrings;
import utility.GetCellDataFromXlsx;
import utility.InitialiseLogging;

public class LoginPage {
	
		public static WebDriver RedirectionToQuotePage(WebDriver driver)
				throws Exception {
			    InitialiseLogging.IntialiseLoggingLog4j();			
				Assert.assertTrue(ApplyCreditCards.CreditCardTitleOnApplyForm(driver).isDisplayed(), "");
				String ExpectedText = GetCellDataFromXlsx.GetCellData("CreditCard", "String", "CreditCardsLandingPage", 1, 5);
				String ActualText = ApplyCreditCards.CreditCardTitleOnApplyForm(driver).getText();
				// compare both strings
				CompareStrings.CompareTwoStrings(driver, ActualText, ExpectedText);
				
				Assert.assertTrue(ApplyCreditCards.MobileNoOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.MobileNoOnApplyForm(driver)
						.sendKeys(GetCellDataFromXlsx.GetCellData("CreditCard", "Numeric", "CreditCardsLandingPage", 1, 6));
				
				Assert.assertTrue(ApplyCreditCards.MonthlyIncomeOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.MonthlyIncomeOnApplyForm(driver)
						.sendKeys(GetCellDataFromXlsx.GetCellData("CreditCard", "Numeric", "CreditCardsLandingPage", 1, 7));
				
				Assert.assertTrue(ApplyCreditCards.pincodeOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.pincodeOnApplyForm(driver)
						.sendKeys(GetCellDataFromXlsx.GetCellData("CreditCard", "Numeric", "CreditCardsLandingPage", 1, 8));
				ApplyCreditCards.pincodesuggestionOnApplyForm(driver).click();
				
				Assert.assertTrue(ApplyCreditCards.DoYouHaveAnyCreditCardDropDownOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.DoYouHaveAnyCreditCardDropDownOnApplyForm(driver).click();
				Assert.assertTrue(ApplyCreditCards.PQ1ModalHeaderNoCardOptionCheckBoxOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.PQ1ModalHeaderNoCardOptionCheckBoxOnApplyForm(driver).click();
				ApplyCreditCards.PQ1ModalHeaderDoneButtonCheckBoxOnApplyForm(driver).click();
				Assert.assertTrue(ApplyCreditCards.ViewOffersButtonOnApplyForm(driver).isDisplayed(), "");
				ApplyCreditCards.ViewOffersButtonOnApplyForm(driver).click();
			return driver;
		}

}
