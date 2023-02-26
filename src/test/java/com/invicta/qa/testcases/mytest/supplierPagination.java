//***********************************************************************************
//* Description
//*------------
//* supplier pagination
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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.invicta.qa.pages.mymodule.elements;

public class supplierPagination extends paginationFunction {
	elements elem = new elements();
	
	@Test(priority=0)
	public void supplierPaginationFunction () throws InterruptedException {
		
		PageFactory.initElements(driver, elem);
		
        Thread.sleep(500);
		
	    elements.master.click();
		Thread.sleep(1000);
		
		elements.mainSupplier.click();
		
		elements.sideSupplier.click();
		
		
		
//	 SUPPLIER PAGINATION-DEFAULT-PAGE-INDEX
//	--------------------------------------------------------------------------
	
	
		paginationFunction.supplierDefaultIndexPage();
		
		

//		SUPPLIER PAGINATION-REFERESH-INTO-DEFAULT-PAGE
//		-----------------------------------------------------------------------
		
		
		paginationFunction.supplierRefreshDefaultPage();
		

//		SUPPLIER PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE
//		----------------------------------------------------------------------
		

		paginationFunction.supplierPageRedrict();
		

//		SUPPLIER PAGINATION-PREVIOUS-BUTTON-VISIBLE
//	    ------------------------------------------------------------------------
		
		
		paginationFunction.supplierPreButtonDispaly();

		
		
//		SUPPLIER PAGINATION-NEXT-BUTTON-VISIBLE
//		-------------------------------------------------------------------------
		
		
		paginationFunction.supplierNextButtonDispaly();
		
		
//		SUPPLIER PAGINATION-NEXT-BUTTON-ENABLE
//		------------------------------------------------------------------------
		
		
		paginationFunction.supplierNextButtonEanble();
		

//		SUPPLIER PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE
//		--------------------------------------------------------------------------
		
		
		paginationFunction.supplierSecPagepreButDisable();
		
		
//		SUPPLIER PAGINATION-PREVIOUS-BUTTON-DISABLE-AFTER MOVE THE 2ND PAGE
//		---------------------------------------------------------------------------
		
		
		paginationFunction.supplierAfterMovetoSecPagepreButEnable();
		
		
		
		
		
		
	}	

}
