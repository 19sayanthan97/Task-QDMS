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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;



public class sbumethods extends DriverIntialization {

	static AddSbuFunPage AddSbuFunpg = new AddSbuFunPage();

	public static void Addsbu() throws InterruptedException {
		PageFactory.initElements(driver, AddSbuFunpg);

		// check if element visible
		testCase = extent.createTest("STEP 1 - CHECKING THE \"ADD SBU\" BUTTON PROPERTIES");
		boolean ActualElement = AddSbuFunPage.AddSBU.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-VISIBILITY");
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

		Point ActualLocation = AddSbuFunPage.AddSBU.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(588, 93);

		boolean Position = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-POSITION");
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

		String ActualFontSize = AddSbuFunPage.AddSBU.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-FONT-SIZE");
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

		Dimension ActualSize = AddSbuFunPage.AddSBU.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(180, 32);

		boolean size = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-SIZE");
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

		boolean ActualElementEnable = AddSbuFunPage.AddSBU.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-ENABLE");
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

		String ActualButtonColor = AddSbuFunPage.AddSBU.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-COLOR");
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

		String ActualBorderColor = AddSbuFunPage.AddSBU.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-BORDER-COLOR");
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

		String ActualFontType = AddSbuFunPage.AddSBU.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-FONT-TYPE");
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

		String ActualFontColor = AddSbuFunPage.AddSBU.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("ADD-SBU-BUTTON-FONT-COLOUR");
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

		String ActualActions = AddSbuFunPage.AddSBU.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-CURSOR");
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

		String text = AddSbuFunPage.AddSBU.getText();

		String text1 = "Add SBU";
		boolean txt1 = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-SPELLING");

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

		String Actualvalue = AddSbuFunPage.AddSBU.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-PADDING");
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

//	  		border radius

		String Actualradius = AddSbuFunPage.AddSBU.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-RADIUS");
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

//			opacity

		String Actualopacity = AddSbuFunPage.AddSBU.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-OPACITY");
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

		String Actualfontweight = AddSbuFunPage.AddSBU.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("ADD-SBU-BUTTON-FONT-WEIGHT");
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

// --------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------
//  

	public static void sbumodal() throws InterruptedException {

		PageFactory.initElements(driver, AddSbuFunpg);

		// ***** element visible test
		testCase = extent.createTest("STEP 3 - CHECKING THE \"ADD SBU\" POP-UP SCREEN PROPERTIES");
		boolean AcctualVisible = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedVisible = true;

		boolean elementvisible = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualVisible, ExpectedVisible);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(1000);

		// ***** element position test

		Point ActualLocation = AddSbuFunPage.sbumodal.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(383, 100);

		boolean Position = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-POSITION");
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

		// ***** element size

		Dimension ActualSize = AddSbuFunPage.sbumodal.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 230);

		boolean size = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correcrt size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(1000);

		// ***** element background-color

		String ActualButtonColor = AddSbuFunPage.sbumodal.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-BACKGROUND-COLOR");
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

		// ***** element border-color

		String ActualBorderColor = AddSbuFunPage.sbumodal.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-BORDER-COLOR");
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

		// ***** element overflow

		String ActualOverflow = AddSbuFunPage.sbumodal.getCssValue("overflow");
		System.out.println("overflow :" + ActualOverflow);

		String ExpectedOverflow = "visible";

