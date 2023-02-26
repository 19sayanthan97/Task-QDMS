package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;

import com.invicta.qa.pages.sbu.AddSbuFunPage;







public class AddSbuFunTest extends DriverIntialization {
	
	AddSbuFunPage AddSbupg = new AddSbuFunPage();
	
	@Test(priority=1)
	
public void modalopen () throws InterruptedException {
		
		PageFactory.initElements(driver, AddSbupg);
		
		AddSbuFunPage.Master.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.SBU.click();
		Thread.sleep(2000);
		
		AddSbuFunPage.AddSBU.click();
		Thread.sleep(2000);
		
		boolean ActualAfterClick = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedAfterClick= true;
		
		boolean elementvisibleafterclick = true;
		testCase = extent.createTest("013-MODAL-INVISIBLE-ONCLICK-OUTSIDE");
		try {
			AssertJUnit.assertEquals(ActualAfterClick, ExpectedAfterClick);
		} catch (AssertionError e) {
			elementvisibleafterclick = false;
		}
		if (elementvisibleafterclick) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualAfterClick);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.PASS, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualAfterClick);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.FAIL, "Modal invisible");
		}
		Thread.sleep(2000); 
		
	}
	

	@Test (priority = 2)
	public void addsbu () throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, AddSbupg);
		
		AddSbuFunPage.SBUclose.click();
		Thread.sleep(2000);
		
//		AddSbuFunPage.Master.click();
//		Thread.sleep(2000);
//		
//		AddSbuFunPage.SBU.click();
//		Thread.sleep(2000);
//		
		
//		AddSbuFunPage.SBUtext.sendKeys("NewSBU");
//		AddSbuFunPage.SBUdestext.sendKeys("New Description");
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			AddSbuFunPage.AddSBU.click();

			AddSbuFunPage.SBUtext.sendKeys(sbu); 
			AddSbuFunPage.SBUdestext.sendKeys(description);
			
			
			AddSbuFunPage.SBUsavebutton.click();
			
		}
		
		}
	
	@Test(priority=3)
	public void modalclose () throws InterruptedException {
		
		PageFactory.initElements(driver, AddSbupg);
		
		
		
		Thread.sleep(3000); 
		
		AddSbuFunPage.SBUtext.clear();
		AddSbuFunPage.SBUtext.sendKeys("NewSBU");
		
		Thread.sleep(3000);
		AddSbuFunPage.SBUdestext.clear();
     	AddSbuFunPage.SBUdestext.sendKeys("New Description");
		
     	AddSbuFunPage.SBUsavebutton.click();
     	Thread.sleep(2000);
     	
     	Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
        
    	boolean ActualAfterClick = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedAfterClick= false;
		
		boolean elementvisibleafterclick = false;
		testCase = extent.createTest("SBU_SAVE_CLICK");
		try {
			AssertJUnit.assertEquals(ActualAfterClick, ExpectedAfterClick);
		} catch (AssertionError e) {
			elementvisibleafterclick = true;
		}
		if (elementvisibleafterclick) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualAfterClick);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.FAIL, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualAfterClick);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.PASS, "Modal invisible");
		}
		Thread.sleep(2000); 
     	
	}
	
		
	}


