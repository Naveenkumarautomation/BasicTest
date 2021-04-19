package com.shop.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.symbion.pages.TimeUtil;

public class HomePage extends TestBase {
		
		@FindBy(xpath="//*[@id=\"menuContainer\"]/div/ul/li[3]/a")
		WebElement selectElement;
		
		@FindBy(xpath="//a[contains(text(), 'Product Search/ Place Order')]")
		WebElement elementClick;
		
			
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public ProductOrderingPage OrderingMenuSelect() throws InterruptedException {
			selectElement.click();
			Thread.sleep(2000);
			elementClick.click();
			driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			return new ProductOrderingPage();
		}


	}


