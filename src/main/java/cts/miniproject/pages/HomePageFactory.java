package cts.miniproject.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-input']")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(how=How.XPATH,using="//input[@class='search-go']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(how=How.XPATH,using="//a[@style xpath='1']")
	@CacheLookup
	WebElement HomeButton;
	
	
	 public void typebook(String BookName) {
		   searchbox.sendKeys(BookName);
	   }
	
	   public void ClickSearch() {
		   SearchButton.click();
	   }
	  
	   public void ClickHome() {
		   HomeButton.click();
	   }
	

}
