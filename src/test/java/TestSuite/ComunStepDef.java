package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class ComunStepDef {
	@Given("utilisateur est connecté avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_connecté_avec_le_bon_username_et_le_bon_password(String nom, String psd) {
	    Config.confchrome();
	    Config.driver = new ChromeDriver ();
	    Config.maximizewindow();
	    String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    Config.driver.get(url);
	    LoginPage login = new LoginPage ();
	    	login.connect(nom, psd);	
	}
}
