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

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.mymodule.elements;

public class uimethods extends DriverIntialization {

	static elements elem = new elements();

//	SUPPLIER EXPORT BUTTON PROPERTIES
//	--------------------------------------------------

	public static void supplierExportUI() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"SUP-EXPORT\" BUTTON PROPERTIES");
		boolean ActualElement = elements.supplierExportButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//			        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.supplierExportButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(1116, 93);

		boolean Position = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//					 check font size

		String ActualFontSize = elements.supplierExportButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//					 check the size 

		Dimension ActualSize = elements.supplierExportButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(94, 32);

		boolean size = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//			            check the enable

		boolean ActualElementEnable = elements.supplierExportButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//			            check the button color

		String ActualButtonColor = elements.supplierExportButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 20, 34, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//			            check the border color

		String ActualBorderColor = elements.supplierExportButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//			            check the font type 

		String ActualFontType = elements.supplierExportButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//			                    check font color

		String ActualFontColor = elements.supplierExportButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("SUP-EXPORT-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//					cursor

		String ActualActions = elements.supplierExportButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//					text spelling

		String text = elements.supplierExportButton.getText();

		String text1 = "Export";
		boolean txt1 = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//					padding

		String Actualvalue = elements.supplierExportButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 16px";

		boolean padding = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//			  		border radius

		String Actualradius = elements.supplierExportButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "32px";

		boolean radius = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					opacity

		String Actualopacity = elements.supplierExportButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					font weight

		String Actualfontweight = elements.supplierExportButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SUP-EXPORT-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);
	}

//	-------------------------------------------------------------------------------------------------------
//	----------------------------------------------------------------------------------------------------------
//	----------------------------------------------------------------------------------------------------------

//	SUPPLIER IMPORT BUTTON PROPERTIES
//	--------------------------------------------------

	public static void supplierImportUI() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		// check if element visible
		testCase = extent.createTest("STEP 2 - CHECKING THE \"SUP-IMPORT\" BUTTON PROPERTIES");
		boolean ActualElement = elements.supplierImportButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//			        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.supplierImportButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(588, 93);

		boolean Position = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//					 check font size

		String ActualFontSize = elements.supplierImportButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//					 check the size 

		Dimension ActualSize = elements.supplierImportButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(180, 32);

		boolean size = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//			            check the enable

		boolean ActualElementEnable = elements.supplierImportButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//			            check the button color

		String ActualButtonColor = elements.supplierImportButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//			            check the border color

		String ActualBorderColor = elements.supplierImportButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//			            check the font type 

		String ActualFontType = elements.supplierImportButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//			                    check font color

		String ActualFontColor = elements.supplierImportButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("SUP-IMPORT-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//					cursor

		String ActualActions = elements.supplierImportButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//					text spelling

		String text = elements.supplierImportButton.getText();

		String text1 = "Add SBU";
		boolean txt1 = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//					padding

		String Actualvalue = elements.supplierImportButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//			  		border radius

		String Actualradius = elements.supplierImportButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					opacity

		String Actualopacity = elements.supplierImportButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					font weight

		String Actualfontweight = elements.supplierImportButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SUP-IMPORT-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);
	}

//--------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------

