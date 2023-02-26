//***********************************************************************************
//* Description
//*------------
//* Employee and Supplier Methods
//***********************************************************************************
//*
//* Author           : Saththiyarajah Sayanthan
//* Date Written     : 24/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        25/02/2023   Sayan     Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.mytest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.mymodule.elements;

public class addEmployee extends uimethods{
	
	static elements elem = new elements();
	
	@Test
	
	public static void addingEmployee() throws InterruptedException {
		PageFactory.initElements(driver, elem);
		
        Thread.sleep(500);
        
		
	    elements.master.click();
		Thread.sleep(2000);
		
		
		elements.mainEmployee.click();
		
		elements.sideEmployee.click();
		
		
//		CHECKING THE ADD EMPLOYEE BUTTON PROPERTIES
//		---------------------------------------------
	
		uimethods.addEmployeeButtonProperties();
		
//	    CLICK ON THE ADD EMPLOYEE BUTTON
//		---------------------------------------------
		
		elements.addEmployeeButton.click();
		
//     SENDING VALUES TO THE FIELDS
//		---------------------------------------------
		
		uimethods.addEmployeeSendValues();
		
//		SELECT VALUE FROM THE DESIGNATION DROPDOWN
//		---------------------------------------------
		
		elements.designationDropdown.click();
		uimethods.designationDropdown();
		
//		CHECKING THE EMPLOYEE SAVE BUTTON PROPERTIES
//		---------------------------------------------
		
		uimethods.employeeSaveButtonUI();
		
//		CLICK ON THE EMPLOYEE SAVE BUTTON
//		---------------------------------------------
		
		Thread.sleep(1000);
		elements.employeeSaveButton.click();
		
//		CHECK WHETHER THE ADDED VALUE CAME TO FIRST ROW
//		---------------------------------------------
		
		uimethods.employeecheckLastAddvalue();
		
		
		
		
	}

}
