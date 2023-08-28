package pages.ToolQA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utility.ToolQA.Utility;

public class WidgetsPage extends Utility {
	
	@FindBy(xpath="//div[text()='Widgets']")
	WebElement widgets;
		
	@FindBy(xpath="//span[text()='Date Picker']")
	WebElement DatePicker;
	
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement Element;
	
	
	@FindBy(id="datePickerMonthYearInput")
	WebElement el;
	
	@FindBy(id="dateAndTimePickerInput")
	WebElement el2;
	
	
    String str="";
	public void selectDate() throws InterruptedException {
		scrollToElement(Element);
		Element.click();
		scrollToElement(widgets);
		System.out.println("Hello");
		widgets.click();
		System.out.println("Hello once again");
		DatePicker.click();
		sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", el);
		sleep(2000);
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
        cl.add(Calendar.DAY_OF_YEAR, 15);
		dt=cl.getTime();
		String str = df.format(dt);
		    System.out.println("the date today is " + str);  
		    String[] nextdate=str.split("/");
		    String month=nextdate[0];
		    String Day=nextdate[1];
		    String Year=nextdate[2];
		sleep(5000);
		el.click();
		sleep(2000);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();

		sleep(5000);
		el.sendKeys(str);
		sleep(10000);
	    WebElement nextDay=driver.findElement(By.xpath("//div[text()=" + Day + "]"));
	    nextDay.click();

	//.sendKeys(Keys.TAB);
		sleep(10000);
//		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		cal.add(Calendar.DATE, 2);
//		String newDate = dateFormat.format(cal.getTime());
//		el2.sendKeys(newDate);
//		sleep(10000);	
	}
	
	
	@FindBy(xpath = "//span[text()='Slider']")
	WebElement Slider;
	
	@FindBy(className="range-slider range-slider--primary")
	WebElement sliderPoint;
	
	public void slider() throws InterruptedException {
		scrollToElement(Element);
		Element.click();
		scrollToElement(widgets);
		widgets.click();
		Thread.sleep(10000);
		Slider.click();
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.click(sliderPoint);
		action.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(10000);

		
	}

}