		boolean overflow = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-OVERFLOW-TYPE");
		try {
			AssertJUnit.assertEquals(ActualOverflow, ExpectedOverflow);

		} catch (AssertionError e) {
			overflow = false;
		}
		if (overflow) {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.PASS, "Correct overflow");
		} else {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.FAIL, "Wrong overflow");
		}
		Thread.sleep(1000);

		// ***** element margin

		String ActualMargin = AddSbuFunPage.sbumodal.getCssValue("margin");
		System.out.println("margin :" + ActualMargin);

		String ExpectedMargin = "0px";

		boolean margin = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-MARGIN-TYPE");
		try {
			AssertJUnit.assertEquals(ActualMargin, ExpectedMargin);

		} catch (AssertionError e) {
			margin = false;
		}
		if (margin) {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.PASS, "Correct Margin");
		} else {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.FAIL, "Wrong Margin");
		}
		Thread.sleep(1000);

		// ***** element cursor

		String ActualActions = AddSbuFunPage.sbumodal.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-CURSOR-TYPE");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "correct cursor type");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "wrong cursor type");
		}
		Thread.sleep(1000);

		// ***** element z- index

		String ActualZindex = AddSbuFunPage.sbumodal.getCssValue("z-index");
		System.out.println("z-index :" + ActualZindex);
		String ExpectedZindex = "auto";

		boolean z_index = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-Z-INDEX-TYPE");
		try {
			AssertJUnit.assertEquals(ActualZindex, ExpectedZindex);

		} catch (AssertionError e) {
			z_index = false;
		}
		if (z_index) {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct z-index  type");
		} else {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong z-index type");
		}
		Thread.sleep(1000);

		// ***** click-on element

		// identify modal header

		String modalActual = AddSbuFunPage.sbumodalheader.getText();
		System.out.println("Modal Dialog header: " + modalActual);

		String modalExpected = "Add SBU";

		boolean modalHeader = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-HEADER");
		try {
			AssertJUnit.assertEquals(modalActual, modalExpected);

		} catch (AssertionError e) {
			modalHeader = false;
		}
		if (modalHeader) {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct modal header");
		} else {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong modal header");
		}
		Thread.sleep(1000);

		// identify modal content

		String ActualmodalContent = AddSbuFunPage.sbumodalcontent.getText();
		System.out.println(ActualmodalContent);
		String ExpectedModalContent = "Sub Business Unit:" + "\n" + "Description:";

		boolean modalContent = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-CONTENT");
		try {
			AssertJUnit.assertEquals(ActualmodalContent, ExpectedModalContent);

		} catch (AssertionError e) {
			modalContent = false;
		}
		if (modalContent) {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.PASS, "correct modal content");
		} else {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.FAIL, "wrong modal content");
		}
		Thread.sleep(1000);

		// click on inside of modal

		AddSbuFunPage.sbumodal.click();
		Thread.sleep(1000);

		boolean AcctualAfterClickinside = AddSbuFunPage.sbumodal.isDisplayed();
		boolean ExpectedAfterClickinside = true;

		boolean elementvisibleafterclickinside = true;
		testCase = extent.createTest("ADD-SBU POP-UP SCREEN-INVISIBLE-ONCLICK-INSIDE");
		try {
			AssertJUnit.assertEquals(AcctualAfterClickinside, ExpectedAfterClickinside);
		} catch (AssertionError e) {
			elementvisibleafterclickinside = false;
		}
		if (elementvisibleafterclickinside) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);

			testCase.log(Status.PASS, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);

			testCase.log(Status.FAIL, "Modal invisible");
		}
		Thread.sleep(1000);

	}

