package companiesStepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCompaniesStepDefination {
	
	
WebDriver driver;
	
	@Given ("^user is on login page$")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		 driver.get("https://ui.cogmento.com/");
		
	}
	
	@When ("^title of page is Cogmento CRM$")
	public void When_title_of_page_is_Cogmento_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Then ("^user enters username and password$")
	public void Then_user_enters_username_and_password(DataTable credentials) {
		List<List<String>> rows = credentials.asLists(String.class);
		driver.findElement(By.name("email")).sendKeys(rows.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(rows.get(0).get(1));
		
	}
	
	@Then ("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
	}
	
	@Then ("^user is on home page$")
	public void user_is_on_home_page() {
		String label = driver.findElement(By.xpath("//span[@class='user-display']")).getText();
		Assert.assertEquals(label, "Pren Maisuriya");
	}
	

	 
	 @Then ("^user opens Companies Page$")
	 public void user_opens_Companies_Page() {
		 driver.findElement(By.linkText("Companies")).click();
	 }
	 
	 /*@Then ("^user creates Deals$")
	 public void user_creates_Deals(DataTable data) {
		driver.findElement(By.linkText("Create")).click();
		List<List<String>> d = data.asLists(String.class);
		driver.findElement(By.name("name")).sendKeys(d.get(0).get(0));
		driver.findElement(By.name("url")).sendKeys(d.get(0).get(1));
		driver.findElement(By.name("city")).sendKeys(d.get(0).get(2));
		driver.findElement(By.name("industry")).sendKeys(d.get(0).get(3));
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		}*/
	 
	 @Then ("^user creates Deals$")
	 public void user_creates_Deals(DataTable data) throws InterruptedException {
		
		for(Map<String,String> d : data.asMaps(String.class , String.class)) {
			driver.findElement(By.linkText("Create")).click();
			driver.findElement(By.name("name")).sendKeys(d.get("title"));
			driver.findElement(By.name("url")).sendKeys(d.get("url"));
			driver.findElement(By.name("city")).sendKeys(d.get("city"));
			driver.findElement(By.name("industry")).sendKeys(d.get("industry"));
			driver.findElement(By.xpath("//i[@class='save icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Companies")).click();
			}
		
		
		
		
		}
	 
	 @Then ("^close browser$")
		public void close_browser() {
			driver.quit();
		}
	 
	
	 
}





