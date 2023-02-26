package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.base.DriverIntialization;

import com.invicta.qa.pages.sbu.AddSbuFunPage;

public class AddSbuCloseTest extends DriverIntialization {
	
	AddSbuFunPage AddSubFunpg = new AddSbuFunPage();
	
	@Test(priority =1)
	
	public void sub_w_close () throws InterruptedException {
		
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, AddSubFunpg);
		
        Thread.sleep(2000);
		
		AddSbuFunPage.Master.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.SBU.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.AddSBU.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.SBUtext.sendKeys("close");
		AddSbuFunPage.SBUdestext.sendKeys("close");
		
		Thread.sleep(2000);
		
		AddSbuFunPage.SBUclose.click();
		
		
		
		
	}
	
	@Test(priority =2)
	public void sub_wo_close() throws InterruptedException {
		
		AddSbuFunPage.AddSBU.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.SBUclose.click();
		
	}

}
