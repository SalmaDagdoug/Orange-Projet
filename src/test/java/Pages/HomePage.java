package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List <WebElement> Menus;
	@FindBy (xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]")
	WebElement VerifMenu;
	
	public HomePage () {
		PageFactory.initElements(Config.driver, this);
	}
public void ClickMenuByName (String MenuName) {
	try {
	for (WebElement menu :Menus ) {
		if (menu.getText().contains(MenuName)) {
			menu.click();
		}
	}
	}catch (Exception e) { 
} }
	
 public String verifMessage () {

	String ActualMessage = VerifMenu.getText();
	return ActualMessage ;  
	
}

}
