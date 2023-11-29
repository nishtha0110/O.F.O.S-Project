package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.WelcomePage;

public class LoginTest extends Base_Test{

	@Test(dataProvider = "testdata")
	public void testScript1(String userName, String password) throws IOException, InterruptedException {
		
		  WelcomePage Wp=new WelcomePage(driver); 
		  Wp.clickLogin();
		  LoginPage lp=new LoginPage(driver); 
		  lp.enterValueInUserName(userName); 
		  lp.enterValueInPwd(password);
		  System.out.println(lp.displayCreateAnAccount());
		 // lp.clickAction(createAnAccount);
		  
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  
		  lp.clickLoginButton();
		  Thread.sleep(5000);
		  JavaScriptUtil javScript=new JavaScriptUtil();
		  javScript.jsScrollBy(0, 500);
		  //action.sendKeys(Keys.PAGE_DOWN).build().perform();
		  try {
			  Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(), true);
		    test.log(LogStatus.PASS, "User is logged in");
		  }catch (NoSuchElementException e) {
		    test.log(LogStatus.FAIL, "User is not logged in");
		}
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Login");
		return testdata;
	}
	

}