//  ----------------------------------------------------------------------------------------------------------
//  ----------------------------------------------------------------------------------------------------------
//	

	public static void sbusavebutton() throws InterruptedException {

		PageFactory.initElements(driver, AddSbuFunpg);

		// check if element visible
		testCase = extent.createTest("STEP 5 - CHECKING THE \"Save\" BUTTON-PROPERTIES");
		boolean ActualElement = AddSbuFunPage.SBUsavebutton.isDisplayed();
		boolean ExpectedElement = true;

		boolean visibility = true;
		testCase = extent.createTest("SAVE BUTTON-VISIBILITY");
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

		Point ActualLocation = AddSbuFunPage.SBUsavebutton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(907, 288);

		boolean Position = true;
		testCase = extent.createTest("SAVE BUTTON-POSITION");
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

		String ActualFontSize = AddSbuFunPage.SBUsavebutton.getCssValue("font-size");
		System.out.println("Font Size: " + ActualFontSize);
		String ExpectedFontSize = "14px";

		boolean Fontsize = true;
		testCase = extent.createTest("SAVE BUTTON-FONT-SIZE");
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

		Dimension ActualSize = AddSbuFunPage.SBUsavebutton.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(60, 32);

		boolean size = true;
		testCase = extent.createTest("SAVE BUTTON-SIZE");
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

		boolean ActualElementEnable = AddSbuFunPage.SBUsavebutton.isEnabled();
		boolean ExpectedElementEnable = true;

		boolean enablity = true;
		testCase = extent.createTest("SAVE BUTTON-ENABLE");
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

		String ActualButtonColor = AddSbuFunPage.SBUsavebutton.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);

		String ExpectedButtonColor = "rgba(0, 19, 40, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("SAVE BUTTON-COLOR");
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

		String ActualBorderColor = AddSbuFunPage.SBUsavebutton.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = " ";

		boolean bordercolor = true;
		testCase = extent.createTest("SAVE BUTTON-BORDER-COLOR");
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

		String ActualFontType = AddSbuFunPage.SBUsavebutton.getCssValue("font-type");
		System.out.println("Font type: " + ActualFontType);

		String ExpectedFontType = "";

		// input[@id='sub_business_unit']

		boolean fonttype = true;
		testCase = extent.createTest("SAVE BUTTON-FONT-TYPE");
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

		String ActualFontColor = AddSbuFunPage.SBUsavebutton.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(255, 255, 255, 1)";
		testCase = extent.createTest("SAVE BUTTON-FONT-COLOUR");
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

		String ActualActions = AddSbuFunPage.SBUsavebutton.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("SAVE BUTTON-CURSOR");
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

		String text = AddSbuFunPage.SBUsavebutton.getText();

		String text1 = "Save";
		boolean txt1 = true;
		testCase = extent.createTest("SAVE BUTTON-SPELLING");

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

		String Actualvalue = AddSbuFunPage.SBUsavebutton.getCssValue("padding");
		System.out.println("paddingvalue :" + Actualvalue);
		String Expectedvalue = "4px 15px";

		boolean padding = true;
		testCase = extent.createTest("SAVE BUTTON-PADDING");
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

		String Actualradius = AddSbuFunPage.SBUsavebutton.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean radius = true;
		testCase = extent.createTest("SAVE BUTTON-RADIUS");
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

		String Actualopacity = AddSbuFunPage.SBUsavebutton.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("SAVE BUTTON-OPACITY");
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

		String Actualfontweight = AddSbuFunPage.SBUsavebutton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("SAVE BUTTON-FONT-WEIGHT");
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
	
	static String sbu = null;
	public static void execldata() throws InterruptedException, IOException {

		PageFactory.initElements(driver, AddSbuFunpg);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {

			XSSFRow row = sheet.getRow(i);

			 sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();

			Thread.sleep(1000);
//			AddSbuFunPage.AddSBU.click();

			AddSbuFunPage.SBUtext.sendKeys(sbu);
			AddSbuFunPage.SBUdestext.sendKeys(description);

			Thread.sleep(1000);
		}

	}
	
	

	public static  void checkLastAddedvalue() throws InterruptedException, IOException {

		PageFactory.initElements(driver, AddSbuFunpg);
		
		Thread.sleep(1000);
		
		String actualdata = AddSbuFunPage.tableRow.getText();
		System.out.println("First row of table : " + actualdata);

		
		String expecteddata =sbu;

		boolean firstdata = true;
		testCase = extent.createTest("STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE");
		try {
			AssertJUnit.assertEquals(actualdata, expecteddata); 

		} catch (AssertionError e) {
			firstdata = false;
		}
		if (firstdata) {
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);

			testCase.log(Status.PASS, "Correct last added data");
		} else {
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);

			testCase.log(Status.FAIL, "Wrong last added data");
		}
	}
	
	
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
	
	 public static void addSubButtonClick() throws InterruptedException {
	        
		 
		 PageFactory.initElements(driver, AddSbuFunpg);
	        
	        testCase = extent.createTest("STEP 2 - CLICK THE \"ADD SBU\" BUTTON");
	        
	        Thread.sleep(1000);
	        
	        //WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/img"));
	        
	        boolean AcctualVisible = AddSbuFunPage.AddSBU.isDisplayed();
	        
	        //boolean clickable = element.isDisplayed();
	        
	        String originalURL = driver.getCurrentUrl();
	        String originalPageSource = driver.getPageSource();
	        AddSbuFunPage.AddSBU.click();
	        System.out.println("Element is clicked");
	        String updatedURL = driver.getCurrentUrl();
	        String updatedPageSource = driver.getPageSource();
	        if (!originalURL.equals(updatedURL) || !originalPageSource.equals(updatedPageSource)) {
	            
	            System.out.println("Changes have happened on the page");
	            AcctualVisible = true;
	        }
	        else {
	            
	            System.out.println("No changes have happened on the page");
	        }
	        boolean clickable1 = true;
	        testCase = extent.createTest("ADD-SBU-BUTTON-IS-CLICKED");
	        try {
	            AssertJUnit.assertEquals(String.valueOf(AcctualVisible), "true");
	            //System.out.println(String.valueOf(clickable));
	        } catch (AssertionError e) {
	            clickable1 = false;
	        }
	        if (clickable1) {
	            testCase.log(Status.INFO, "ActualClick :- " + String.valueOf(AcctualVisible));
	            testCase.log(Status.INFO, "ExpectedClick :- " + "true");
	            testCase.log(Status.PASS, "Clickable");
	        } else {
	            testCase.log(Status.INFO, "ActualClick  :- " + String.valueOf(AcctualVisible));
	            testCase.log(Status.INFO, "ExpectedClick :- " + "true");
	            testCase.log(Status.FAIL, "Not clickable");
	        }
	        Thread.sleep(1000);    
	    }
	
