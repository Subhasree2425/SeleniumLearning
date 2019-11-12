package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods {
	
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLeadPage();    
	}
}