//EMPLOYEE EXPORT BUTTON PROPERTIES
//--------------------------------------------------

	public static void employeeExportButtonUI() throws InterruptedException {
		PageFactory.initElements(driver, elem);

		// check if element visible
		testCase = extent.createTest("STEP 1 - CHECKING THE \"EMP-EXPORT\" BUTTON PROPERTIES");
		boolean ActualElement = elements.employeeExportButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.employeeExportButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(588, 93);

		boolean Position = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//		 check font size

		String ActualFontSize = elements.employeeExportButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//		 check the size 

		Dimension ActualSize = elements.employeeExportButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(180, 32);

		boolean size = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//            check the enable

		boolean ActualElementEnable = elements.employeeExportButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//            check the button color

		String ActualButtonColor = elements.employeeExportButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//            check the border color

		String ActualBorderColor = elements.employeeExportButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//            check the font type 

		String ActualFontType = elements.employeeExportButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//                    check font color

		String ActualFontColor = elements.employeeExportButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("EMP-EXPORT-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//		cursor

		String ActualActions = elements.employeeExportButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//		text spelling

		String text = elements.employeeExportButton.getText();

		String text1 = "Add SBU";
		boolean txt1 = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//		padding

		String Actualvalue = elements.employeeExportButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//  		border radius

		String Actualradius = elements.employeeExportButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		opacity

		String Actualopacity = elements.employeeExportButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		font weight

		String Actualfontweight = elements.employeeExportButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("EMP-EXPORT-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

//----------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------

//EMPLOYEE IMPORT BUTTON PROPERTIES
//--------------------------------------------------

	public static void employeeImportButtonUI() throws InterruptedException {
		PageFactory.initElements(driver, elem);

		// check if element visible
		testCase = extent.createTest("STEP 1 - CHECKING THE \"EMP-IMPORT\" BUTTON PROPERTIES");
		boolean ActualElement = elements.employeeImportButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.employeeImportButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(588, 93);

		boolean Position = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//		 check font size

		String ActualFontSize = elements.employeeImportButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//		 check the size 

		Dimension ActualSize = elements.employeeImportButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(180, 32);

		boolean size = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//            check the enable

		boolean ActualElementEnable = elements.employeeImportButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//            check the button color

		String ActualButtonColor = elements.employeeImportButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//            check the border color

		String ActualBorderColor = elements.employeeImportButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//            check the font type 

		String ActualFontType = elements.employeeImportButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//                    check font color

		String ActualFontColor = elements.employeeImportButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("EMP-IMPORT-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//		cursor

		String ActualActions = elements.employeeImportButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//		text spelling

		String text = elements.employeeImportButton.getText();

		String text1 = "Add SBU";
		boolean txt1 = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//		padding

		String Actualvalue = elements.employeeImportButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//  		border radius

		String Actualradius = elements.employeeImportButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + ActualActions);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		opacity

		String Actualopacity = elements.employeeImportButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		font weight

		String Actualfontweight = elements.employeeImportButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("EMP-IMPORT-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

//  SUPPLIER EXPORT
//----------------------------------------------------------------

	public static void supplierExport() throws InterruptedException {

		elements.supplierExportButton.click();

		Thread.sleep(3000);

		File fileLocation = new File("C:\\Users\\sgic\\Downloads");

		boolean isFileExist = false;

		// List the total files
		File[] totalFiles = fileLocation.listFiles();

		for (File file : totalFiles) {

			if (file.getName().equals("supplier.csv")) {

				System.out.println("File is downloaded");

				// if find the file name stop the loop
				isFileExist = true;
				break;

			}
		}

		boolean Expectedweight = true;
		testCase = extent.createTest("SUPPLIER EXPORT");
		if (isFileExist == true) {
			AssertJUnit.assertEquals(isFileExist, Expectedweight);
			System.out.println(isFileExist);
			System.out.println(Expectedweight);
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.FAIL, "wrong");
		}
	}

//   EMPLOYEE EXPORT
//----------------------------------------------------------------------------------

	public static void employeeExport() throws InterruptedException {

		elements.employeeExportButton.click();

		Thread.sleep(3000);

		File fileLocation = new File("C:\\Users\\sgic\\Downloads");

		boolean isFileExist = false;

		// List the total files
		File[] totalFiles = fileLocation.listFiles();

		for (File file : totalFiles) {

			if (file.getName().equals("employee.csv")) {

				System.out.println("File is downloaded");

				// if find the file name stop the loop
				isFileExist = true;
				break;

			}
		}

		boolean Expectedweight = true;
		testCase = extent.createTest("EMPLOYEE EXPORT");
		if (isFileExist == true) {
			AssertJUnit.assertEquals(isFileExist, Expectedweight);
			System.out.println(isFileExist);
			System.out.println(Expectedweight);
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.PASS, "correct");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + isFileExist);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
			testCase.log(Status.FAIL, "wrong");
		}
	}

//   EMPLOYEE ACTIVATION THROUGH ADD BUTTON 
//   -----------------------------------------------------------

	public void employeeActivate() {

	}

// ADD SUPPLIER BUTTON PROPERTIES
// --------------------------------------------------

	public static void addSupplierButtonUI() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"ADD SUPPLIER\" BUTTON PROPERTIES");
		boolean ActualElement = elements.addSupplierButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//	        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.addSupplierButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(1225, 93);

		boolean Position = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//			 check font size

		String ActualFontSize = elements.addSupplierButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//			 check the size 

		Dimension ActualSize = elements.addSupplierButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(120, 32);

		boolean size = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//	            check the enable

		boolean ActualElementEnable = elements.addSupplierButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//	            check the button color

		String ActualButtonColor = elements.addSupplierButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//	            check the border color

		String ActualBorderColor = elements.addSupplierButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//	            check the font type 

		String ActualFontType = elements.addSupplierButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//	                    check font color

		String ActualFontColor = elements.addSupplierButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//			cursor

		String ActualActions = elements.addSupplierButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//			text spelling

		String text = elements.addSupplierButton.getText();

		String text1 = "Add Supplier";
		boolean txt1 = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//			padding

		String Actualvalue = elements.addSupplierButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//	  		border radius

		String Actualradius = elements.addSupplierButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//			opacity

		String Actualopacity = elements.addSupplierButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//			font weight

		String Actualfontweight = elements.addSupplierButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("ADD SUPPLIER-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

//	selecting supplier category dropdown 
//	--------------------------------------------------

	public static void addSupplierDropdown() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		String value = null;
		for (WebElement option : elements.supplierCategoryOption) {
			value = option.getText();
			Thread.sleep(3000);
			System.out.println(value);
			if (value.contentEquals("Cement Supplier"))
				Thread.sleep(2000);
			System.out.println(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]")).click();
		}
		String Actualvaluse = value;
		String Expectedvalue = "Cement Supplier";

		boolean select = true;
		testCase = extent.createTest("ADD SUPPLIER DROPDOWN");
		try {
			AssertJUnit.assertEquals(Actualvaluse, Expectedvalue);

		} catch (AssertionError e) {
			select = false;
		}
		if (select) {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct option");
		} else {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong option");
		}
		Thread.sleep(1000);

	}

// sending values to the fields 
// ----------------------------------------

	public static void addSupplierSendValues() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		Thread.sleep(500);
		elements.supplierField.click();
		elements.supplierField.sendKeys("supplierone");

		Thread.sleep(500);
		elements.contactNoField.click();
		elements.contactNoField.sendKeys("0770781234");

		Thread.sleep(500);
		elements.emailField.click();
		elements.emailField.sendKeys("sayan@gmail.com");

		Thread.sleep(500);
		elements.addressField.click();
		elements.addressField.sendKeys("jaffna");

	}

