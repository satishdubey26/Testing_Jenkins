package pages.ToolQA;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ToolQA.Base;
import utility.ToolQA.Utility;
import utility.ToolQA.Xls_Reader;

public class ElementPage extends Utility {
	Actions act=new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Xls_Reader reader=new Xls_Reader("C:\\eclipse\\ToolQA\\Documents\\PersonsAddress.xlsx");
	
	@FindBy(xpath="//span[text()='Text Box']")
	WebElement TextBox;
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement Element;

	@FindBy(xpath="//span[text()='Upload and Download']")
	WebElement UploadandDownload;
	
	@FindBy(xpath="//input[@placeholder='Full Name']")
	WebElement FullName;
	
	@FindBy(xpath="//input[@placeholder='name@example.com']")
	WebElement Email;
	
	@FindBy(xpath="//textarea[@placeholder='Current Address']")
	WebElement CurrentAddress;
	
	@FindBy(id="permanentAddress")
	WebElement permanentAddress;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement Submit;
	
	
	public void TextBox() throws InterruptedException {
		scrollToElement(Element);
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
		logger2.log(Status.PASS, " Element Button Click Succesfully ");

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(TextBox));
		TextBox.click();
		logger2.log(Status.PASS, " TextBox Button Click Succesfully ");

		FullName.sendKeys(reader.getCellData("ContantDetails", 1, 3));
		logger2.log(Status.PASS, " Name Entered Succesfully ");

		Email.sendKeys(reader.getCellData("ContantDetails", 2, 3));
		logger2.log(Status.PASS, " Email Entered Succesfully ");

		CurrentAddress.sendKeys(reader.getCellData("ContantDetails", 3, 3));
		logger2.log(Status.PASS, " Address Entered Succesfully ");

		permanentAddress.sendKeys(reader.getCellData("ContantDetails", 4, 3));
		logger2.log(Status.PASS, " Permanent Address Entered Succesfully ");

