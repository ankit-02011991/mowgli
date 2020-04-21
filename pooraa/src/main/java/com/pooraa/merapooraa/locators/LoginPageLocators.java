package com.pooraa.merapooraa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators {

	private static WebElement element = null;

	
	/*public static WebElement MeraPooraaTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".main_form .title"));
		return element;
	}
	*/

	
	public static WebElement MeraPooraaUsername(WebDriver driver) {
		element = driver.findElement(By.id("usr"));
		return element;
	}

	
	public static WebElement MeraPooraaPassword(WebDriver driver) {
		element = driver.findElement(By.id("pwd"));
		return element;
	}

	
	public static WebElement MeraPooraaLogin(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".btn-login"));
		return element;
	}


	public static WebElement MeraPooraaSeller(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".grey-color"));
		return element;
	}
	
	public static WebElement MeraPooraaProduct(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".prod-name"));
		return element;
	}
		
	public static WebElement MeraPooraaqty(WebDriver driver) {
		element = driver.findElement(By.id("qty"));
		return element;
	}	
		
}

