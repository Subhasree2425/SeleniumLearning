package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText="Leads") WebElement eleClickLead;
	
	public LeadPage clickLead() {
		
		eleClickLead.click();
		return new LeadPage();
	}
	
 
}
