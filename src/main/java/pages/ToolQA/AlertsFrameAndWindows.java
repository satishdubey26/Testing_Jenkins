package pages.ToolQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import utility.ToolQA.Utility;
public class AlertsFrameAndWindows extends Utility {

	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement AlertsFrameWindows;
	
	@FindBy(xpath="//span[text()='Browser Windows']")
	WebElement BrowserWindows;
	
	@FindBy(id="tabButton")
	WebElement NewTab;
	
	@FindBy(id="windowButton")
	WebElement NewWindow;
	
	@FindBy(id="messageWindowButton")
	WebElement NewWindowMessage;
	
	
	public void BrowserWindows() throws Exception{
		scrollToElement(AlertsFrameWindows);
		AlertsFrameWindows.click();
		logger13.log(Status.PASS, " Alert,Frame aand window Page open successfully ");
		scrollToElement(BrowserWindows);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BrowserWindows));
		BrowserWindows.click();
		logger13.log(Status.PASS, " BrowserWindow Page Open successfully ");
		windowhandle(NewTab);
		logger13.log(Status.PASS, " New Tap Open successfully ");
		windowhandle(NewWindow);
		logger13.log(Status.PASS, " New Window Open successfully ");
		windowhandle(NewWindowMessage);	
		logger13.log(Status.PASS, " New Window Message Open successfully ");
	}
	
	@FindBy(xpath="//span[text()='Alerts']")
	WebElement Alerts;
	
	@FindBy(id="alertButton")
	WebElement AlterButton;
	
	@FindBy(id="timerAlertButton")
	WebElement AlterButtonAfter5Second;
	
	@FindBy(id="confirmButton")
	WebElement confirmButton;
	
	@FindBy(id="promtButton")
	WebElement promtButton;
	
	public void Alerts() throws Exception {
		scrollToElement(Alerts);
		System.out.print("EDITED");
		
		Alerts.click();
		logger14.log(Status.PASS, " Alert Page Open successfully ");
		AlterButton.click();
		driver.switchTo().alert().accept();
		logger14.log(Status.PASS, " Alert Message Accepted successfully ");
		AlterButtonAfter5Second.click();
		sleep(6000);
		driver.switchTo().alert().accept();
		logger14.log(Status.PASS, " Alert Message Accepted after 5 sec. successfully ");
		confirmButton.click();
		driver.switchTo().alert().dismiss();
		logger14.log(Status.PASS, " Confirm Popup are cancel successfully ");
		promtButton.click();
		driver.switchTo().alert().sendKeys("sattish dubey");
		logger14.log(Status.PASS, " Text Entered successfully ");
		driver.switchTo().alert().accept();	
		logger14.log(Status.PASS, " Text Accepted successfully ");
	}
	@FindBy(xpath="//span[text()='Frames']")
	WebElement Frames;
	
	@FindBy(id="frame2")
	WebElement Frame2;
	
	public void Frames() throws Exception {
		scrollToElement(Frames);
		Frames.click();
		logger15.log(Status.PASS, " Alert Page Open successfully ");
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
		String parenttext= driver.findElement(By.tagName("body")).getText();
		System.out.println("we are inside of first frame"+parenttext);
		driver.switchTo().defaultContent();
		logger15.log(Status.PASS, " We are outside of parent frame ");
		scrollToElement(Frame2);
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame2")));
		scrollToPixcel();
		String childtext= driver.findElement(By.tagName("body")).getText();
		System.out.println("we are inside of Secand frame"+childtext);
		sleep(2000);
		driver.switchTo().defaultContent();	
		logger15.log(Status.PASS, " We are outside of Child frame ");

	}
	
	@FindBy(xpath="//span[text()='Nested Frames']")
	WebElement NestedFrames;
	public void NestedFrames() throws Exception {
		scrollToElement(NestedFrames);
		NestedFrames.click();
		logger16.log(Status.PASS, " Nested Frames Page Open successfully ");
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
		String parenttext= driver.findElement(By.tagName("body")).getText();
		System.out.println("we are inside of "+parenttext);
		new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")));
		String childtext= driver.findElement(By.tagName("body")).getText();
		System.out.println("we are inside of "+childtext);
		driver.switchTo().defaultContent();
		logger16.log(Status.PASS, " We are outside of child frame ");
		driver.switchTo().defaultContent();
		logger16.log(Status.PASS, " We are outside of Parent frame ");

	}
	
	@FindBy(xpath="//span[text()='Modal Dialogs']")
	WebElement ModalDialogs;
	
	@FindBy(id="showSmallModal")
	WebElement SmallModal;
	
	@FindBy(id="showLargeModal")
	WebElement LargeModal;
	
	@FindBy(id="closeSmallModal")
	WebElement closeSmallModal;
	
	@FindBy(id="closeLargeModal")
	WebElement closeLargeModal;
	
	public void ModalDailog() throws Exception {
		scrollToElement(ModalDialogs);
		ModalDialogs.click();
		logger17.log(Status.PASS, " Modal Dialogs Page open successfully ");
		SmallModal.click();
		logger17.log(Status.PASS, "Samall Dialog Display ");
		sleep(2000);
		closeSmallModal.click();
		logger17.log(Status.PASS, "Samall Dialog Window closed successfully ");
		LargeModal.click();
		logger17.log(Status.PASS, "large Dialog Display ");
		sleep(2000);
		closeLargeModal.click();
		logger17.log(Status.PASS, "large Dialog window closed successfully ");

		
	}
}
