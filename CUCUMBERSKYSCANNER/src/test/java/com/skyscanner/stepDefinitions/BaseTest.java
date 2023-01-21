package com.skyscanner.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BaseTest {

	public static WebDriver driver;

	 public static WebDriver getDriver() {
	        return driver;
	  }
	 
	public static WebDriver lauchBrowser(String browserName, String url) {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\CUCUMBERSKYSCANNER\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "FireFox":
			System.setProperty("webdriver.geckodriver.driver", "/BrowserDrivers/firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "/BrowserDrivers/internetexplorer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		default:
			driver = null;
		}
		return driver;
	}

}