//	selecting plant dropdown 
//	--------------------------------------------------

	public static void addPlantDropdown() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		String value = null;
		for (WebElement option : elements.plantOption) {
			value = option.getText();
			Thread.sleep(3000);
			System.out.println(value);
			if (value.contentEquals("RMC Ankanda Plant"))
				Thread.sleep(2000);
			System.out.println(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[3]")).click();
		}
		String Actualvaluse = value;
		String Expectedvalue = "RMC Ankanda Plant";

		boolean drop = true;
		testCase = extent.createTest("ADD PLANT DROPDOWN");
		try {
			AssertJUnit.assertEquals(Actualvaluse, Expectedvalue);

		} catch (AssertionError e) {
			drop = false;
		}
		if (drop) {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct option");
		} else {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong option");
		}
		Thread.sleep(1000);

	}

//SUPPLIER SAVE BUTTON PROPERTIES
//--------------------------------------------------

	public static void supplierSaveButtonUI() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"SUPPLIER-SAVE\" BUTTON PROPERTIES");
		boolean ActualElement = elements.supplierSaveButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//		        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.supplierSaveButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(872, 459);

		boolean Position = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//				 check font size

		String ActualFontSize = elements.supplierSaveButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//				 check the size 

		Dimension ActualSize = elements.supplierSaveButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(30, 22);

		boolean size = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//		            check the enable

		boolean ActualElementEnable = elements.supplierSaveButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//		            check the button color

		String ActualButtonColor = elements.supplierSaveButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 0, 0, 0)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//		            check the border color

		String ActualBorderColor = elements.supplierSaveButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//		            check the font type 

		String ActualFontType = elements.supplierSaveButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//		                    check font color

		String ActualFontColor = elements.supplierSaveButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//				cursor

		String ActualActions = elements.supplierSaveButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//				text spelling

		String text = elements.supplierSaveButton.getText();

		String text1 = "Save";
		boolean txt1 = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//				padding

		String Actualvalue = elements.supplierSaveButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "0px";

		boolean padding = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		  		border radius

		String Actualradius = elements.supplierSaveButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "0px";

		boolean radius = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				opacity

		String Actualopacity = elements.supplierSaveButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				font weight

		String Actualfontweight = elements.supplierSaveButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SUPPLIER-SAVE-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

