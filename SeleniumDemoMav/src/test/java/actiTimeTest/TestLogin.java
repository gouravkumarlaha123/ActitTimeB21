package actiTimeTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeLoginPagePO;

public class TestLogin extends BaseTest{
	
	@Test(priority=1)
	public void testValidCredentials() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("admin", "manager");
			String eTitle="actiTIME - Enter Time-Track";
			loginPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}		
	}
	
	@Test(priority=2)
	public void testInvalidUn() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("admin1", "manager");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus= true;
			Assert.assertEquals(aStatus, eStatus);			
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
		
	}
	
	@Test(priority=3)
	public void testInvalidPw() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("admin", "manager1");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus= true;
			Assert.assertEquals(aStatus, eStatus);			
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
		
	}

}
