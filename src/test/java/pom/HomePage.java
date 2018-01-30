package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//span[text()='Flights']")
	private WebElement flights;
	
	@FindBy(id="flight-type-one-way-label")
	private WebElement oneWay;
	
	@FindBy(xpath="//input[@id='flight-origin']")
	private WebElement from;
	
	@FindBy(xpath="//input[@id='flight-destination']")
	private WebElement to;
	
	@FindBy(xpath="//button[@id='search-button']")
	private WebElement search;
	
	@FindBy(xpath="//input[@id='flight-departing']")
	private WebElement calender;
	
	@FindBy(xpath="//button[text()='30']")
	private WebElement day;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlights()
	{
		flights.click();
	}

	public void clickOneWay()
	{
		oneWay.click();
	}
	
	public void enterFrom(String fromAdd)
	{
		from.sendKeys(fromAdd);
	}
	
	public void enterTo(String toAdd)
	{
		to.sendKeys(toAdd);
	}
	
	public void clickSearch()
	{
		search.click();
		
	}
	
	public void enterDateCalender(String date)
	{
		calender.sendKeys(date);

		calender.sendKeys(Keys.ENTER);
	}
}
