//***********************************************************************************
//* Description
//*------------
//* cancel supplier 
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


public class cancelSupplierModal extends uimethods {
	
	elements elem = new elements();
	
	@Test
	public void cancelSupplierForm() throws InterruptedException {
		PageFactory.initElements(driver, elem);
		
        Thread.sleep(500);
		
	    elements.master.click();
		Thread.sleep(1000);
		
		elements.mainSupplier.click();
		
		elements.sideSupplier.click();
		
//		CLICK ON THE ADD EMPLOYEE BUTTON
//		---------------------------------------------
		
		Thread.sleep(2000);
		elements.addSupplierButton.click();
		
//	     SENDING VALUES TO THE FIELDS
//	    ---------------------------------------------
		
		uimethods.addSupplierSendValues();

//		CHECK THE PROPERTIES OF EMPLOYEE CANCEL BUTTON
//		----------------------------------------------
		
		uimethods.supplierCancelButtonUI();
	
//		CLICK ON THE EMPLOYEE CANCEL BUTTON
//		------------------------------------------------
		
		 elements.supplierCancelButton.click();
		 
		 
//			CHECK WHETHER THE ADD EMPLOYEE POPUP SCREEN IS CLOSED
//			-----------------------------------------------------
		 
		 uimethods.modalClose();
		
	}

}
