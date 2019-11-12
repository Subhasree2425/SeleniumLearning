package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		return this;
		
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subasree");
		return this;
		
	}
	
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramalingam");
		return this;
		
	}
	
	public ViewLead clickOnCreateBox() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLead();
		
	}
	
	
	
	
	
	
}
