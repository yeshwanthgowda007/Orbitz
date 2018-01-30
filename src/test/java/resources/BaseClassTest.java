package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClassTest implements Constants {
	//public static Logger log=Logger.getLogger("Driver");
	static
	{
		//log.info("setting the path of Driver Executable");
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser)
	{
//		//log.info("Opening the Browser");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		//log.info("Entering the URL");
//		driver.get("https://www.orbitz.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//log.info("Closing the Browser");
		driver.quit();
	}
	

}
