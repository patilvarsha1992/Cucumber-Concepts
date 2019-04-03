package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefination {
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://leadferret.com/login");
	}

	@When("^Title of login page is LeadFerret Login$")
	public void title_of_login_page_is_LeadFerret_Login() {
		String title=driver.getTitle();
		System.out.println("title:-"+title);
		Assert.assertEquals("LeadFerret", title);
	    
	    
	}
	
//	@Then("^Enter user name and password$")
//	public void enter_user_name_and_password(){
//		System.out.println("loging---");
////		driver.findElement(By.id("req1")).sendKeys("varsha");
//		driver.findElement(By.xpath("//input[@id='req1']")).sendKeys("varsha");
//		driver.findElement(By.id("req2")).sendKeys("password");
//	}
	
//	***********By simple data driven******************
	//@Then("^Enter user \"(.*)\" and  \"(.*)\"$") (or)
//	@Then("^Enter user \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_user_and(String uName, String password)  {
//		System.out.println("loging---");
//		driver.findElement(By.xpath("//input[@id='req1']")).sendKeys(uName);
//		driver.findElement(By.id("req2")).sendKeys(password);
//		
//	}
	
//	***********By example keyword ******************
	//@Then("^Enter user \"(.*)\" and  \"(.*)\"$") (or)
//	@Then("^Enter user \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_user_and(String uName, String password)  {
//		System.out.println("loging---");
//		driver.findElement(By.xpath("//input[@id='req1']")).sendKeys(uName);
//		driver.findElement(By.id("req2")).sendKeys(password);
//		
//	}
	
//  ********* By Datatable with list ******************
//	@Then("^Enter user userName and password$")
//	public void enter_user_userName_and_password(DataTable dataTable){
//		List<List<String>> data=dataTable.raw();
//		System.out.println("loging---");
//		driver.findElement(By.xpath("//input[@id='req1']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("req2")).sendKeys(data.get(0).get(1));
//		
//	}
	
//  ********* By Datatable with Map (parameterization you test cases with multiple set of data) ******************
	@Then("^Enter user userName and password$")
	public void enter_user_userName_and_password(DataTable credentials){
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			System.out.println("loging---");
			driver.findElement(By.xpath("//input[@id='req1']")).sendKeys(data.get("Username"));
			driver.findElement(By.id("req2")).sendKeys(data.get("Password"));
			driver.findElement(By.xpath("//input[@id='req1']")).clear();
			driver.findElement(By.id("req2")).clear();;
			
			
		}
		
	}
//	@Then("^User click on login button$")
//	public void user_click_on_login_button() {
//	    
//	    
//	}
	
	@Then("^User is on HomePage$")
	public void user_is_on_HomePage() {
		
		driver.findElement(By.id("brandTopLeft")).click();
	    
	    
	}
	
	@Then("^Close browser$")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
}
