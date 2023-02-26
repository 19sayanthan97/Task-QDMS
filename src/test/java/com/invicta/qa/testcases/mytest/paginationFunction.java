//***********************************************************************************
//* Description
//*------------
//* Pagination Function
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.mymodule.elements;


public class paginationFunction extends DriverIntialization {

	elements elem = new elements();
	

	
	public static void supplierPagination() throws InterruptedException {

		elements elem = new elements();
		PageFactory.initElements(driver, elem);
		Thread.sleep(1000);

		elements.mainSupplier.click();
		Thread.sleep(1000);
		
		elements.sideSupplier.click();
		Thread.sleep(1000);

	}
	

	
	public static void supplierDefaultIndexPage() throws InterruptedException {
		try {
			elements elem = new elements();
			// Default Index Page
			testCase = extent.createTest("UNIT-PAGINATION-FUNCTIONALITY");
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex = elements.supplierFirstPage.isDisplayed();
			boolean ExpectedDefaultPageIndex = true;
			testCase = extent.createTest("STEP-01 Checking Default Index Page");
			try {
				Assert.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");

			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-01 Checking Default Index Page Failed because of no Element");
		}
	}

	
	public static void supplierRefreshDefaultPage() throws InterruptedException {
		try {
			elements elem = new elements();

			elements.supplierNextPageButton.click();
			// Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex1 = elements.supplierFirstPage.isDisplayed();
			boolean ExpectedDefaultPageIndex1 = true;
			testCase = extent.createTest("STEP-02 Checking Default Index Page after Refresh");
			try {
				Assert.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent
					.createTest("STEP-02 Checking Default Index Page after Refresh is Failed because of no element");
		}
	}

//		Page Redirect to the next page 

	
	public static void supplierPageRedrict() throws InterruptedException {
		try {
			elements UnitPage = new elements();
			elements.supplierNextPageButton.click();
			Thread.sleep(2000);
			boolean ActualSecoundPageIndex = elements.supplierSecoundPage.isDisplayed();
			boolean ExpectedSecoundPageIndex = true;
			testCase = extent.createTest(" STEP-03 Checking Page Redriect to the next page");
			try {
				Assert.assertEquals(ActualSecoundPageIndex, ExpectedSecoundPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedSecoundPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedSecoundPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent
					.createTest(" STEP-03 Checking Page Redriect to the next page is Failed because of no element");
		}
	}

//		Previous Button Displayed
	
	public static void supplierPreButtonDispaly() throws InterruptedException {
		try {
			elements elem = new elements();
			boolean ActualVisiblePreviousButton = elements.supplierPreviousPageButton.isDisplayed();
			boolean ExpectedVisiblePreviousButton = true;
			testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly");
			try {
				Assert.assertEquals(ActualVisiblePreviousButton, ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly is failed because of no element");
		}
	}

//		Next Button Displayed
	
	public static void supplierNextButtonDispaly() throws InterruptedException {
		try {
			elements UnitPage = new elements();
			boolean ActualVisibleNextButton = elements.supplierNextPageButton.isDisplayed();
			boolean ExpectedVisibleNextButton = true;
			testCase = extent.createTest("STEP-05 CHecking Next Button Dispaly");
			try {
				Assert.assertEquals(ActualVisibleNextButton, ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-05 CHecking Next Button Dispaly is failed because of no element");
		}
	}

//	Next Button Enable

	public static void supplierNextButtonEanble() throws InterruptedException {
		try {
			boolean ActualNextBtnEnable = elements.supplierNextPageButton.isEnabled();
			boolean ExpectedNextBtnEnable = true;
			testCase = extent.createTest("STEP-06 Checking Next Button Enable");
			try {
				Assert.assertEquals(ActualNextBtnEnable, ExpectedNextBtnEnable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-06 Checking Next Button Enable is failed because of no element");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

//	Before move to 2nd page, previous button disable
	
	public static void supplierSecPagepreButDisable() throws InterruptedException {
		try {
			Thread.sleep(2000);
			boolean ActualPreviousBtnDisable = elements.supplierPreviousPageButton.isEnabled();
			boolean ExpectedPreviousBtnDisable = false;
			testCase = extent.createTest("STEP-07 Checking Before navigate to 2 Page Previous Button is Disabled");
			try {
				Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest(
					"STEP-07 Checking Before navigate to 2 Page Previous Button is Disabledc is failed because of no element");
		}

	}

//		After move to 2nd page, previous button Enable
	
	public static void supplierAfterMovetoSecPagepreButEnable() throws InterruptedException {
		try {
			elements.supplierNextPageButton.click();
			Thread.sleep(2000);
			boolean ActualPreviousBtnEnable = elements.supplierPreviousPageButton.isEnabled();
			boolean ExpectedPreviousBtnEnable = true;
			testCase = extent.createTest("STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled");
			try {
				Assert.assertEquals(ActualPreviousBtnEnable, ExpectedPreviousBtnEnable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest(
					"STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled is failed because of no element");
		}

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

//	@Test(priority = 10)
//	public static void TotalPages() throws InterruptedException {
//
//		String DataCountText = elements.paginationCount.getText();
//		System.out.println(DataCountText);
//		Pattern pattern = Pattern.compile("\\d+ of (\\d+)");
//		Matcher matcher = pattern.matcher(DataCountText);
//		if (matcher.find()) {
//			String pageCount = matcher.group(1);
//			System.out.println("Total pages: " + pageCount);
//
//			int Expected = 3;
//			testCase = extent.createTest("STEP-9 Checking Total Page for 10 Data per page");
//			try {
//				Assert.assertEquals(pageCount, Expected);
//				testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//				testCase.log(Status.PASS, "Enable element");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//				testCase.log(Status.FAIL, "Not Enable Element");
//			}
//		}
////	//testCase = extent.createTest("STEP-09 -PAGINATION-TOTAL-COUNT:" + ActualTotalPage );
//	}

	
	

	public static void supplierPages() throws InterruptedException {
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		

		// Thread.sleep(2000);
		int ActualTotalPage = 1;
		boolean Enablity = elements.supplierNextPageButton.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			elements.supplierNextPageButton.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = elements.supplierNextPageButton.isEnabled();
		}
		System.out.println(ActualTotalPage);
		Thread.sleep(2000);

		if (elements.currentPaginationOption.getText().contentEquals("10 / page")) {
			int ExpectedTotalPage = 3;
			testCase = extent.createTest("STEP-09 Checking Total Page for 10 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("20 / page")) {
			int ExpectedTotalPage = 2;
			testCase = extent.createTest("STEP-10 Checking Total Page for 20 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("30 / page")) {
			int ExpectedTotalPage = 1;
			testCase = extent.createTest("STEP-11 Checking Total Page for 30 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("100 / page")) {
			int ExpectedTotalPage = 1;
			testCase = extent.createTest("STEP-12 Checking Total Page for 100 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}

		}

		driver.navigate().refresh();
		Thread.sleep(2000);

	}
	
	
	
	
	
//	------------------------------------------------
//	EMPLOYEE pAGINATION
//	------------------------------------------------
	
	
	
	public static void employeePagination() throws InterruptedException {

		elements elem = new elements();
		
		PageFactory.initElements(driver, elem);
		Thread.sleep(1000);

		elements.mainEmployee.click();
		Thread.sleep(1000);
		
		elements.sideEmployee.click();
		Thread.sleep(1000);

	}
	

	
	public static void employeeDefaultIndexPage() throws InterruptedException {
		try {
			elements elem = new elements();
			// Default Index Page
			testCase = extent.createTest("UNIT-PAGINATION-FUNCTIONALITY");
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex = elements.employeeFirstPage.isDisplayed();
			boolean ExpectedDefaultPageIndex = true;
			testCase = extent.createTest("STEP-01 Checking Default Index Page");
			try {
				Assert.assertEquals(ActualDefaultPageIndex, ExpectedDefaultPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");

			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-01 Checking Default Index Page Failed because of no Element");
		}
	}

	
	public static void employeeRefreshDefaultPage() throws InterruptedException {
		try {
			elements elem = new elements();

			elements.employeeNextPageButton.click();
			// Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			boolean ActualDefaultPageIndex1 = elements.employeeFirstPage.isDisplayed();
			boolean ExpectedDefaultPageIndex1 = true;
			testCase = extent.createTest("STEP-02 Checking Default Index Page after Refresh");
			try {
				Assert.assertEquals(ActualDefaultPageIndex1, ExpectedDefaultPageIndex1);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualDefaultPageIndex1);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedDefaultPageIndex1);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent
					.createTest("STEP-02 Checking Default Index Page after Refresh is Failed because of no element");
		}
	}

//		Page Redirect to the next page 

	
	public static void employeePageRedrict() throws InterruptedException {
		try {
			elements elem = new elements();
			elements.employeeNextPageButton.click();
			Thread.sleep(2000);
			boolean ActualSecoundPageIndex = elements.employeeSecoundPage.isDisplayed();
			boolean ExpectedSecoundPageIndex = true;
			testCase = extent.createTest(" STEP-03 Checking Page Redriect to the next page");
			try {
				Assert.assertEquals(ActualSecoundPageIndex, ExpectedSecoundPageIndex);
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page :- " + ExpectedSecoundPageIndex);
				testCase.log(Status.PASS, "Correct Default Index Page");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Default Index Page :- " + ActualSecoundPageIndex);
				testCase.log(Status.INFO, "Expected Default Index Page:- " + ExpectedSecoundPageIndex);
				testCase.log(Status.FAIL, "Wrong Default Index Page");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent
					.createTest(" STEP-03 Checking Page Redriect to the next page is Failed because of no element");
		}
	}

//		Previous Button Displayed
	
	public static void employeePreviousButtonDispaly() throws InterruptedException {
		try {
			elements elem = new elements();
			boolean ActualVisiblePreviousButton = elements.employeePreviousPageButton.isDisplayed();
			boolean ExpectedVisiblePreviousButton = true;
			testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly");
			try {
				Assert.assertEquals(ActualVisiblePreviousButton, ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisiblePreviousButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisiblePreviousButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-04 Checking Previous Button Dispaly is failed because of no element");
		}
	}

//		Next Button Displayed
	
	public static void employeeNextButtonDispaly() throws InterruptedException {
		try {
			elements elem = new elements();
			boolean ActualVisibleNextButton = elements.employeeNextPageButton.isDisplayed();
			boolean ExpectedVisibleNextButton = true;
			testCase = extent.createTest("STEP-05 CHecking Next Button Dispaly");
			try {
				Assert.assertEquals(ActualVisibleNextButton, ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualVisibleNextButton);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisibleNextButton);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-05 CHecking Next Button Dispaly is failed because of no element");
		}
	}

//	Next Button Enable
	
	public static void employeeNextButtonEanble() throws InterruptedException {
		try {
			boolean ActualNextBtnEnable = elements.employeeNextPageButton.isEnabled();
			boolean ExpectedNextBtnEnable = true;
			testCase = extent.createTest("STEP-06 Checking Next Button Enable");
			try {
				Assert.assertEquals(ActualNextBtnEnable, ExpectedNextBtnEnable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualNextBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedNextBtnEnable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest("STEP-06 Checking Next Button Enable is failed because of no element");
		}
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

//	Before move to 2nd page, previous button disable
	
	public static void employeeSecPagepreButDisable() throws InterruptedException {
		try {
			Thread.sleep(2000);
			boolean ActualPreviousBtnDisable = elements.employeePreviousPageButton.isEnabled();
			boolean ExpectedPreviousBtnDisable = false;
			testCase = extent.createTest("STEP-07 Checking Before navigate to 2 Page Previous Button is Disabled");
			try {
				Assert.assertEquals(ActualPreviousBtnDisable, ExpectedPreviousBtnDisable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnDisable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnDisable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest(
					"STEP-07 Checking Before navigate to 2 Page Previous Button is Disabledc is failed because of no element");
		}

	}

//		After move to 2nd page, previous button Enable
	
	public static void employeeAfterMovetoSecPagepreButEnable() throws InterruptedException {
		try {
			elements.employeeNextPageButton.click();
			Thread.sleep(2000);
			boolean ActualPreviousBtnEnable = elements.employeePreviousPageButton.isEnabled();
			boolean ExpectedPreviousBtnEnable = true;
			testCase = extent.createTest("STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled");
			try {
				Assert.assertEquals(ActualPreviousBtnEnable, ExpectedPreviousBtnEnable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
				testCase.log(Status.PASS, "Enable element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualPreviousBtnEnable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPreviousBtnEnable);
				testCase.log(Status.FAIL, "Not Enable Element");
			}
		} catch (Exception e) {
			testCase.log(Status.FAIL, "No Element");
			testCase = extent.createTest(
					"STEP-08 Checking After Navigate to the Seconfd Page Previous button Enabled is failed because of no element");
		}

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

//	@Test(priority = 10)
//	public static void employeeTotalPages() throws InterruptedException {
//
//		String DataCountText = elements.paginationCount.getText();
//		System.out.println(DataCountText);
//		Pattern pattern = Pattern.compile("\\d+ of (\\d+)");
//		Matcher matcher = pattern.matcher(DataCountText);
//		if (matcher.find()) {
//			String pageCount = matcher.group(1);
//			System.out.println("Total pages: " + pageCount);
//
//			int Expected = 3;
//			testCase = extent.createTest("STEP-9 Checking Total Page for 10 Data per page");
//			try {
//				Assert.assertEquals(pageCount, Expected);
//				testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//				testCase.log(Status.PASS, "Enable element");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "ActualElement :- " + pageCount);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expected);
//				testCase.log(Status.FAIL, "Not Enable Element");
//			}
//		}
////	//testCase = extent.createTest("STEP-09 -PAGINATION-TOTAL-COUNT:" + ActualTotalPage );
//	}

	
	

	public static void employeePages() throws InterruptedException {
		

		// Thread.sleep(2000);
		int ActualTotalPage = 1;
		boolean Enablity = elements.employeeNextPageButton.isEnabled();
		while (Enablity) {
			Thread.sleep(1000);
			elements.employeeNextPageButton.click();
			ActualTotalPage = ActualTotalPage + 1;
			Enablity = elements.employeeNextPageButton.isEnabled();
		}
		System.out.println(ActualTotalPage);
		Thread.sleep(2000);

		if (elements.currentPaginationOption.getText().contentEquals("10 / page")) {
			int ExpectedTotalPage = 3;
			testCase = extent.createTest("STEP-09 Checking Total Page for 10 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("20 / page")) {
			int ExpectedTotalPage = 2;
			testCase = extent.createTest("STEP-10 Checking Total Page for 20 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("30 / page")) {
			int ExpectedTotalPage = 1;
			testCase = extent.createTest("STEP-11 Checking Total Page for 30 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}
		} else if (elements.currentPaginationOption.getText().contentEquals("100 / page")) {
			int ExpectedTotalPage = 1;
			testCase = extent.createTest("STEP-12 Checking Total Page for 100 Data per page");
			try {
				Assert.assertEquals(ActualTotalPage, ExpectedTotalPage);
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.PASS, "Correct Page Count");
			} catch (AssertionError e) {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + elements.currentPaginationOption.getText());
				testCase.log(Status.INFO, "Actual Page Count :- " + ActualTotalPage);
				testCase.log(Status.INFO, "Expected Page Count :- " + ExpectedTotalPage);
				testCase.log(Status.FAIL, "Wrong Page Count");
			}

		}

		driver.navigate().refresh();
		Thread.sleep(2000);

	}


		

	}



