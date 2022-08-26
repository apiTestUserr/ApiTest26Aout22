package www.orange.hrrm.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import www.orange.hrm.pages.AuthenticationPage;

public class AuthenticationStepefinition {

	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	AuthenticationPage auth = new AuthenticationPage(driver);

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		driver = new ChromeDriver(); // Polymorphisme

	}

	@Given("^admin navige vers l url d orange hrm$")
	public void admin_navige_vers_l_url_d_orange_hrm() throws Throwable {

		driver.get(url);

		driver.manage().window().maximize();

	}

	@When("^admin se connecte verc un correct \"([^\"]*)\" et un correct \"([^\"]*)\"$")
	public void admin_se_connecte_verc_un_correct_something_et_un_correct_something(String username, String password)
		

	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(auth.getUsername()));
        	
		auth.login(username, password);
		
	}

	@Then("^la connection est effectuee  et la page dashbord est affichee$")
	public void la_connection_est_effectue_et_la_page_dashbord_est_affichee() throws Throwable {

		String actualURL = driver.getCurrentUrl();

		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";

		Assert.assertEquals(expectedURL, actualURL);

	}

}
