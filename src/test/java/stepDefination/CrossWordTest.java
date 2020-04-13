package stepDefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cts.miniproject.pages.HomePageFactory;
import cts.miniproject.pages.LoginPageWithPageFactory;
import cts.miniproject.utility.BrowserFactory;
import cts.miniproject.utility.ConfigReader;
import cts.miniproject.utility.ExcelDataConfig;
import cts.miniproject.utility.ExtentReport;
import cts.miniproject.utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrossWordTest {

	ConfigReader Read;
	WebDriver driver;
	LoginPageWithPageFactory LoginPage;
	HomePageFactory Home;
	ExcelDataConfig config;
	ConfigReader cr = new ConfigReader();
	
	Logger logger=Logger.getLogger("CrossWordTest");
	public static ExtentReports report = new ExtentReports("./Reports/ExtentReport.html");
	ExtentTest test = report.startTest("CrosswordTestReport");
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PropertyConfigurator.configure("Log4j.properties");

		BrowserFactory set=new BrowserFactory();
		Read=new ConfigReader();
		
		driver=set.startBrowser("chrome", cr.getApplicationURL());
		logger.info("Chrome Driver Opens & Navigated to URL");
	}

	@When("^I enter valid \"([^\"]*)\"$")
	public void i_enter_valid(String usernameNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ExcelDataConfig configExcel=new ExcelDataConfig(Read.getExcelAccess());
		Object[][] data=configExcel.passData();
		String username="";
		String password="";

		if(null!= usernameNumber ) {
			int userCount = Integer.parseInt(usernameNumber.trim());

			username = (String )data[userCount-1][0];
			password = (String )data[userCount-1][1];	
			test.log(LogStatus.PASS, "Valid Username & Password Entered");
		}
		
		LoginPage=PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		LoginPage.typeUserNameAndPassword(username,password);
	}

	@When("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.clickOnLoginButton();
		Screenshot Capture=new Screenshot();
		Capture.getScreenshot(driver);
		System.out.println("User is able to login successfully"); 
		test.log(LogStatus.PASS, "User able to Login Successfully");
	}

	@When("^the user search a book$")
	public void the_user_search_a_book() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String BookName="URBAN NAXALS";
		Home=PageFactory.initElements(driver, HomePageFactory.class);
		Home.typebook(BookName);
		test.log(LogStatus.PASS, "User be able to Enter book name in search box");
	    
	}
	
	@When("^user click search button$")
	public void user_click_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Home.ClickSearch();
		Screenshot Capture=new Screenshot();
		Capture.getScreenshot(driver);
	
		System.out.println("User is able to search sucessfully");
		test.log(LogStatus.PASS, "User is able to search sucessfully");
	}

	@When("^user clicks home button$")
	public void user_clicks_home_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Home.ClickHome();
	
		
	}

	@When("^clicks logoutbutton$")
	public void clicks_logoutbutton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.clickOnLogoutButton();
		Screenshot Capture=new Screenshot();
		Capture.getScreenshot(driver);
		System.out.println("User is not able to logout"); 
		

		
	}
	@When("^clicks Crossword Award Page$")
	public void clicks_Crossword_Award_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.AwardPageButton();
		Screenshot Capture=new Screenshot();
		Capture.getScreenshot(driver);
		test.log(LogStatus.PASS, "User able to Navigate to Award Page Window");

	}




	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {

		Thread.sleep(1000);
		driver.quit();
		report.endTest(test);
		report.flush();

	}
}

	
