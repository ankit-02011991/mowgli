package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitialiseBrowsersAndCaptureScreenshot {
	// declare webdriver
	public static WebDriver driver;

	// function to initialize driver (launch browser to execute test)
	public WebDriver initialiseDriver(String browser) throws IOException {
		// read data from properties file
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("properties\\data.properties");
		prop.load(fis);

		String browserName = browser;
		// fetch Chrome driver path from properties file
		String ChromedriverPath = prop.getProperty("ChromedriverPath");
		
		
		// fetch firefox driver path
		String firefoxdriverPath = prop.getProperty("firefoxdriverPath");
		System.setProperty("testlog.name", "C:\\");
		if (browserName.equals("Chrome")) {
			// Set system property and GeckoDriver Path
			System.setProperty("webdriver.chrome.driver", ChromedriverPath);
			// Then create a new instance on Chrome driver
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			// Set system property and GeckoDriver Path
			System.setProperty("webdriver.gecko.driver", firefoxdriverPath);
			// Then create a new instance on firefox driver
			driver = new FirefoxDriver();
		} else {
			System.out.println("Incorrect Browser Name");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void captureScreenshot(String methodName) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("properties\\data.properties");
		prop.load(fis);
		// fetch ScreenshotPath path from properties file
		String ScreenshotsPath = prop.getProperty("ScreenshotsPath");
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(ScreenshotsPath + methodName + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
