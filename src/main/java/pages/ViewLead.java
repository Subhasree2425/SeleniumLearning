package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods {
	
	public void verifyFisrtName() {
	
	String verifyFirstName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	  
	  if(verifyFirstName.contains("Subasree"))
	  {	  
	  System.out.println("First Name is verified");
	 } 
	  
	  else {
	  System.out.println("First Name is not verified"); 
	  } 
	  
	 // public void 
	 // driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	
	}	

}
