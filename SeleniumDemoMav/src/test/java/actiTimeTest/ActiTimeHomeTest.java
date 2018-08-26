package actiTimeTest;

import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeHomePagePO;
import actiTimePO.ActiTimeLoginPagePO;

public class ActiTimeHomeTest extends BaseTest {
	
	@Test
	public void testLogout() {
		driver.get(TEST_URL);
		ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
		loginPO.login("kmrajay237", "zxcv1234");	
		ActiTimeHomePagePO homePO=new ActiTimeHomePagePO(driver);
		homePO.checkWebElement(homePO.logoutBtn());
		homePO.logout();
	}

}