//---------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------
	 
	 
	 public static void saveButtonClick() throws InterruptedException {
         PageFactory.initElements(driver, AddSbuFunpg);
        
         testCase = extent.createTest("STEP 6 - CLICK THE SAVE BUTTON");
         
         Thread.sleep(1000);
         //WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/img"));
         boolean AcctualVisible = AddSbuFunPage.SBUsavebutton.isDisplayed();
         //boolean clickable = element.isDisplayed();
         String originalURL = driver.getCurrentUrl();
         String originalPageSource = driver.getPageSource();
         AddSbuFunPage.SBUsavebutton.click();
         System.out.println("Element is clicked");
         String updatedURL = driver.getCurrentUrl();
         String updatedPageSource = driver.getPageSource();
         if (!originalURL.equals(updatedURL) || !originalPageSource.equals(updatedPageSource)) {
             
             System.out.println("Changes have happened on the page");
             AcctualVisible = true;
         }
         else {
             
             System.out.println("No changes have happened on the page");
         }
         boolean clickable1 = true;
         testCase = extent.createTest("SAVE-BUTTON-IS-CLICKED");
         try {
             AssertJUnit.assertEquals(String.valueOf(AcctualVisible), "true");
             //System.out.println(String.valueOf(clickable));
         } catch (AssertionError e) {
             clickable1 = false;
         }
         if (clickable1) {
             testCase.log(Status.INFO, "ActualClick :- " + String.valueOf(AcctualVisible));
             testCase.log(Status.INFO, "ExpectedClick :- " + "true");
             testCase.log(Status.PASS, "Clickable");
         } else {
             testCase.log(Status.INFO, "ActualClick  :- " + String.valueOf(AcctualVisible));
             testCase.log(Status.INFO, "ExpectedClick :- " + "true");
             testCase.log(Status.FAIL, "Not clickable");
         }
         Thread.sleep(1000);    
         
     }
	  
