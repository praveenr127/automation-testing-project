package com.qa.Test_Script;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.Ebay_Pages;

public class TC_Ebay_TestBase {


	WebDriver driver;
	Ebay_Pages ebay;
	@Parameters({"Browser", "Url"})
	@BeforeClass
	public void setUp(String Browser,String  Url) throws InterruptedException, FileNotFoundException {
		
		
		if(Browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Praveen\\\\Downloads\\\\Compressed\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		if(Browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Praveen\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		}
		
		if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Praveen\\Downloads\\Compressed\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			}

		driver.get(Url);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		//ebay = new Ebay_Pages(driver);
		
		
	}

public void CaptureScreenshots(WebDriver driver,String tName) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/ScreenShots/"+tName+".png");
	FileUtils.copyFile(source, target);
}

public boolean isElementPresent(By by) {
    try {
        driver.findElement(by);
        return true;
    } catch (NoSuchElementException e) {
        return false;
    }
}
/*@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
	driver.close();

	
	}*/
}