// CHECKING LAST ADDED VALUE COMES FIRST ROW 
// -------------------------------------------------

	public static void checkLastAddvalue() throws InterruptedException {
		PageFactory.initElements(driver, elem);
		Thread.sleep(2000);
		String actualdata = elements.supplierFirstRow.getText();
		System.out.println("First row of table : " + actualdata);
		String expecteddata = "supplierone";
//     TestCasePrint("CHECK THE LAST ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE", expecteddata, actualdata);

		boolean last = true;
		testCase = extent.createTest("ADDED DATA COMES FIRST ROW");
		try {
			AssertJUnit.assertEquals(actualdata, expecteddata);

		} catch (AssertionError e) {
			last = false;
		}
		if (last) {
			testCase.log(Status.INFO, "actualdata :- " + actualdata);
			testCase.log(Status.INFO, "expecteddata :- " + expecteddata);
			testCase.log(Status.PASS, "Correct Data");
		} else {
			testCase.log(Status.INFO, "actualdata :- " + actualdata);
			testCase.log(Status.INFO, "expecteddata :- " + expecteddata);
			testCase.log(Status.FAIL, "Wrong Data");
		}
		Thread.sleep(1000);

	}

	// modal close

// public static void modalClose() throws InterruptedException {
//     PageFactory.initElements(driver, elem);
//     elements.adduserscancelbutton.click();
////
////     Actions action = new Actions(driver);
////     action.moveByOffset(0, 0).click().build().perform();
//     boolean AcctualAfterClick = elements.modal.isDisplayed();
//     boolean ExpectedAfterClick = true;
//     TestCasePrint("MODAL-INVISIBLE-ONCLICK-OUTSIDE", ExpectedAfterClick, AcctualAfterClick);
// }

