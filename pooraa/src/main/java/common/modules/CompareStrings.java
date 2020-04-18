package common.modules;

import java.net.MalformedURLException;
import java.net.URL;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

import utility.Log;

public class CompareStrings {

	// below function used to Compare two URLs
	public static WebDriver CompareURLs(WebDriver driver, URL CompareURL) throws MalformedURLException, InterruptedException {
		// Wait for 2 sec for page load
		Thread.sleep(2000);
		// get current url
		URL Url = new URL(driver.getCurrentUrl());
		Log.info("User redirected to " + Url);
		// Compare with expected URL
		Assert.assertEquals(Url, CompareURL);
		Log.info("URLs are not equals");
		return driver;
	}

	// below function used to Compare two String
	public static WebDriver CompareTwoStrings(WebDriver driver, String HeadingActualText, String ExpectedText) {
		// compare two strings
		Assert.assertEquals(HeadingActualText, ExpectedText);
		Log.info("Strings are equals");
		return driver;
	}
	
	// below function used to Compare two String
	public static WebDriver ContainSubstring(WebDriver driver, String HeadingActualText, String ExpectedText) {
		// Check substring
		Assert.assertTrue(HeadingActualText.contains(ExpectedText));
		Log.info("Substring Available");
		return driver;
	}

}
