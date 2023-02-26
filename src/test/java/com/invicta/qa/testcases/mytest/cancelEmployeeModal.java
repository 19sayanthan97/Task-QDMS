//***********************************************************************************
//* Description
//*------------
//* cancel employee
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

public class cancelEmployeeModal extends uimethods {
	
	static elements elem = new elements();
	
	@Test
	
	public static void cancelEmployee() throws InterruptedException {
		
		PageFactory.initElements(driver, elem);
		
		
        Thread.sleep(500);
		
	    elements.master.click();
		Thread.sleep(2000);
		
		
		elements.mainEmployee.click();
		
		elements.sideEmployee.click();
		
//		CLICK ON THE ADD EMPLOYEE BUTTON
//		---------------------------------------------
		
		elements.addEmployeeButton.click();
		
//	     SENDING VALUES TO THE FIELDS
//	    ---------------------------------------------
		
		uimethods.addEmployeeSendValues();
		
//		CHECK THE PROPERTIES OF EMPLOYEE CANCEL BUTTON
//		----------------------------------------------
		
		
		uimethods.employeeCancelButtonUI();
		
		
//		CLICK ON THE EMPLOYEE CANCEL BUTTON
//		------------------------------------------------
		
		
		elements.employeeCancelButton.click();
		
//		CHECK WHETHER THE ADD EMPLOYEE POPUP SCREEN IS CLOSED
//		-----------------------------------------------------
		
		uimethods.empoyeeModalClose();
	
		
	}
	

}
