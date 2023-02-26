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

package com.invicta.qa.pages.mymodule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[5]/span/a")
	public static WebElement mainSupplier;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement sideSupplier;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[6]/span/a")
	public static WebElement mainEmployee;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]/div[1]")
	public static WebElement sideEmployee;
	

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[5]/button")
	public static WebElement supplierExportButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[4]/span/div/span/button")
	public static WebElement supplierImportButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[5]/button")
	public static WebElement employeeExportButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[4]/span/div/span/button")
	public static WebElement employeeImportButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	public static WebElement SBUsavefont;
	
	
//	Pagination
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[10]/button")
	public static WebElement supplierNextPageButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[2]/button")
	public static WebElement supplierPreviousPageButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[10]/button")
	public static WebElement supplierFirstPage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[2]/button")
	public static WebElement supplierSecoundPage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[10]/button")
	public static WebElement employeeNextPageButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[2]/button")
	public static WebElement employeePreviousPageButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[10]/button")
	public static WebElement employeeFirstPage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[2]/button")
	public static WebElement employeeSecoundPage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[11]/div/div[1]/span[1]")
	public static WebElement currentPaginationOption;
	
	
//	adding supplier
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]")
	public static WebElement supplierCategoryField;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div[1]/div/div[1]")
	public static WebElement plantField;
	
	@FindBy(xpath = "//*[@id=\"supplier_name\"]")
	public static WebElement supplierField;
	
	@FindBy(xpath = "//*[@id=\"supplier_contactno\"]")
	public static WebElement contactNoField;
	
	@FindBy(xpath = "//*[@id=\"supplier_email\"]")
	public static WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"supplier_address\"]")
	public static WebElement addressField;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button")
	public static WebElement addSupplierButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]/span")
	public static WebElement supplierSaveButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[1]")
	public static List <WebElement> supplierCategoryOption;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]")
	public static List <WebElement> plantOption;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]")
	public static WebElement supplierFirstRow;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	public static WebElement supplierCancelButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div")
	public static WebElement supplierModal;
	
	
	
//	ADD EMPLOYEE
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[6]/div/button")
	public static WebElement addEmployeeButton;
	
	@FindBy(xpath = "//*[@id=\"plant\"]")
	public static WebElement plantDropdown;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]")
	public static List <WebElement> plantDropdownOptions;
	
	@FindBy(xpath = "//*[@id=\"desigination\"]")
	public static WebElement designationDropdown;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div[1]")
	public static List <WebElement> designationDropdownOptions;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	public static WebElement firstNameField;
	
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	public static WebElement lastNameField;
	
	@FindBy(xpath = "//*[@id=\"address\"]")
	public static WebElement employeeAddressField;
	
	@FindBy(xpath = "//*[@id=\"phoneno\"]")
	public static WebElement employeeContactNoField;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public static WebElement employeeEmailField;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement employeeSaveButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]")
	public static WebElement employeeFirstRow;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	public static WebElement employeeCancelButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")
	public static WebElement employeeModal;
	
	
	
}
