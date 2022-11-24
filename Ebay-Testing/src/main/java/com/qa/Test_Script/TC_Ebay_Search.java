package com.qa.Test_Script;

import java.io.IOException;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.qa.pages.Ebay_Pages;
import com.qa.utility.excelutility;

	public class TC_Ebay_Search extends TC_Ebay_TestBase{
		@Test(dataProvider="getData")
		public void search_product(String Product,String Input,String LoginID,String Password) throws InterruptedException,IOException
		{
		    Ebay_Pages sc=new Ebay_Pages(driver);
		    sc.open_search().sendKeys(Input);
		    sc.search_submit().click();
		    sc.click_product().click();
			/*String title = driver.getTitle();
			boolean contains = driver.getTitle().contentEquals(Input);
			System.out.println(contains);*/
			
		}
	@DataProvider
	public Object[][] getData() throws IOException
	{
		String xFile="C:\\Users\\Praveen\\eclipse-workspace\\Ebay-Testing\\src\\main\\java\\com\\qa\\Test_Data\\Test.xlsx";
		String Xsheet="Sheet1";
		int rowCount = excelutility.getRowCount(xFile, Xsheet);
		int cellcount = excelutility.getCellCount(xFile,Xsheet,rowCount);
		String[][] data=new String[rowCount][cellcount];
		for(int i=1;i<=rowCount;i++) 
			{
					for(int j=0;j<cellcount;j++) {
						data[i-1][j]= excelutility.getCellData(xFile, Xsheet, i, j);
		
				}
			}
		return data;
		}
		}