//	 --------------------------------------------------------------------------------------------------
//	 --------------------------------------------------------------------------------------------------
	 
	public static void emptyvalidation() {
		
		String actualmsg= AddSbuFunPage.emptyvalidationmsg.getAttribute("textContent");
//      String actualmsg= AddSbuFunPage.emptyvalidationmsg.getText();
      System.out.println("empty valiation msg : " + actualmsg);
      String expectedmsg="Sub Business Unit can't be empty";        
              // button enabled
      boolean firstdata = true; 
      testCase = extent.createTest("VALIDATION MSG");
              
              try {
                  Assert.assertEquals(actualmsg, expectedmsg);
                  testCase.log(Status.INFO, "Actual message Displayed :- " + actualmsg);
                  testCase.log(Status.INFO, "Expected message Displayed :- " + expectedmsg);
                  testCase.log(Status.PASS, " message is displayed");
              } catch (AssertionError e) {
                  testCase.log(Status.INFO, "Actual message Displayed :- " + actualmsg);
                  testCase.log(Status.INFO, "Expected message Displayed :- " + expectedmsg);
                  testCase.log(Status.FAIL, " message is not diplayed");
              }
              
              

	}
	
	
//	--------------------------------------------------------------------------------------------------
//	--------------------------------------------------------------------------------------------------
	
	
public static void emptyvalidationUI() throws InterruptedException {
		
	PageFactory.initElements(driver, AddSbuFunpg);
		
	//Text Visible
		
		boolean ExpectedTextVisible=true;
		System.out.println("IsVisible");
		boolean ActualTextVisible=AddSbuFunPage.emptyvalidationmsg.isDisplayed();
		testCase = extent.createTest("1-Test Visible");
		try {
			Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
		}
		
//FONT COLOR
        
        String ActualTitleFontColor = AddSbuFunPage.emptyvalidationmsg.getCssValue("color");
        System.out.println("Font color of button: " + ActualTitleFontColor);
        String ExpectedTitleFontColor ="rgba(255, 0, 0, 1)";

        boolean fontColour = true;

        testCase = extent.createTest("TITLE-FONT-COLOUR");
        try {
            AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);

        } catch (AssertionError e) {
            // TODO: handle exception

            fontColour = false;
        }
        if (fontColour) {
            testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
            testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
            testCase.log(Status.INFO, "Correct font Colour");
            testCase.log(Status.PASS, "Correct font Colour");

        } else {
            testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
            testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
            testCase.log(Status.INFO, "wrong font Colour");
            testCase.log(Status.FAIL, "wrong font Colour");
        }
//FONTSIZE
        String ActualTitleFontsSize = AddSbuFunPage.emptyvalidationmsg.getCssValue("font-size");
        System.out.println("Font Size: " + ActualTitleFontsSize);
        String ExpectedTitleFontsSize = "12px";

        boolean fontsize = true;
        testCase = extent.createTest("TITLE-FONT- SIZE");

        try {
            AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
        } catch (AssertionError e) {
            // TODO: handle exception
            fontsize = false;

        }
        if (fontsize) {
            testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
            testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
            testCase.log(Status.PASS, "Correct font-size");
            testCase.log(Status.PASS, " Font-size Correct");
        } else {
            testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
            testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
            testCase.log(Status.INFO, "Wrong font-size");
            testCase.log(Status.FAIL, "Font-size Wrong");

        }
//Font Family (Specifies the font family for text //family-name, generic-family, inherit)
	
        String ActualElementfamily = AddSbuFunPage.emptyvalidationmsg.getCssValue("FONT-FAMILY");
        System.out.println("FONT-FAMILY: "+ActualElementfamily);
        String ExpectedElementFamily = "Roboto, sans-serif";
        testCase = extent.createTest("FONT-FAMILY");
        try {
            Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
            testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
            testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
            testCase.log(Status.INFO, "Correct Text");
            testCase.log(Status.PASS, "Correct Text");
        } catch (AssertionError e) {
            testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
            testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
            testCase.log(Status.INFO, "wrong Text");
            testCase.log(Status.FAIL, "wrong Text");
        }
        Thread.sleep(1000);
 //Enable
        boolean ExpectedTextEnable=true;
		boolean ActualTextEnable=AddSbuFunPage.emptyvalidationmsg.isEnabled();
		System.out.println("TEXT EABLE: "+ActualTextEnable);
		testCase = extent.createTest("TEXT ENABLE");
		try {
			Assert.assertEquals(ActualTextEnable, ExpectedTextEnable);
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.PASS, "External Radio Button Enable is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
	}
