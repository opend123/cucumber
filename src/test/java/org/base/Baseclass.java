package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static void pageTitle(){
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	public static void pageurl() {
		String url= driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void passText(String txt,WebElement  ele) {
		ele.sendKeys(txt);
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	public static Actions a;
	
	public static void moveCrusor(WebElement targetWeb) {
		a= new Actions(driver);
		a.moveToElement(targetWeb).perform();
		
	}
	public static void dragAndDrop(WebElement drag,WebElement drop) {
		a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}
	public static JavascriptExecutor js;
	
	public static void scrollThePage ( WebElement target) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", target);
	}
	public static void excelRead(String sheetName,int rowNum,int ColNum) throws IOException{
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\maven\\excel\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
	    Workbook w = new XSSFWorkbook(fi);
	    
	   Sheet r= w.getSheet("Sheet2");
	   Row p= r.getRow(1);
	   Cell o= p.getCell(2);
	   System.out.println("data : " +o);
	   for(int i=0;i<r.getPhysicalNumberOfRows();i++) {
			 Row y  =r.getRow(i);
			 for(int j=0;j<y.getPhysicalNumberOfCells();j++ ) {
				 Cell l=y.getCell(j);
				 int celltype = l.getCellType();
				 if(celltype==1) {
					 String value=l.getStringCellValue();
					 System.out.println(value);
				 }
				 else if (DateUtil.isCellDateFormatted(l)) {
					 Date dd= l.getDateCellValue();
					 SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
					 String val=s.format(dd);
					 System.out.println(val);
				 }
				 else {
					 double d= l.getNumericCellValue();
					 long n=(long)d;
					 String va=String.valueOf(n);
					 System.out.print(va);
				
				 }
				 
						
						
						

		
				 
				 
				 }
				 
			 }
		   }
		   
		   
		   
		    
				 
	}
	
	


