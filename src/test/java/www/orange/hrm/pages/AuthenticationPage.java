package www.orange.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	private
	 WebElement Username;

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement password;

	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	WebElement submit;

	public AuthenticationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void login(String username, String paswod) {

		this.getUsername().sendKeys(username);

		this.password.sendKeys(paswod);

		this.submit.click();

	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

}
