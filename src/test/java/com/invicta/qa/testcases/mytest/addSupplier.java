//***********************************************************************************
//* Description
//*------------
//* Add supplier
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

public class addSupplier extends uimethods{
	
	elements elem = new elements();
	
	
	@Test
	
public void addSupplierFuntion() throws InterruptedException {
	
	PageFactory.initElements(driver, elem);
	
	 Thread.sleep(500);
		
	    elements.master.click();
		Thread.sleep(1000);
		
		elements.mainSupplier.click();
		
		elements.sideSupplier.click();
		
//		CHECKING THE ADD SUPPLIER BUTTON PROPERTIES
//		---------------------------------------------
		
		uimethods.addSupplierButtonUI();
		
//	    CLICK ON THE ADD SUPPLIER BUTTON
//		---------------------------------------------
		
		Thread.sleep(2000);
		elements.addSupplierButton.click();
		
//		SELECT VALUE FROM THE SUPPLIER CATEGORY DROPDOWN
//		---------------------------------------------		
		
		
		Thread.sleep(1000);
		elements.supplierCategoryField.click();
		uimethods.addSupplierDropdown();
		
//	     SENDING VALUES TO THE FIELDS
//	    ---------------------------------------------
		
		uimethods.addSupplierSendValues();
		
//		SELECT VALUE FROM THE PLANT DROPDOWN
//		---------------------------------------------
		
		Thread.sleep(1000);
		elements.plantField.click();
		uimethods.addPlantDropdown();
		
//		CHECKING THE SUPPLIER SAVE BUTTON PROPERTIES
//		---------------------------------------------
		
		uimethods.supplierSaveButtonUI();
	
//		CLICK ON THE SUPPLIER SAVE BUTTON
//		---------------------------------------------
	
	    elements.supplierSaveButton.click();
	    
//		CHECK WHETHER THE ADDED VALUE CAME TO FIRST ROW
//		---------------------------------------------
	    
	    uimethods.checkLastAddvalue();
	    
}
		
}


