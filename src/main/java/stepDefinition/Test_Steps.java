package stepDefinition;

	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Test_Steps {
			public static WebDriver driver;
			
			
			
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
			driver = new ChromeDriver();
		     driver.get("https://www.store.demoqa.com");
		}

		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
			driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		}

		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
			List<List<String>> data = usercredentials.raw();
			driver.findElement(By.id("log")).sendKeys(data.get(0).get(0)); 
		    driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
		    driver.findElement(By.id("login")).click();
		}

		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			System.out.println("Login Successfully");
		}

		@When("^User LogOut from the Application$")
		public void user_LogOut_from_the_Application() throws Throwable {
			driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		}

		@Then("^Message displayed LogOut Successfully$")
		public void message_displayed_LogOut_Successfully() throws Throwable {
			System.out.println("LogOut Successfully");
		}
	}


