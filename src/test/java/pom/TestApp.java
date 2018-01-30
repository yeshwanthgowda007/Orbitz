package pom;

import org.testng.annotations.Test;

import resources.BaseClassTest;

public class TestApp extends BaseClassTest {
	
	@Test
	public void testApp() throws InterruptedException
	{
		//log.info("Start-executeSteps");
		HomePage home=new HomePage(driver);
		home.clickFlights();
		home.clickOneWay();
		home.enterFrom("Pune");
		home.enterTo("Bangalore");
		home.enterDateCalender("01/30/2018");
		
		SearchPage search=new SearchPage(driver);
		search.verifySourceDestination("PNQ - BLR");
		
	}
	

}
