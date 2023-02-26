//***********************************************************************************
//* Description
//*------------
//* employee pagination
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

public class employeePagination extends paginationFunction {
	elements elem = new elements();
	
	@Test(priority=0)
	public void supplierPaginationFunction () throws InterruptedException {
		
		PageFactory.initElements(driver, elem);
		
        Thread.sleep(500);
		
	    elements.master.click();
		Thread.sleep(2000);
		
		
		elements.mainEmployee.click();
		
		elements.sideEmployee.click();
		
	
	
		
//	 EMPLOYEE PAGINATION-DEFAULT-PAGE-INDEX
//	--------------------------------------------------------------------------
	
	
		paginationFunction.employeeDefaultIndexPage();
		

		
//		EMPLOYEE PAGINATION-REFERESH-INTO-DEFAULT-PAGE
//		--------------------------------------------------------------------------
		
		
		paginationFunction.employeeRefreshDefaultPage();
		

//		EMPLOYEE PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE
//		----------------------------------------------------------------------
		

		paginationFunction.employeePageRedrict();
		

//		EMPLOYEE PAGINATION-PREVIOUS-BUTTON-VISIBLE
//	    --------------------------------------------------------------------------
		
		
		paginationFunction.employeePreviousButtonDispaly();

		
		
//		EMPLOYEE PAGINATION-NEXT-BUTTON-VISIBLE
//		-------------------------------------------------------------------------
		
		
		paginationFunction.employeeNextButtonDispaly();
		
		
//		SUPPLIER PAGINATION-NEXT-BUTTON-ENABLE
//		------------------------------------------------------------------------
		
		
		paginationFunction.employeeNextButtonEanble();
		

//		EMPLOYEE PAGINATION-PREVIOUS-BUTTON-DISABLE-BEFORE MOVE THE 2ND PAGE
//		---------------------------------------------------------------------------
		
		
		paginationFunction.employeeSecPagepreButDisable();
		
		
//		EMPLOYEE PAGINATION-PREVIOUS-BUTTON-DISABLE-AFTER MOVE THE 2ND PAGE
//		---------------------------------------------------------------------------
		
		
        paginationFunction.employeeAfterMovetoSecPagepreButEnable();
        
        
		
		
	}	

}