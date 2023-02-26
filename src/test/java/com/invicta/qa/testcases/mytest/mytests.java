package com.invicta.qa.testcases.mytest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;
import com.invicta.qa.pages.mymodule.elements;

public class mytests extends uimethods {

	static elements elem = new elements();

	@Test(priority = 1)

	public static void testcase01() throws InterruptedException {

		PageFactory.initElements(driver, elem);
		Thread.sleep(500);

		elements.master.click();
		Thread.sleep(1000);

		elements.mainSupplier.click();

		elements.sideSupplier.click();

//		elements.mainEmployee.click();

//		elements.sideEmployee.click();

//		uimethods.supplierExportUI();

//		uimethods.supplierExport();

	}

	@Test(priority = 2)

	public int getNumberOfEntries() {
//		String entriesTxt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[1]")).getText().trim();
		String entriesTxt = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[1]"))
				.getText().trim();
		System.out.println(entriesTxt);
		String[] aEntriesText = entriesTxt.split(" of ");
		String totalEntriesText = aEntriesText[aEntriesText.length - 2];
		System.out.println("no of entries:" + totalEntriesText);

		return Integer.parseInt(totalEntriesText);
//		return i;
	}

	@Test(priority = 3)
	public int getRecordsCountInCSV(String downloadPath, String csvFileName) {
		int lineNumberCount = 0;
		try {
			if (!csvFileName.isEmpty() || csvFileName != null) {
				String filePath = downloadPath + System.getProperty("file.separator") + csvFileName;
				System.out.println(filePath);
				File file = new File(filePath);
				if (file.exists()) {
					System.out.println("File found :" + csvFileName);
					FileReader fr = new FileReader(file);
					LineNumberReader linenumberreader = new LineNumberReader(fr);
					while (linenumberreader.readLine() != null) {
						lineNumberCount++;
					}
					// To remove the header
					lineNumberCount = lineNumberCount - 1;
					System.out.println("Total number of lines found in csv : " + (lineNumberCount));
					linenumberreader.close();
				} else {
					System.out.println("File does not exists");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lineNumberCount;
	}

	@Test(priority = 4)

	private File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	@Test(priority = 5)

	public void testExportAllRecords() throws InterruptedException {

		PageFactory.initElements(driver, elem);
//	driver.get(URL);
		int noOfEntries = getNumberOfEntries();
		System.out.println("Total number of entries are :- " + noOfEntries);

		elements.supplierExportButton.click();

		String downloadPath = ("C:\\Users\\sgic\\Downloads");
		File file = getLatestFilefromDir(downloadPath);
		String csvFileName = file.getName();
		System.out.println("CSV File Downloaded is :- " + csvFileName);

		System.out.println("Verifying number of entries with number of entries in csv");
		Assert.assertEquals(noOfEntries, getRecordsCountInCSV(downloadPath, csvFileName));
	}

//	@Test(priority=2)
//	
//	public static void supplierImport() throws InterruptedException, FileNotFoundException, AWTException {
//		PageFactory.initElements(driver, elem);
//	
//	    Thread.sleep(2000);
//	    elements.supplierImportButton.click();
//	    
//	    Thread.sleep(2000);
//	    String file = "C:\\Users\\sgic\\Downloads\\supplier.csv";
//	    
//	    StringSelection selection = new StringSelection(file);
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//	    
//	    
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    Thread.sleep(3000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    
//	    //EmployeeImportPage.MaterialImportButton.sendKeys("C:\\Users\\hp\\Downloads\\material.csv");
//	    //Thread.sleep(3000);
//	    
//	}

//@Test(priority=2)
//	
//	public static void employeeImport() throws InterruptedException, FileNotFoundException, AWTException {
//		PageFactory.initElements(driver, elem);
//	
//	    Thread.sleep(2000);
//	    elements.employeeImportButton.click();
//	    
//	    Thread.sleep(2000);
//	    String file = "C:\\Users\\sgic\\Downloads\\supplier.csv";
//	    
//	    StringSelection selection = new StringSelection(file);
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//	    
//	    
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    Thread.sleep(3000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    
//	    //EmployeeImportPage.MaterialImportButton.sendKeys("C:\\Users\\hp\\Downloads\\material.csv");
//	    //Thread.sleep(3000);
//	    
//	}

}