//Spelling		
		try {
            String AcctualTitleText = AddSbuFunPage.emptyvalidationmsg.getText();
            String ExpectedTitleText = "Sub Business Unit can't be empty";
            System.out.println(" Text:" + AcctualTitleText);
            boolean Titletext = true;
            testCase = extent.createTest("TITLE-SPELLING-TEXT");
            try {
                AssertJUnit.assertEquals(AcctualTitleText, ExpectedTitleText);
            } catch (AssertionError e) {
                Titletext = false;
            }
            if (Titletext) {
                testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
                testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
                testCase.log(Status.INFO, "Element Available");
                testCase.log(Status.PASS, "Correct element");
            } else {
                testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
                testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
                testCase.log(Status.INFO, "Element not available");
                testCase.log(Status.FAIL, "No Element");
            }
        } catch (Exception e) {
            testCase = extent.createTest("TITLE-SPELLING-TEXT");
            testCase.log(Status.FAIL, "No Element");
        }
		
//Position
		Point ActulaTitleLocation = AddSbuFunPage.emptyvalidationmsg.getLocation();        
        int actual_x = ActulaTitleLocation.getX();
        int actual_y = ActulaTitleLocation.getY();
        System.out.println("X axis: " + actual_x);
        System.out.println("Y axis: " + actual_y);
        
        Point ExpectedTitleLocation = new Point(417, 221);
        boolean Position = true; 
        testCase = extent.createTest("TITLE-POSITION");
        try {
            AssertJUnit.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);

        } catch (AssertionError e) {
            Position = false; 
        }
        if (Position) {
            testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
            testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
            testCase.log(Status.PASS, "Correct Location");
        } else {
            testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
            testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
            testCase.log(Status.FAIL, "Wrong Location");
        }
//Padding   
        
        String ActualTitlepadding = AddSbuFunPage.emptyvalidationmsg.getCssValue("padding");
        System.out.println("PADING: "+ActualTitlepadding);
        String ExpectedTitlepadding = "5px";
        testCase = extent.createTest("TEXT PADDING");
        try {
            Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.PASS, "padding is Correct");
        } catch (AssertionError e) {
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.FAIL, "padding is Wrong");
        }
        
//Shadow
        String ActualTitleShadow = AddSbuFunPage.emptyvalidationmsg.getCssValue("box-shadow");
        System.out.println("Text Shadow :" + ActualTitleShadow);

        String ExpectedTitleShadow = "none";

        boolean boxshadow = true;
        testCase = extent.createTest("TEXT-SHADOW");
        try {
            AssertJUnit.assertEquals(ActualTitleShadow, ExpectedTitleShadow);

        } catch (AssertionError e) {
            boxshadow = false;
        }
        if (boxshadow) {
            testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
            testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
            testCase.log(Status.PASS, "Shadow text available");
        } else {
            testCase.log(Status.INFO, "ActualBorderColor :- " + ActualTitleShadow);
            testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedTitleShadow);
            testCase.log(Status.FAIL, "Shadow text not available");
        }
        
//Margin
        String ActualTitleMargin = AddSbuFunPage.emptyvalidationmsg.getCssValue("margin");
        System.out.println("Text Margin :" + ActualTitleMargin);

      String ExpectedTitleMargin = "0px";

    boolean textmargin = true;
    testCase = extent.createTest("TEXT-MARGIN");
    try {
    AssertJUnit.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
    }
    catch (AssertionError e) { 
        // TODO: handle exception
        textmargin =false;
        
    }if (textmargin) {
        testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
        testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
        testCase.log(Status.PASS, "Text margin available");
    } else {
        testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
        testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
        testCase.log(Status.FAIL, "Text margin text not available");
    } 
//LETTER SPACING
    String ActualLetterSpacing = AddSbuFunPage.emptyvalidationmsg.getCssValue("letter-spacing");
    System.out.println("Letter Spacing :" + ActualLetterSpacing);

    String ExpectedLetterSpacing = "normal";

    boolean letterspacing = true;
    testCase = extent.createTest("LETTER-SPACING");
    try {
        AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

    } catch (AssertionError e) {
        letterspacing = false; 
    }
    if (letterspacing) {
        testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
        testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
        testCase.log(Status.PASS, "Letter spacing is as expected");
    } else {
        testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
        testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
        testCase.log(Status.FAIL, "Letter spacing is not as expected");
    }
    
