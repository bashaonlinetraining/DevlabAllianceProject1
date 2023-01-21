package com.skyscanner.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.skyscanner.seleniumutilities.SeleniumWebElements;

public class HeaderPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//span[text()='Flights'])[1]")
	private WebElement flightLnk;
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTabLink(String tabName) throws Exception {
		String locator = "(//span[text()='"+tabName+"'])[1]";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		WebElement element = driver.findElement(By.xpath(locator));
		SeleniumWebElements.clickByJavaScript(element);
	}
	

}
