package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchPage {
	
	@FindBy(xpath="//div[@class='secondary']")
	private List<WebElement> sourceDestination;
	
	@FindBy(xpath="//div[@class='primary duration-emphasis']")
	private List<WebElement> duration;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySourceDestination(String srcDest)
	{
		int cntr=0;
		int cntr1=0;
		for(WebElement e:sourceDestination)
		{
			try
			{
				if(e.getText().equalsIgnoreCase(srcDest))
				{
					//Reporter.log("Source and Destinations are matching",true);
					cntr++;
				}
			}
			catch(Exception exp)
			{
				//Reporter.log("Source and Destinations are not matching",true);
				cntr1++;
			}
		}
		Reporter.log(cntr+" matching Source and Destination flights ",true);
		Reporter.log(cntr1+" not matching Source and Destination flights ",true);
		
	}
	
	public void printSourceDestination()
	{
		for(WebElement w:sourceDestination)
		{
			Reporter.log(w.getText(),true);
		}
	}
	

}