		scrollToElement(submit);
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Submit));
		Submit.click();
		logger2.log(Status.PASS, " Submit Button Click Succesfully ");

	
	}
	@FindBy(xpath="//span[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath="//span[text()='Desktop']")
	WebElement Desktop;
	
	@FindBy(xpath="//span[text()='Documents']")
	WebElement Documents;
	
	@FindBy(xpath="//span[text()='Public']")
	WebElement Public;
	
	@FindBy(xpath="//span[text()='Private']")
	WebElement Private;
	
	@FindBy(xpath="//span[text()='Classified']")
	WebElement Classified;
	
	@FindBy(xpath="//span[text()='General']")
	WebElement General;
	
	@FindBy(xpath="//span[text()='Word File.doc']")
	WebElement WordFile;
	
	@FindBy(xpath="//span[text()='Excel File.doc']")
	WebElement ExcelFile;
	
	
	@FindBy(xpath="//span[text()='Check Box']")
	WebElement CheckBox;

	@FindBy(xpath="//button[@title='Expand all']")
	WebElement Expand;
	
	@FindBy(xpath="//span[text()='Commands']")
	WebElement Commands;
	
	@FindBy(xpath="//span[text()='Notes']")
	WebElement Notes;
	
	@FindBy(xpath="//span[text()='React']")
	WebElement React;
		
	@FindBy(xpath="//span[text()='Angular']")
	WebElement Angular;
		
	@FindBy(xpath="//span[text()='Veu']")
	WebElement Veu;
	@FindBy(xpath="//span[text()='WorkSpace']")
	WebElement WorkSpace;

	@FindBy(xpath="//span[text()='Office']")
	WebElement Office;
	
	@FindBy(xpath="//span[text()='Downloads']")
	WebElement Downloads;
	
	public void CheckBox() throws InterruptedException {
		CheckBox.click();
		logger3.log(Status.PASS, " CheckBox Button Click Succesfully ");
		sleep(2000);
		Expand.click();
		logger3.log(Status.PASS, " Expand Button Click Succesfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Commands));
		Commands.click();
		logger3.log(Status.PASS, " Commands Button Click Succesfully ");
		scrollToElement(Notes);
		Notes.click();
		logger3.log(Status.PASS, " Notes Button Click Succesfully ");
		Veu.click();
		logger3.log(Status.PASS, " veu Button Click Succesfully ");
		Angular.click();
		logger3.log(Status.PASS, " Angular Button Click Succesfully ");
		React.click();
		logger3.log(Status.PASS, " React Button Click Succesfully ");
		scrollToElement(Office);
		Office.click();		
		logger3.log(Status.PASS, " Office Button Click Succesfully ");
		Downloads.click();
		logger3.log(Status.PASS, " Download Button Click Succesfully ");

	}
	
	@FindBy(xpath="//span[text()='Radio Button']")
	WebElement RadioButton;

	@FindBy(xpath="//label[text()='Yes']")
	WebElement Yes;
	
	@FindBy(xpath="//label[text()='Impressive']")
	WebElement Impressive;
	
	@FindBy(xpath="//label[text()='No']")
	WebElement No;
	
	public void RadioButton() {
		RadioButton.click();
		logger4.log(Status.PASS, " Radio Button Click Succesfully ");

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Yes));
		Yes.click();
		logger4.log(Status.PASS, " Yes Button Selected ");

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Impressive));
		Impressive.click();
		logger4.log(Status.PASS, " Impressive Button Selected ");

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(No));
		No.click();
		logger4.log(Status.PASS, " No Button is not Selected ");

	}
	
	@FindBy(xpath="//span[text()='Web Tables']")
	WebElement WebTables;

	@FindBy(id="addNewRecordButton")
	WebElement Add;
		
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="age")
	WebElement age;
	
	@FindBy(id="salary")
	WebElement salary;
	
	@FindBy(id="department")
	WebElement department;
	
	@FindBy(id="submit")
	WebElement submit;
	
	
	public void WebTables() {
		WebTables.click();
		logger5.log(Status.PASS, " WebTables Button Click successfully ");
		Add.click();
		logger5.log(Status.PASS, "  Add Button Click Successfully  ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(firstName));
		firstName.sendKeys(reader.getCellData("RegistrationDetails", 1, 3));
		logger5.log(Status.PASS, " FirstName Entered Successfully ");

		lastName.sendKeys(reader.getCellData("RegistrationDetails", 2, 3));
		logger5.log(Status.PASS, " lastname Entered Successfully ");

		userEmail.sendKeys(reader.getCellData("RegistrationDetails", 3, 3));
		logger5.log(Status.PASS, " Email Entered Successfully ");

		age.sendKeys(reader.getCellData("RegistrationDetails", 4, 3));
		logger5.log(Status.PASS, " Age Entered Successfully ");

		salary.sendKeys(reader.getCellData("RegistrationDetails", 5, 3));
		logger5.log(Status.PASS, " Salary Entered Successfully ");

		department.sendKeys(reader.getCellData("RegistrationDetails", 6, 3));
		logger5.log(Status.PASS, " Department Entered Successfully ");

		submit.click();
		logger5.log(Status.PASS, " Submit Button Click Successfully ");

		
	}
	@FindBy(id="searchBox")
	WebElement SearchBox;
	
	@FindBy(id="edit-record-4")
	WebElement editrecord4;
	
	public void WebTablesSearchAndEdit() {
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(SearchBox));
		SearchBox.sendKeys("pankaj");
		logger6.log(Status.PASS, " Text Entered Successfully ");
		editrecord4.click();
		logger6.log(Status.PASS, " Edit Button Clicked Successfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(firstName));
		firstName.clear();
		firstName.sendKeys(reader.getCellData("RegistrationDetails", 1, 4));
		logger6.log(Status.PASS, " Firstname Entered Successfully ");
		lastName.clear();
		lastName.sendKeys(reader.getCellData("RegistrationDetails", 2, 4));
		logger6.log(Status.PASS, " Lastname Entered Successfully ");

		userEmail.clear();
		userEmail.sendKeys(reader.getCellData("RegistrationDetails", 3, 4));
		logger6.log(Status.PASS, " Email Entered Successfully ");

		age.clear();
		age.sendKeys(reader.getCellData("RegistrationDetails", 4, 4));
		logger6.log(Status.PASS, " Age Entered Successfully ");

		salary.clear();
		salary.sendKeys(reader.getCellData("RegistrationDetails", 5, 4));
		logger6.log(Status.PASS, " Salary Entered Successfully ");

		department.clear();
		department.sendKeys(reader.getCellData("RegistrationDetails", 6, 4));
		logger6.log(Status.PASS, " Department Entered Successfully ");

		submit.click();
		logger6.log(Status.PASS, " Submit Button Clicked Successfully ");

	}
	
	@FindBy(xpath="//span[text()='Buttons']")
	WebElement Buttons;
	
	@FindBy(id="doubleClickBtn")
	WebElement DoubleClick;
	
	@FindBy(id="rightClickBtn")
	WebElement RightClick;
	
	@FindBy(xpath="//button[text()='Click Me']")
	WebElement ClickMe;
	
	public void Button() throws InterruptedException {
		scrollToElement(Buttons);
		Buttons.click();
		logger7.log(Status.PASS, " Button Clicked Successfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(DoubleClick));
		act.doubleClick(DoubleClick).perform();
		logger7.log(Status.PASS, " Double Clicked Successfully ");
		act.contextClick(RightClick).perform();
		logger7.log(Status.PASS, " Right Clicked Successfully ");
		ClickMe.click();
		logger7.log(Status.PASS, "Clicked Successfully ");

		
	}
	
	@FindBy(xpath="//span[text()='Links']")
	WebElement Links;
		
	@FindBy(id="simpleLink")
	WebElement SimpleLink;
	
	@FindBy(id="dynamicLink")
	WebElement DynamicLink;
	
	
	public void Links() throws InterruptedException {
		scrollToElement(Links);
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Links));
		Links.click();
		logger8.log(Status.PASS, " Link are Opened Successfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(SimpleLink));
		scrollToElement(SimpleLink);
		windowhandle(SimpleLink);
		logger8.log(Status.PASS, " Link are Opened Successfully ");
		windowhandle(DynamicLink);
		logger8.log(Status.PASS, " Link are Opened Successfully ");

		
	}
	
	@FindBy(xpath="//span[text()='Broken Links - Images']")
	WebElement BrokenLinksImages;
	
	@FindBy(xpath="//img[@src='/images/Toolsqa_1.jpg']")
	WebElement BrokenImage;
	
	@FindBy(xpath="//img[@src='/images/Toolsqa.jpg']")
	WebElement Image;
	
	@FindBy(xpath="//a[text()='Click Here for Valid Link']")
	WebElement ValidLink;
	
	@FindBy(xpath="//a[text()='Click Here for Broken Link']")
	WebElement InvalidLink;
	
	public void BrokenLinksAndImages() {
	BrokenLinksImages.click();
	logger9.log(Status.PASS, " Broken link image clicked Successfully ");

	isImageBroken(Image);
	logger9.log(Status.PASS, "image is open successfully ");

	isImageBroken(BrokenImage);
	logger9.log(Status.PASS, " Its a Broken Image");

	new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(ValidLink));
	LinkVerification(ValidLink);
	logger9.log(Status.PASS, " This link are valid link ");

	LinkVerification(InvalidLink);
	logger9.log(Status.PASS, " This are invalid link ");

	}
	
	@FindBy(id="downloadButton")
	WebElement Download;
	
	public void Download() throws InterruptedException {
		scrollToElement(UploadandDownload);
		UploadandDownload.click();
		logger10.log(Status.PASS, " Upload and Download Page open Successfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Download));
		Download.click();
		logger10.log(Status.PASS, "Download Button Clicked Successfully ");
		sleep(5000);
		Assert.assertTrue(isFileDownloaded("C:\\Users\\rj\\Downloads", "sampleFile.jpeg"), "Failed to download Expected document");
		logger10.log(Status.PASS, " File is downloaded successfully ");

	}
	
	@FindBy(id="uploadFile")
	WebElement UploadFile;
	
	public void UploadFile() {
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(UploadFile));
		UploadFile.sendKeys("C:\\Users\\rj\\Downloads\\sampleFile.jpeg");
		logger11.log(Status.PASS, " File is uploaded successfully ");
		sleep(2000);
	}
	
	@FindBy(xpath="//span[text()='Dynamic Properties']")
	WebElement DynamicProperties;
	
	@FindBy(id="enableAfter")
	WebElement EnableAfter;
	
	@FindBy(id="colorChange")
	WebElement ColorChange;
	
	@FindBy(id="visibleAfter")
	WebElement VisibleAfter;
	
	@FindBy(xpath="//div[text()='Forms']")
	WebElement Forms;
	public void DynamicProperties() throws Exception {
		scrollToElement(DynamicProperties);
		DynamicProperties.click();
		logger12.log(Status.PASS, " Dynamic Properties Page Open successfully ");
		EnableAfter.isEnabled();
		logger12.log(Status.PASS, " Button is Enable ");
		ColorChange.click();
		VisibleAfter.isDisplayed();
		sleep(6000);
		EnableAfter.click();
		ColorChange.click();
		logger12.log(Status.PASS, " Color of text Change successfully ");
		VisibleAfter.click();
		scrollToElement(Forms);
		
	}
}
