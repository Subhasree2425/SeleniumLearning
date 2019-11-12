package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	
	 @CacheLookup
	@FindBy(linkText="CRM/SFA") WebElement eleCrmSfa;
	
	  public MyHomePage clickCRMSFA() {
	  eleCrmSfa.click();
	  return new MyHomePage();
	 
	  }
	
	/*public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}*/
	 
}



