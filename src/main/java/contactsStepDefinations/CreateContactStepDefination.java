package contactsStepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContactStepDefination {
	
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
	
	@Then ("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Then_user_enters_username_and_password(String username , String password ) {
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
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
	
	 @Then ("^user opens Contacts Page$")
	 public void user_opens_Contacts_Page() {
		 driver.findElement(By.linkText("Contacts")).click();
	 }
	 
	 @Then ("^user creates contacts with \"([^\"]*)\"&\"([^\"]*)\"&\"([^\"]*)\"$")
	 public void user_creates_contacts(String firstname,String lastname,String city) {
		 driver.findElement(By.linkText("Create")).click();
		 driver.findElement(By.name("first_name")).sendKeys(firstname);
		 driver.findElement(By.name("last_name")).sendKeys(lastname);
		 driver.findElement(By.name("city")).sendKeys(city);
		 driver.findElement(By.xpath("//i[@class='save icon']")).click();
	 }

	
	@Then ("^close browser$")
	public void close_browser() {
		driver.quit();
	}

}
