package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;



public class SbuPlaceholderUI extends DriverIntialization {

	AddSbuFunPage AddSubFunpg = new AddSbuFunPage();
		
		@Test

		public void sbu() throws InterruptedException {

			Thread.sleep(2000);

			PageFactory.initElements(driver, AddSubFunpg);

			Thread.sleep(2000);

			AddSbuFunPage.Master.click();
			Thread.sleep(2000);

			AddSbuFunPage.SBU.click();
			Thread.sleep(2000);

			AddSbuFunPage.AddSBU.click();
			Thread.sleep(2000);
		
			String placeholderVal = AddSbuFunPage.SBUplaceholder.getAttribute("placeholder");
			String expectedVal = "Enter Sub business unit";
			
			if (placeholderVal.equalsIgnoreCase(expectedVal))
				System.out.println("The placeholder value is expected, ie : " + placeholderVal);
			else
				System.out.println("The placeholder value is not correct --- " + placeholderVal);

			testCase = extent.createTest("PLACEHOLDER-SAMPLE");
			try {
				AssertJUnit.assertEquals(placeholderVal, expectedVal);
				testCase.log(Status.INFO, "ActualText :- " + placeholderVal);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedVal);
				testCase.log(Status.INFO, "Correct Text");
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + placeholderVal);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedVal);
				testCase.log(Status.INFO, "wrong Text");
				testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);

			// check if element visible

			boolean AcctualElement = AddSbuFunPage.SBUplaceholder.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("PLACEHOLDER-ELEMENT-VISIBLE");
			try {
				AssertJUnit.assertEquals(AcctualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			Thread.sleep(2000);

	// OPACITY
			
			String actualElementopacity = AddSbuFunPage.SBUplaceholder.getCssValue("opacity");
			String expectedElementopacity = "1";
			System.out.println("PLACEHOLDER-OPACITY: " + actualElementopacity);
			testCase = extent.createTest("PLACEHOLDER-OPACITY");
			try {
				Assert.assertEquals(actualElementopacity, expectedElementopacity);
				testCase.log(Status.INFO, "ActualText :- " + actualElementopacity);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementopacity);
				testCase.log(Status.INFO, "Correct Text");
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + actualElementopacity);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementopacity);
				testCase.log(Status.INFO, "wrong Text");
				testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);

			// Check position

			Point ActualLocation = AddSbuFunPage.SBUplaceholder.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);

			Point ExpectedLocation = new Point(417, 189);

			boolean position = true;
			testCase = extent.createTest("PLACEHOLDER POSITION");
			try {
				AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);
			} catch (AssertionError e) {
				position = false;
			}
			if (position) {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "Correct Position");
				testCase.log(Status.PASS, "Position correct");
			} else {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "wrong Position");
				testCase.log(Status.FAIL, "Position Wrong");
			}
			Thread.sleep(2000);

			
			// Check font family of the element 
			

			String actualElementfamily = AddSbuFunPage.SBUplaceholder.getCssValue("font-family");
			System.out.println("PLACEHOLDER-FONT-FAMILY: " + actualElementfamily);
			String expectedElementFamily = "Roboto, sans-serif";
			testCase = extent.createTest("PLACEHOLDER-FONT-FAMILY");
			try {
				Assert.assertEquals(actualElementfamily, expectedElementFamily);
				testCase.log(Status.INFO, "ActualText :- " + actualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementFamily);
				testCase.log(Status.INFO, "Correct Text");
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + actualElementfamily);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementFamily);
				testCase.log(Status.INFO, "wrong Text");
				testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
			

			// check font color
			

			String Actualfontcolor = AddSbuFunPage.SBUplaceholder.getCssValue("color");
			System.out.println("Font Color: " + Actualfontcolor);
			testCase = extent.createTest("PLACEHOLDER-FONT-COLOUR");
			String Expectedfontcolor = "rgba(0, 0, 0, 0.85)";
			boolean fontcolor = true;
			try {
				AssertJUnit.assertEquals(Actualfontcolor, Expectedfontcolor);
			} catch (AssertionError e) {
				fontcolor = false;
			}
			if (fontcolor) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + Actualfontcolor);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + Expectedfontcolor);
				testCase.log(Status.INFO, "Correct font-size");
				testCase.log(Status.PASS, "Font-size Correct");
			} else {
				testCase.log(Status.INFO, "ActualfontsSize :- " + Actualfontcolor);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + Expectedfontcolor);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");
			}
			Thread.sleep(2000);

			
		}

		
	}

