package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement Loginlink;
	
	public void clickLogin() {
		clickAction(Loginlink);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;
	
	public void clickRegister() {
		clickAction(RegisterLink);
	}
    @FindBy(xpath= "//a[text()='Restaurants ']")
    WebElement RestaurantsLink;
    
    public void clickRestaurants() {
    	clickAction(RestaurantsLink);
    }
    @FindBy(xpath="//a[text()='Home ']")
    WebElement HomeLink;
    
    public void clickHome() {
    	clickAction(HomeLink);
    }
    @FindBy(xpath="//img[@class='img-rounded']")
    WebElement LogoImage;
    
    public void LogoDisplay() {
    	System.out.println(LogoImage.isDisplayed());
    }
    

}