//  SUPPLIER CANCEL BUTTON PROPERTIES
// ----------------------------------------------------

	public static void supplierCancelButtonUI() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"SUPPLIER-CANCEL\" BUTTON PROPERTIES");
		boolean ActualElement = elements.supplierCancelButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//				        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.supplierCancelButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(774, 454);

		boolean Position = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//						 check font size

		String ActualFontSize = elements.supplierCancelButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//						 check the size 

		Dimension ActualSize = elements.supplierCancelButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(75, 32);

		boolean size = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//				            check the enable

		boolean ActualElementEnable = elements.supplierCancelButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//				            check the button color

		String ActualButtonColor = elements.supplierCancelButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//				            check the border color

		String ActualBorderColor = elements.supplierCancelButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//				            check the font type 

		String ActualFontType = elements.supplierCancelButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//				                    check font color

		String ActualFontColor = elements.supplierCancelButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(0, 0, 0, 0.85)";
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//						cursor

		String ActualActions = elements.supplierCancelButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//						text spelling

		String text = elements.supplierCancelButton.getText();

		String text1 = "Cancel";
		boolean txt1 = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//						padding

		String Actualvalue = elements.supplierCancelButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				  		border radius

		String Actualradius = elements.supplierCancelButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//						opacity

		String Actualopacity = elements.supplierCancelButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//						font weight

		String Actualfontweight = elements.supplierCancelButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SUPPLIER-CANCEL-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

	public static void modalClose() throws InterruptedException {
		PageFactory.initElements(driver, elem);

//	     elements.adduserscancelbutton.click();
		//
//	     Actions action = new Actions(driver);
//	     action.moveByOffset(0, 0).click().build().perform();
		boolean AcctualAfterClick = elements.supplierModal.isDisplayed();

		boolean ExpectedAfterClick = false;

		testCase = extent.createTest("SUPPLIER MODAL CLOSING");
		try {
			AssertJUnit.assertEquals(AcctualAfterClick, ExpectedAfterClick);

		} catch (AssertionError e) {
			ExpectedAfterClick = true;
		}
		if (ExpectedAfterClick) {
			testCase.log(Status.INFO, "AcctualAfterClick :- " + AcctualAfterClick);
			testCase.log(Status.INFO, "Expectedfontweight :- " + ExpectedAfterClick);
			testCase.log(Status.PASS, "Modal is closed");
		} else {
			testCase.log(Status.INFO, "AcctualAfterClick :- " + AcctualAfterClick);
			testCase.log(Status.INFO, "ExpectedAfterClick :- " + ExpectedAfterClick);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

//	ADD EMPLOYEE
//	 ------------------------------------

//	 Add Employee button properties 
//	 ----------------------------------------

	public static void addEmployeeButtonProperties() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"ADD EMPLOYEE\" BUTTON PROPERTIES");
		boolean ActualElement = elements.addEmployeeButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//		        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.addEmployeeButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(1214, 93);

		boolean Position = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//				 check font size

		String ActualFontSize = elements.addEmployeeButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//				 check the size 

		Dimension ActualSize = elements.addEmployeeButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(120, 32);

		boolean size = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//		            check the enable

		boolean ActualElementEnable = elements.addEmployeeButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//		            check the button color

		String ActualButtonColor = elements.addEmployeeButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//		            check the border color

		String ActualBorderColor = elements.addEmployeeButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//		            check the font type 

		String ActualFontType = elements.addEmployeeButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//		                    check font color

		String ActualFontColor = elements.addEmployeeButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//				cursor

		String ActualActions = elements.addEmployeeButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//				text spelling

		String text = elements.addEmployeeButton.getText();

		String text1 = "Add Employee";
		boolean txt1 = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//				padding

		String Actualvalue = elements.addEmployeeButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		  		border radius

		String Actualradius = elements.addEmployeeButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				opacity

		String Actualopacity = elements.addEmployeeButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				font weight

		String Actualfontweight = elements.addEmployeeButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("ADD EMPLOYEE-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

//		selecting Plant dropdown 
//		--------------------------------------------------

	public static void plantDropdown() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		String value = null;
		for (WebElement option : elements.plantDropdownOptions) {

			value = option.getText();
			Thread.sleep(3000);
			System.out.println(value);
			if (value.contentEquals("RMC Balangoda Plant"))
				Thread.sleep(2000);
			System.out.println(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[3]")).click();
		}
		String Actualvaluse = value;
		String Expectedvalue = "RMC Balangoda Plant";

		boolean Position = true;
		testCase = extent.createTest("PLANT DROPDOWN");
		try {
			AssertJUnit.assertEquals(Actualvaluse, Expectedvalue);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct option");
		} else {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong option");
		}
		Thread.sleep(1000);

	}

	// sending values to the fields
	// ----------------------------------------

	public static void addEmployeeSendValues() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		Thread.sleep(500);
		elements.firstNameField.click();
		elements.firstNameField.sendKeys("sayanthan");

		Thread.sleep(500);
		elements.lastNameField.click();
		elements.lastNameField.sendKeys("sayanthan");

		Thread.sleep(500);
		elements.employeeAddressField.click();
		elements.employeeAddressField.sendKeys("kilinochi");

		Thread.sleep(500);
		elements.employeeContactNoField.click();
		elements.employeeContactNoField.sendKeys("0778898898");

		Thread.sleep(500);
		elements.employeeEmailField.click();
		elements.employeeEmailField.sendKeys("sayanthan@gmail.com");

	}

//		selecting Designation dropdown 
//		--------------------------------------------------

	public static void designationDropdown() throws InterruptedException {

		PageFactory.initElements(driver, elem);

		String value = null;
		for (WebElement option : elements.designationDropdownOptions) {
			value = option.getText();
			Thread.sleep(3000);
			System.out.println(value);
			if (value.contentEquals("Logistic Officer"))
				Thread.sleep(2000);
			System.out.println(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[7]")).click();
		}
		String Actualvaluse = value;
		String Expectedvalue = "Logistic Officer";

		boolean designation = true;
		testCase = extent.createTest("DESIGNATION DROPDOWN");
		try {
			AssertJUnit.assertEquals(Actualvaluse, Expectedvalue);

		} catch (AssertionError e) {
			designation = false;
		}
		if (designation) {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct option");
		} else {
			testCase.log(Status.INFO, "Actualvaluse :- " + Actualvaluse);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong option");
		}
		Thread.sleep(1000);

	}

	// EMPLOYEE SAVE BUTTON PROPERTIES
	// --------------------------------------------------

	public static void employeeSaveButtonUI() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"EMPLOYEE-SAVE\" BUTTON PROPERTIES");
		boolean ActualElement = elements.employeeSaveButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//			        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.employeeSaveButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(952, 542);

		boolean Position = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//					 check font size

		String ActualFontSize = elements.employeeSaveButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//					 check the size 

		Dimension ActualSize = elements.employeeSaveButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(60, 32);

		boolean size = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//			            check the enable

		boolean ActualElementEnable = elements.employeeSaveButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//			            check the button color

		String ActualButtonColor = elements.employeeSaveButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//			            check the border color

		String ActualBorderColor = elements.employeeSaveButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//			            check the font type 

		String ActualFontType = elements.employeeSaveButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//			                    check font color

		String ActualFontColor = elements.employeeSaveButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//					cursor

		String ActualActions = elements.employeeSaveButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//					text spelling

		String text = elements.employeeSaveButton.getText();

		String text1 = "Save";
		boolean txt1 = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//					padding

		String Actualvalue = elements.employeeSaveButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//			  		border radius

		String Actualradius = elements.employeeSaveButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					opacity

		String Actualopacity = elements.employeeSaveButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//					font weight

		String Actualfontweight = elements.employeeSaveButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("EMPLOYEE-SAVE-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

	// CHECKING LAST ADDED VALUE COMES FIRST ROW
	// -------------------------------------------------

	public static void employeecheckLastAddvalue() throws InterruptedException {
		PageFactory.initElements(driver, elem);
		Thread.sleep(2000);
		String actualdata = elements.employeeFirstRow.getText();
		System.out.println("First row of table : " + actualdata);
		String expecteddata = "sayanthan";
//	     TestCasePrint("CHECK THE LAST ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE", expecteddata, actualdata);

		boolean firstrow = true;
		testCase = extent.createTest("ADDED DATA COMES FIRST ROW");
		try {
			AssertJUnit.assertEquals(actualdata, expecteddata);

		} catch (AssertionError e) {
			firstrow = false;
		}
		if (firstrow) {
			testCase.log(Status.INFO, "actualdata :- " + actualdata);
			testCase.log(Status.INFO, "expecteddata :- " + expecteddata);
			testCase.log(Status.PASS, "Correct Data");
		} else {
			testCase.log(Status.INFO, "actualdata :- " + actualdata);
			testCase.log(Status.INFO, "expecteddata :- " + expecteddata);
			testCase.log(Status.FAIL, "Wrong Data");
		}
		Thread.sleep(1000);

	}

	public static void empoyeeModalClose() throws InterruptedException {
		PageFactory.initElements(driver, elem);

//	     Actions action = new Actions(driver);
//	     action.moveByOffset(0, 0).click().build().perform();
		boolean AcctualAfterClick = elements.employeeModal.isDisplayed();

		boolean ExpectedAfterClick = false;

		testCase = extent.createTest("EMPLOYEE MODAL CLOSING");
		try {
			AssertJUnit.assertEquals(AcctualAfterClick, ExpectedAfterClick);

		} catch (AssertionError e) {
			ExpectedAfterClick = true;
		}
		if (ExpectedAfterClick) {
			testCase.log(Status.INFO, "AcctualAfterClick :- " + AcctualAfterClick);
			testCase.log(Status.INFO, "Expectedfontweight :- " + ExpectedAfterClick);
			testCase.log(Status.PASS, "Modal is closed");
		} else {
			testCase.log(Status.INFO, "AcctualAfterClick :- " + AcctualAfterClick);
			testCase.log(Status.INFO, "ExpectedAfterClick :- " + ExpectedAfterClick);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

	public static void employeeCancelButtonUI() throws InterruptedException {

		// check if element visible
		testCase = extent.createTest("CHECKING THE \"EMPLOYEE-CANCEL\" BUTTON PROPERTIES");
		boolean ActualElement = elements.employeeCancelButton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-VISIBILITY");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);

		} catch (AssertionError e) {

			visibility = false;

//		        	  throw(e);
		}
		if (visibility) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.FAIL, "No element");

		}
		Thread.sleep(1000);

		// check position

		Point ActualLocation = elements.employeeCancelButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(869, 542);

		boolean Position = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(1000);

//				 check font size

		String ActualFontSize = elements.employeeCancelButton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-FONT-SIZE");
		try {
			AssertJUnit.assertEquals(ActualFontSize, ExpectedFontSize);

		} catch (AssertionError e) {
			Fontsize = false;
		}
		if (Fontsize) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedFontSize);
			testCase.log(Status.PASS, "Correct Font Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualFontSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedFontSize);
			testCase.log(Status.FAIL, "Wrong Font Size");
		}
		Thread.sleep(1000);

//				 check the size 

		Dimension ActualSize = elements.employeeCancelButton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(75, 32);

		boolean size = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

//		            check the enable

		boolean ActualElementEnable = elements.employeeCancelButton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-ENABLE");
		try {
			AssertJUnit.assertEquals(ActualElementEnable, ExpectedElementEnable);

		} catch (AssertionError e) {
			enablity = false;
		}
		if (enablity) {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.PASS, "Element enable");
		} else {
			testCase.log(Status.INFO, "ActualElementEnable :- " + ActualElementEnable);
			testCase.log(Status.INFO, "ExpectedElementEnable :- " + ExpectedElementEnable);
			testCase.log(Status.FAIL, "Element is not enable");
		}
		Thread.sleep(1000);

