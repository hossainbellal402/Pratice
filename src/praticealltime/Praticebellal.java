package praticealltime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Praticebellal {

@Test 
	
	public void openBrowser() {	
	System.setProperty( "webdriver.chrome.driver", "C:\\Users\\bella\\Desktop\\Github jar\\drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
driver.manage().window().maximize();
	}

}