// WORD SPACING
    String ActualWordSpacing = AddSbuFunPage.emptyvalidationmsg.getCssValue("word-spacing");
    System.out.println("Word Spacing :" + ActualWordSpacing);

    String ExpectedWordSpacing = "0px";

    boolean wordspacing = true;
    testCase = extent.createTest("WORD-SPACING");
    try {
    AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

    } catch (AssertionError e) {
    wordspacing = false;
    }
    if (wordspacing) {
    testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
    testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
    testCase.log(Status.PASS, "Word spacing is as expected");
    } else {
    testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
    testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
    testCase.log(Status.FAIL, "Word spacing is not as expected");
    }
// ALIGNMENT (CENTER/LEFT/RIGHT)
    String ActualAlignment = AddSbuFunPage.emptyvalidationmsg.getCssValue("text-align");
    System.out.println("Text Alignment :" + ActualAlignment);

    String ExpectedAlignment = "start";

    boolean alignment = true;
    testCase = extent.createTest("TEXT-ALIGNMENT");
    try {
    AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);

    } catch (AssertionError e) {
    alignment = false;
    }
    if (alignment) {
    testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
    testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
    testCase.log(Status.PASS, "Alignment is as expected");
    } else {
    testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
    testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
    testCase.log(Status.FAIL, "Alignment is not as expected");
    }
// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)
    
    String ActualTextTransformation = AddSbuFunPage.emptyvalidationmsg.getCssValue("text-transform");
    System.out.println("Text Transformation :" + ActualTextTransformation);

    String ExpectedTextTransformation = "none";

    boolean texttransformation = true;
    testCase = extent.createTest("TEXT-TRANSFORMATION");
    try {
        AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

    } catch (AssertionError e) {
        texttransformation = false;
    }
    if (texttransformation) {
        testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
        testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
        testCase.log(Status.PASS,  "Transformation expected");
    }
    else {
         testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
         testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
          testCase.log(Status.FAIL,  "Transformation unexpected");
    }
// LINE HEIGHT
    String ActualLineHeight =AddSbuFunPage.emptyvalidationmsg.getCssValue("line-height");
    System.out.println("Line Height :" + ActualLineHeight);

    String ExpectedLineHeight = "18.858px";

    boolean lineheight = true;
    testCase = extent.createTest("LINE-HEIGHT");
    try {
        AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);

    } catch (AssertionError e) {
        lineheight = false;
    }
    if (lineheight) {
        testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
        testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
        testCase.log(Status.PASS, "Line height is as expected");
    } else {
        testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
        testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
        testCase.log(Status.FAIL, "Line height is not as expected");
    }
    
//Text Decoration
    String ActualTextDecoration = AddSbuFunPage.emptyvalidationmsg.getCssValue("text-decoration");
    System.out.println("Text Decoration :" + ActualTextDecoration);

    String ExpectedTextDecoration = "none solid rgb(255, 0, 0)";

    boolean textdecoration = true;
    testCase = extent.createTest("TEXT-DECORATION");
    try {
        AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

    } catch (AssertionError e) {
        textdecoration = false;
    }
    if (textdecoration) {
        testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
        testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
        testCase.log(Status.PASS, "Text decoration is as expected");
    } else {
        testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
        testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
        testCase.log(Status.FAIL, "Text decoration is not as expected");
    }
    
