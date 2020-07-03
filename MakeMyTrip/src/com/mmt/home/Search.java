package com.mmt.home;

import org.testng.annotations.Test;

import com.mmt.Pages.SearchPage;
import com.mmt.genericLib.BaseTest;

public class Search extends BaseTest {

	@Test
	public void searchForResult() throws InterruptedException
	{
		
		SearchPage sp=new SearchPage(driver);
		Thread.sleep(3000);
		//sp.setLoginOrCreateAccount();
		sp.setLoginOrSignupPopup();
		Thread.sleep(3000);
		sp.clickFromDD();
		sp.setFromDD();
		sp.clickDDOption();
		sp.clickToDD();
		sp.setToDD();
	}
}
