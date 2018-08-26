package actiTimePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTimeLib.BasePage;

public class ActiTimeLoginPagePO extends BasePage{

	public ActiTimeLoginPagePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="username")
	private WebElement unTxtBx;
	public WebElement unTxtBx() {
		return unTxtBx;
	}
	@FindBy(name="pwd")
	private WebElement pwTxtBx;
	public WebElement pwTxtBx() {
		return pwTxtBx;
	}
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	public WebElement loginBtn() {
		return loginBtn;
	}
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errorMsg;
	public WebElement errorMsg() {
		return errorMsg;
	}
	public void login(String un,String pw) {
		unTxtBx().sendKeys(un);
		pwTxtBx().sendKeys(pw);
		loginBtn().click();		
	}
	
	
	
}
