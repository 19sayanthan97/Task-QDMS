//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Saththiyarajah Sayanthan
//* Date Written     : 17/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        20/02/2023   Sayan     Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.sbu.AddSbuFunPage;

public class sbutestcases extends sbumethods {

	static AddSbuFunPage AddSbuFunpg = new AddSbuFunPage();

	@Test(priority=1)

	public static void testcase01() throws InterruptedException, IOException {

		PageFactory.initElements(driver, AddSbuFunpg);

		AddSbuFunPage.Master.click();
		Thread.sleep(2000);

		AddSbuFunPage.SBU.click();
		Thread.sleep(2000);

//		STEP 1 - CHECKING THE "ADD SBU" BUTTON UI PROPERTIES (VISIBILITY,POSITION,FONT-SIZE,BUTTON-SIZE,BUTTON-ENABLE,BUTTON-COLOR,BORDER-COLOR,FONT-TYPE,FONT-COLOUR,BUTTON-CURSOR,BUTTON-SPELLING,BUTTON-PADDING,BUTTON-RADIUS,OPACITY,FONT-WEIGHT) 

		sbumethods.Addsbu();

//		STEP 2 - CLICK THE "ADD SBU" BUTTON
		
		sbumethods.addSubButtonClick();

//		STEP 3 - CHECKING THE "ADD SBU" POP-UP SCREEN UI PROPERTIES (VISIBLE,POSITION,SIZE,BACKGROUND-COLOR,BORDER-COLOR,OVERFLOW-TYPE,MARGIN-TYPE,CURSOR-TYPE,Z-INDEX-TYPE,HEADER,CONTENT,INVISIBLE-ONCLICK-INSIDE)

		Thread.sleep(2000);
		sbumethods.sbumodal();

//		STEP 4 - DATA INPUT FROM EXCEL
		
		
		sbumethods.execldata();

//		STEP 5 - CHECKING THE "Save" BUTTON UI PROPERTIES (VISIBILITY,POSITION,FONT-SIZE,BUTTON-SIZE,BUTTON-ENABLE,BUTTON-COLOR,BORDER-COLOR,FONT-TYPE,FONT-COLOUR,BUTTON-CURSOR,BUTTON-SPELLING,BUTTON-PADDING,BUTTON-RADIUS,OPACITY,FONT-WEIGHT)

		sbumethods.sbusavebutton();

//		STEP 6 - CLICK THE SAVE BUTTON

		sbumethods.saveButtonClick();
		
//		STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE
		
		Thread.sleep(2000);
		sbumethods.checkLastAddedvalue();
		

	}
	
	
	@Test(priority=2)
	
	public static void testcase02 () throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, AddSbuFunpg);
		
//	STEP-1 CLICK ON ADD SBU BUTTON	
		
		AddSbuFunPage.AddSBU.click();
		
//		STEP-2 CLICK ON SAVE BUTTON
		
//		AddSbuFunPage.SBUsavebutton.click();
		
//		STEP-3 CHECKING THE EMPTY VALIDATION
		
//		sbumethods.emptyvalidation();
		
//		STEP-4 CHECKING THE EMPTY VALIDATION MESSAGE UI PROPERTIES
		
//		sbumethods.emptyvalidationUI();
		
//		STEP-5 CHECKING THE VALIDATIONS 
		
		sbumethods.Validation();
		
		
	}
		
}
