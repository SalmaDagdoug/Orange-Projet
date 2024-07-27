package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	public static void confchrome () {
		System.setProperty("webdriver.chrome.drive","c:/chromedriver.exe");
	}
		
		public static void maximizewindow () {
			driver.manage().window().maximize();
		}
			
			public static void attente (long s) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
			}
}
