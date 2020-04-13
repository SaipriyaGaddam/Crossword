package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public WebDriver driver;
	ConfigReader cr = new ConfigReader();
	public WebDriver startBrowser(String browserName,String url) {
		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",cr.getchromepath());
			driver=new ChromeDriver();  
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();	
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
