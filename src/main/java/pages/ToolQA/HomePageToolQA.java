package pages.ToolQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.ToolQA.Base;

public class HomePageToolQA extends Base {
	
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement Element;
	
	@FindBy(xpath="//h5[text()='Forms']")
	WebElement Forms;
	
	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement AlertsFrameWindows;
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement Widgets;
	
	@FindBy(xpath="//h5[text()='Interactions']")
	WebElement Interactions;
	
	@FindBy(xpath="//h5[text()='Book Store Application']")
	WebElement BookStoreApplication;
	
	public void ValidateHomePage() {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Element.isDisplayed();
		Forms.isDisplayed();
		AlertsFrameWindows.isDisplayed();
		Widgets.isDisplayed();
		Interactions.isDisplayed();
		
	}
}
