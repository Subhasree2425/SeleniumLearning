package testCases;

/*import javax.security.auth.login.LoginContext;*/

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;


public class TC001_LoginLogout extends ProjectSpecificMethods {
	
	//public static webDriver driver;
	@Test
	public void tC001_LoginLogout() {
		
		LoginPage obj = new LoginPage();
	    obj.enterUserName()
	    .enterPassword()
	    .clickLogin();
	    /*.clickLogout();*/
	       
		
	}
	
	
	
	  

}