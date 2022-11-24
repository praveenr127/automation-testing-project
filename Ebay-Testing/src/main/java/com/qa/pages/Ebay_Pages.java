package com.qa.pages;
//import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Ebay_Pages {

WebDriver driver;

@FindBy(xpath="//*[@id=\"gh-ac\"]")
WebElement searchtab;
public WebElement open_search() {
	return searchtab;
}

@FindBy(xpath="//*[@id=\"gh-btn\"]")
WebElement searchbtn;
public WebElement search_submit() {
	return searchbtn;
}

@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[4]/div/div[2]/a/div")   
WebElement clickprod;
public WebElement click_product() {
	return clickprod;
}

@FindBy(css="#mainContent > form > div.vim.x-buybox > div:nth-child(1) > div.x-buybox__cta-section > ul > li:nth-child(2) > div > a")
WebElement addcartbtn;
public WebElement add_to_cart() {
	return addcartbtn;
}

@FindBy(xpath="//*[@id=\"binBtn_btn_1\"]")  
WebElement buynowbtn;
public WebElement buy_now() {
	return buynowbtn;
}

@FindBy(xpath="//*[@id=\"gh-ug\"]/a")  
WebElement signin;
public WebElement click_signin() {
	return signin;
}

@FindBy(xpath="//*[@id=\"userid\"]") 
WebElement enteruser;
public WebElement email_input() {
	return enteruser;
}

@FindBy(xpath="//*[@id=\"signin-continue-btn\"]") 
WebElement signinbtn;
public WebElement signin_btn() {
	return signinbtn;
}

@FindBy(xpath="//*[@id=\"pass\"]") 
WebElement enterpass;
public WebElement password_input() {
	return enterpass;
}

@FindBy(xpath="//*[@id=\"sgnBt\"]") 
WebElement submitsignin;
public WebElement submit_signin() {
	return submitsignin;
}


public Ebay_Pages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	
}
	


