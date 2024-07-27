package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	@FindBy ( name = "username")
	WebElement username;
	
	@FindBy (name ="password")
	WebElement password; 
	@FindBy (xpath= "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Btnlogin;
	
	@FindBy (xpath = "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement LoginDashbordMessage;
	@FindBy (xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement VerifInvalid; 
	
public LoginPage () {
	PageFactory.initElements(Config.driver, this);
	
}
public void connect( String Username, String Password) {
	Config.attente(10);
	username.sendKeys(Username);
	password.sendKeys(Password);
	Btnlogin.click();
	;
}
  public String verifMessage() {
	String actualText = LoginDashbordMessage.getText();
	return actualText;
}
 public String verifInvalid () {
	 String actualText = VerifInvalid.getText();
	 return actualText; }
}
