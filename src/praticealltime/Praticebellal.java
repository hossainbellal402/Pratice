package praticealltime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praticebellal {

	public static void main(String[] args) {
	
		
	System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\Desktop\\Github jar\\drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");

	}

}
