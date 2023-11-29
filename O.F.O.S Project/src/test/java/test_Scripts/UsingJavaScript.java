package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.JavaScriptUtil;
import pom_scripts.RegisterPage;

public class UsingJavaScript extends Base_Test {
	
	@Test
	public void test() {
		
		JavaScriptUtil javaUtil=new JavaScriptUtil();
		javaUtil.jsScrollBy(300, 400);
	
	    RegisterPage rp=new RegisterPage(driver);
		
		javaUtil.jsScrollIntoView(true,rp.submitButton);
	
	}

}
