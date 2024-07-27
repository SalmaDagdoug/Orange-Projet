package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
	   Config.confchrome();
	   Config.driver = new ChromeDriver () ;
	   Config.maximizewindow();
	   String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   Config.driver.get(url);
		   
	}

	@When("admin enter correct user name {string} and correct passeword {string}")
	public void admin_enter_correct_user_name_and_correct_passeword(String nom, String pwd) {
	LoginPage  page = new LoginPage ();
	page.connect(nom, pwd);
	}

	@Then("admin is directed to the home page that contains message {string}")
	public void admin_is_directed_to_the_home_page_that_contains_message(String ExpectedText) {
		LoginPage  page = new LoginPage ();
		String actualText = page.verifMessage();
				Assert.assertEquals(ExpectedText, actualText);
				}
				
	@When("admin enter incorrect user name {string} and correct passeword {string}")
	public void admin_enter_incorrect_user_name_and_correct_passeword(String nom, String pwd) {
				  LoginPage page = new LoginPage();
				  page.connect(nom, pwd);
				}

	@Then("admin  rest dans la meme page that contains message {string}")
	public void admin_rest_dans_la_meme_page_that_contains_message(String ExpectedText) {
		LoginPage page = new LoginPage ();
		String actualtext = page.verifInvalid();
		Assert.assertEquals(ExpectedText, actualtext); 
		}	
				
	}