//		            check the button color

		String ActualButtonColor = elements.employeeCancelButton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(1000);

//		            check the border color

		String ActualBorderColor = elements.employeeCancelButton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(1000);

//		            check the font type 

		String ActualFontType = elements.employeeCancelButton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-FONT-TYPE");
		try {
			AssertJUnit.assertEquals(ActualFontType, ExpectedFontType);

		} catch (AssertionError e) {
			fonttype = false;
		}
		if (fonttype) {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.PASS, "Correct Font Type");
		} else {
			testCase.log(Status.INFO, "ActualFontType :- " + ActualFontType);
			testCase.log(Status.INFO, "ExpectedFontType :- " + ExpectedFontType);
			testCase.log(Status.FAIL, "Wrong Font Type");
		}
		Thread.sleep(1000);

//		                    check font color

		String ActualFontColor = elements.employeeCancelButton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(0, 0, 0, 0.85)";
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-FONT-COLOUR");
		try {
			AssertJUnit.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(1000);

//				cursor

		String ActualActions = elements.employeeCancelButton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-CURSOR");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(1000);

//				text spelling

		String text = elements.employeeCancelButton.getText();

		String text1 = "Cancel";
		boolean txt1 = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-SPELLING");

		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(1000);

//				padding

		String Actualvalue = elements.employeeCancelButton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-PADDING");
		try {
			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//		  		border radius

		String Actualradius = elements.employeeCancelButton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-RADIUS");
		try {
			AssertJUnit.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			padding = false;
		}
		if (padding) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				opacity

		String Actualopacity = elements.employeeCancelButton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-OPACITY");
		try {
			AssertJUnit.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(1000);

//				font weight

		String Actualfontweight = elements.employeeCancelButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("EMPLOYEE-CANCEL-BUTTON-FONT-WEIGHT");
		try {
			AssertJUnit.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(1000);

	}

}
