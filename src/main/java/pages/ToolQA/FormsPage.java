package pages.ToolQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import utility.ToolQA.Utility;

public class FormsPage extends Utility {
	
	@FindBy(xpath="//h5[text()='Forms']")
	WebElement Forms;
	
	@FindBy(xpath="//span[text()='Practice Form']")
	WebElement PracticeForm;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement Male;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement Female;
	
	@FindBy(xpath="//label[text()='Other']")
	WebElement Other;
	
	@FindBy(id="userNumber")
	WebElement Mobile;
	
	@FindBy(id="dateOfBirthInput")
	WebElement DOB;
	
	@FindBy(id="currentAddress")
	WebElement CurrentAddress;
	
	@FindBy(xpath="//div[text()='26']")
	WebElement Day;
	
	@FindBy(xpath="//label[text()='Music']")
	WebElement Music;
	
	@FindBy(id="uploadPicture")
	WebElement uploadPicture;
	
	@FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
	WebElement State;
	
	@FindBy(xpath="//div[text()='Select City']")
	WebElement City;
	
	@FindBy(xpath="//div[text()='Haryana']")
	WebElement Haryana;
	
	@FindBy(xpath="//div[text()='Karnal']")
	WebElement Karnal;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(id="closeLargeModal")
	WebElement Close;
	
	@FindBy(xpath="//img[@alt='adplus-dvertising']")
	WebElement Adv;
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement Element;
	
	
	public void PracticeForm() throws Exception {
		scrollToElement(Element);
		Forms.click();
		logger1.log(Status.PASS, " Button Click Succesfully ");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(PracticeForm));
		PracticeForm.click();
		logger1.log(Status.PASS, " Form Button Click Succesfully ");

		firstName.sendKeys(reader.getCellData("RegistrationDetails", 1, 3));
		logger1.log(Status.PASS, " Nmae Entered Succesfully ");

		lastName.sendKeys(reader.getCellData("RegistrationDetails", 2, 3));
		logger1.log(Status.PASS, " lastname entered Succesfully ");

		userEmail.sendKeys(reader.getCellData("RegistrationDetails", 3, 3));
		logger1.log(Status.PASS, " Email Entered Succesfully ");

		Male.click();
		logger1.log(Status.PASS, " Gender is Selected Succesfully ");

		Mobile.sendKeys(reader.getCellData("RegistrationDetails", 7, 3));
		logger1.log(Status.PASS, " Number Entered Succesfully ");

		DOB.click();
		logger1.log(Status.PASS, " DOB Entered Succesfully ");

		Select months=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		months.selectByVisibleText("January");
		year.selectByVisibleText("1992");
		Day.click();

		uploadPicture.sendKeys("C:\\Users\\rj\\Downloads\\sampleFile.jpeg");
		logger1.log(Status.PASS, " Picture Uploaded Succesfully ");

		scrollToElement(submit);
		CurrentAddress.sendKeys(reader.getCellData("ContantDetails", 3, 3));
		logger1.log(Status.PASS, " Address Entered Succesfully ");

		Music.click();
		logger1.log(Status.PASS, " Music Selected Succesfully ");

		State.click();
		logger1.log(Status.PASS, " Button Click Succesfully ");

		Haryana.click();
		logger1.log(Status.PASS, " State Selected Succesfully ");

		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(City));
		City.click();
		Karnal.click();
		logger1.log(Status.PASS, " City Selected Succesfully ");

		submit.click();
		Adv.click();
		sleep(5000);
		scrollToElement(Close);
		sleep(1000);
		Close.click();
		logger1.log(Status.PASS, " Registration succesfully completed ");

	}

}
