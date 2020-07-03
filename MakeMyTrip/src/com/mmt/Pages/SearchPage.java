package com.mmt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	
	@FindBy(xpath="//p[.=' Login or Create Account']")
	private WebElement loginOrCreateAccount;
	@FindBy(xpath="//span[@class='userNameIcon whiteText makeFlex perfectCenter latoBlack appendRight10']")
	private WebElement loginOrSignupPopup;

	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromDD;
@FindBy(xpath="//p[.='Delhi, India']")
	private WebElement selectDDOption;
@FindBy(xpath="//input[@placeholder='To']")
private WebElement toDD;

	
	
	
	public WebElement getLoginOrCreateAccount() {
	return loginOrCreateAccount;
}

public void setLoginOrCreateAccount() {
	loginOrCreateAccount.click();
}
public WebElement getLoginOrSignupPopup() {
	return loginOrSignupPopup;
}

public void setLoginOrSignupPopup() {
	loginOrSignupPopup.click();;
}


	public void clickFromDD() {
	 fromDD.click();;
}

public void setFromDD() {
	fromDD.sendKeys("del");
}
public WebElement selectDDOption() {
	return selectDDOption;
}

public void clickDDOption() {
	selectDDOption.click();
}

public void clickToDD() {
	 toDD.click();
}

public void setToDD() {
	this.toDD.sendKeys("ccu");
}

public SearchPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}


}