//VERTICAL ALIGN
    
    
    String actualVerticalAlignment = AddSbuFunPage.emptyvalidationmsg.getCssValue("vertical-align");
    System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

    String expectedVerticalAlignment = "baseline";

    boolean verticalAlignment = true;
    testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT");
    try {
        Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
    } catch (AssertionError e) {
        verticalAlignment = false;
    }

    if (verticalAlignment) {
        testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
        testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
        testCase.log(Status.PASS, "Text vertical Align is as expected");
       
    } else {
        testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
        testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
        testCase.log(Status.PASS, "Text vertical Align is as expected");
        
    }
    
  //TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)
    
    	String ActualTextIndent = AddSbuFunPage.emptyvalidationmsg.getCssValue("text-indent");
    	System.out.println("Text Indent :" + ActualTextIndent);

    	String ExpectedTextIndent = "0px";

    	boolean textindent = true;
    	testCase = extent.createTest("TEXT-INDENT");
    	try {
        AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);

    	} catch (AssertionError e) {
        textindent = false;}
        if (textindent) {
            testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
            testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
            testCase.log(Status.PASS, "Text Indent is as expected");
           
        } else {
            testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
            testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
            testCase.log(Status.PASS, "Text Indent is as expected");
            
        }
//TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)
        
        String ActualTextOrientation = AddSbuFunPage.emptyvalidationmsg.getCssValue("text-orientation");
        System.out.println("Text Orientation :" + ActualTextOrientation);

        String ExpectedTextOrientation = "mixed";

        boolean textorientation = true;
        testCase = extent.createTest("TEXT-ORIENTATION");
        try {
            AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

        } catch (AssertionError e) {
            textorientation = false;
        }
        if (textorientation) {
            testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
            testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
            testCase.log(Status.PASS, "Text orientation is as expected");
        } else {
            testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
            testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
            testCase.log(Status.PASS, "Text orientation is as unxpected");
        }
//FONT STYLE
        String ActualFontStyle = AddSbuFunPage.emptyvalidationmsg.getCssValue("font-style");
        System.out.println("Font Style :" + ActualFontStyle);

        String ExpectedFontStyle = "normal";

        boolean fontstyle = true;
        testCase = extent.createTest("FONT-STYLE");
        try {
        AssertJUnit.assertEquals(ActualFontStyle, ExpectedFontStyle);

        } catch (AssertionError e) {
        fontstyle = false;
        }
        if (fontstyle) {
        testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
        testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
        testCase.log(Status.PASS, "Font style is as expected");
        } else {
        testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
        testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
        testCase.log(Status.FAIL, "Font style is not as expected");
        }	 
}


//Validation

public static void Validation() throws IOException, InterruptedException {
	PageFactory.initElements(driver, AddSbuFunpg);
  Thread.sleep(1000);

  FileInputStream file = new FileInputStream(
          System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
  XSSFWorkbook workbook = new XSSFWorkbook(file);
  XSSFSheet sheet = workbook.getSheet("SBUvali");

  int rowcount = sheet.getLastRowNum();
  for (int i = 0; i <= rowcount; i++) {
      XSSFRow row = sheet.getRow(i);

      boolean check = (boolean) row.getCell(0).getBooleanCellValue();
      String NewSbu = (String) row.getCell(1).getStringCellValue();
      String Des = (String) row.getCell(2).getStringCellValue();
      String Validation = (String) row.getCell(3).getStringCellValue();
      String Message = (String) row.getCell(4).getStringCellValue();

      if (check) {
          AddSbuFunPage.SBUtext.sendKeys(NewSbu);
          AddSbuFunPage.SBUdestext.sendKeys(Des);
          AddSbuFunPage.SBUsavebutton.click();
          Thread.sleep(1000);
          String ActualValidation = AddSbuFunPage.validations.getText();
          String ExpectedValidation = Validation;
          testCase = extent
                  .createTest("STEP 2 : Input Test Data and Check Validation, Check " + Message + " Script");
          try {
              Assert.assertEquals(ActualValidation, ExpectedValidation);
              testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation);
              testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation);
              testCase.log(Status.PASS, "Pass " + Message + "Script");
          } catch (AssertionError e) {
              testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation);
              testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation);
              testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("Low Priority");
              testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("High Priority");
          }

      }
      Thread.sleep(1000);
      AddSbuFunPage.SBUtext.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
      AddSbuFunPage.SBUdestext.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
      Thread.sleep(1000);
  }
}

}
