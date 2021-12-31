package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonImplementation extends BaseClass{
	
	/*
	 * @Given("Open the chromebrowser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver =new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 * 
	 * @And("Load the url as {string}") public void
	 * load_the_application_url_as(String url) {
	 * driver.get("http://leaftaps.com/opentaps"); }
	 */	
	@Given("Enter the username as {string}")
    public void enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@And("Enter the password as {string}")
    public void enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("Click the login button")
	public void click_the_login_button() {
	  driver.findElement(By.className("decorativeSubmit")).click();
	}

	/*
	 * @When("Click the login button") public void verifyHomepage() {
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 */
		/*
		 * boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		 * if(displayed) { System.out.println("Homepage is Displayed"); }else {
		 * System.out.println("Homepage is loading"); }
		 */
	

	/* } */
	/*
	 * @But("Error should be displayed") public void errorMessage() {
	 * System.out.println("THE MESSAGE IS DISPLAYED"); }
	 */
	@When("Click the CRM\\/SFA link")
	public void click_the_crm_sfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	   
	}
	@When("Click the leads tab link")
	public void leadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
	

}
