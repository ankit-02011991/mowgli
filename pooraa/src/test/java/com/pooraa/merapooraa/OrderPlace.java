package com.pooraa.merapooraa;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pooraa.merapooraa.locators.*;
import com.pooraa.merapooraa.LoginPage;
import common.modules.CompareStrings;
import utility.GetCellDataFromXlsx;
import utility.InitialiseBrowsersAndCaptureScreenshot;
import utility.InitialiseLogging;
import utility.Log;

public class OrderPlace extends InitialiseBrowsersAndCaptureScreenshot {
	

	// Initialize variable to store lead id from response
	//public static String LeadId = "";

@BeforeClass // it will launch browser only once and execute all test cases on single  instance of browser.
@Parameters({ "URL", "browser" }) // Take URL and browser value from XML file ,Initialize browser and navigate to Paisabazaar home page
public void OpenHomePage(String URL, String browser) throws IOException {
driver = initialiseDriver(browser);
driver.navigate().to(URL);
driver.manage().window().maximize();
InitialiseLogging.IntialiseLoggingLog4j();
}

@AfterClass
public void CloseCurrentSession() {
// After executing all test cases close current window.
//driver.close();
}

@BeforeMethod
public void BeforeMethod() throws IOException {
InitialiseLogging.IntialiseLoggingLog4j();
}

@Test(priority = 0)
@Parameters({ "URL" })
public void VerifyMeraPooraaURL(String URL) throws Exception {
Log.info("Check current URL");
String currentURL = driver.getCurrentUrl();
String ExpectedURL = GetCellDataFromXlsx.GetCellData("CreditCard", "String", "CreditCardsLandingPage", 1, 1);
CompareStrings.CompareTwoStrings(driver, currentURL, ExpectedURL);
Log.endTestCase("URL compared");
}


@Test(priority = 1)
public void FillLoginPage() throws Exception {
	LoginPage.RedirectionToCatalogPage(driver);
	Log.endTestCase("Test Case ended");
}

}
