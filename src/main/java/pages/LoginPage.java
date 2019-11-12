package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(how=How.ID, using=("username")) WebElement eleusername;
	public LoginPage enterUserName() {
		eleusername .sendKeys("demosalesmanager");
		return this;
	}
	@CacheLookup
	@FindBy(id="password") WebElement elepassword;
	public LoginPage enterPassword() {
		elepassword.sendKeys("crmsfa");
		return this;
	}
	
	@CacheLookup
	@FindBy(className="decorativeSubmit") WebElement eleclicklogin;
	
	public HomePage clickLogin() {
		eleclicklogin.click();
		return new HomePage();
	}
	

}



