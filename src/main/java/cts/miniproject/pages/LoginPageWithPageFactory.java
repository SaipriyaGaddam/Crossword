package cts.miniproject.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithPageFactory {

	WebDriver driver;

	@FindBy(how=How.ID,using="user_session_email")
	@CacheLookup
	WebElement username;

	@FindBy(how=How.XPATH,using="//input[@id='user_session_password']")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH,using="//input[@id='user_session_submit']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how=How.XPATH,using="//a[@href=\'http://crosswordbookawards.com/\' ]")
	@CacheLookup
	WebElement AwardPage;
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement logout;
	
	
	
  
	public LoginPageWithPageFactory(WebDriver driver) {
		this.driver=driver;
	}
    
	public void typeUserNameAndPassword(String userid,String pass) {
		username.sendKeys(userid);
		password.sendKeys(pass);
	}
    
	public void clickOnLoginButton() {
		submit_button.click();
	}
	
	public void clickOnLogoutButton() {
		      logout.click();
	}
   
	public void AwardPageButton() {
	      AwardPage.click();
}


}
