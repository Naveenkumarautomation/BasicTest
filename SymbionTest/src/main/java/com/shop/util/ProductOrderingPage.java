package com.shop.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.symbion.pages.TimeUtil;

public class ProductOrderingPage extends TestBase {
	
		@FindBy(xpath="//select [@id='ctl00_cplMain_ddActiveAccounts']/option[5]")
		WebElement accountOption;
		
		@FindBy(id="txtSearchProduct")
		WebElement productSearchText;
		
		@FindBy(id="btnProductSearch")
		WebElement advanceSearchBtn;
			
		public ProductOrderingPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void searchProducts() throws InterruptedException {
			accountOption.click();
			Thread.sleep(2000);
			productSearchText.sendKeys(prop.getProperty("productsearch"));
			Thread.sleep(2000);
			advanceSearchBtn.click();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
		}

		
	

}
