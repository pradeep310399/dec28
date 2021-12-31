package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	@When("Click the createleads button link")
	public void createLeadButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		
	}
	@And("Enter the company name")
	public void companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
	}
	@And("Enter the first name")
	public void firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeepkumar");
		
	}
	@And("Enter the last name")
	public void lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Namachivayam");
		
	}
	@When("Click the create lead button")
	public void clickCreateLead() {
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	@Then("Created lead is displayed")
	public void verifyCreateLead() {
		boolean displayed = driver.findElement(By.className("smallSubmit")).isDisplayed();
		if(displayed) {
			System.out.println("CreateLead page is displayed");
		}else {
			System.out.println("page in error");
		}
		}

}
