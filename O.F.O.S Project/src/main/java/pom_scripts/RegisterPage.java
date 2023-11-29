package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;
	
	public void clickRegister() {
		clickAction(RegisterLink);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement UserNameTextField;
	
	public void InputUserName(String userName) {
		enter_value(UserNameTextField,userName);
	}
	@FindBy(xpath="//input[@name='firstname']")
	WebElement FirstNameTextField;
	
	public void InputFirstName(String firstName) {
		enter_value(FirstNameTextField,firstName);
	}
    
	@FindBy(xpath="//input[@name='lastname']")
	WebElement LastNameTextField;
	
	public void inputLastName(String lastName) {
		enter_value(LastNameTextField,lastName);
	}
    @FindBy(xpath="//input[@id='exampleInputEmail1']")
    WebElement EmailTextField;
    
    public void inputEmail(String email) {
    	enter_value(EmailTextField,email);
    }
    @FindBy(xpath="//input[@id='example-tel-input-3']")
    WebElement phoneTextField;
    
    public void inputPhoneNumber(String phone) {
    	enter_value(phoneTextField,phone);
    }
    @FindBy(xpath="//input[@id='exampleInputPassword1']")
    WebElement passwordTextField;
    
    public void inputPassword(String password) {
    	enter_value(passwordTextField,password);
    }
    @FindBy(xpath="//input[@id='exampleInputPassword2']")
    WebElement confirmPasswordTextField;
    
    public void inputConfirmPassword(String confirmPassword) {
    	enter_value(confirmPasswordTextField,confirmPassword);
    }
    @FindBy(xpath="//textarea[@id='exampleTextarea']")
    WebElement deliveryAddressTextArea;
    
    public void inputDeliveryAddress(String deliveryAddress) {
    	enter_value(deliveryAddressTextArea,deliveryAddress);
    }
    @FindBy(xpath="//input[@name='submit']")
	public WebElement submitButton;
    
    public void submitButtonClick() {
    	submitButton.click();
    }
}
