package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginLink;
	
	public void clickLoginLink() {
		clickAction(loginLink);
	}
	
	public WebElement getEmailTF() {
		return userNameTF;
	}
	public void setEmailTF(WebElement userNameTF) {
		this.userNameTF = userNameTF;
	}

	@FindBy(xpath  ="//input[@name='username']")
	private WebElement userNameTF;
	
	public void enterValueInUserName(String userName) {
		
		enter_value(userNameTF, userName);
	}
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pwdTF;
	
	
	public void enterValueInPwd(String pwd) {
		enter_value(pwdTF, pwd);
	}
	
	@FindBy(xpath = "//input[@id='buttn']")
	WebElement LoginButton;
	
	public void clickLoginButton() {
		clickAction(LoginButton);
	}
    @FindBy(xpath="//a[text()=' Create an account']")
    WebElement CreateAnAccount;
    
    public boolean displayCreateAnAccount() {
    	return CreateAnAccount.isDisplayed();
    }
}
