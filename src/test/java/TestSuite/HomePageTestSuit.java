package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTestSuit {
	@Given("utilisateur est sur la page Home")
	public void utilisateur_est_sur_la_page_home() {
		Config.confchrome();
		Config.driver= new ChromeDriver  ();
		Config.maximizewindow();
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Config.driver.get(url);
	    
	}

	@When("utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menu) {
		HomePage home = new HomePage ();
		home.ClickMenuByName(menu);
	
	}

	@Then("la page de menu est affichée qui contient le nom de {string}")
	public void la_page_de_menu_est_affichée_qui_contient_le_nom_de(String expectedText) {
		HomePage home = new HomePage ();
		String actualtext = home.verifMessage();
		Assert.assertEquals(expectedText, actualtext);
		Config.driver.quit();
		
	
	}

}
