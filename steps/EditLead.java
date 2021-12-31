package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	@When("click the find leads link")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();



	}
	@When("Click the phone tab link")

public void phoneTab() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();



}
	@Given("Enter the phone number")

public void phoneNumber() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");



}
	@When("Click the find leads button")

public void findLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();



}
	@When("Click the first link")

public void firstLink() throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();



}
@When("Click the edit buttton link")
public void editButton() {
	driver.findElement(By.linkText("Edit")).click();



}
@Given("Enter edit company name")
public void enterEditCompanyName() {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("tcs");



}
@When("Click the update button")
public void updateButton() {
	driver.findElement(By.name("submitButton")).click();



}
@Then("VErify the update page")
public void verifyUpdatePage() {
	boolean displayed = driver.findElement(By.name("submitButton")).isDisplayed();
	if(displayed) {
		System.out.println("The page is verified ");
	}else {
		System.out.println("other page");
	}




}

}
