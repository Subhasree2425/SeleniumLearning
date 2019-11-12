package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{

	@Test
	public void tC002_CreateLead() {
		
		LoginPage obj = new LoginPage();
	    obj.enterUserName()
	    .enterPassword()
	    .clickLogin()
	    .clickCRMSFA()
	    .clickLead()
	    .clickCreateLead()
	    .enterCompanyName()
	    .enterFirstName()
	    .enterLastName()
	    .clickOnCreateBox()
	    .verifyFisrtName();
	    
	    
	    
	}
	
	
}
