package com.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shop.util.HomePage;
import com.shop.util.ProductOrderingPage;
import com.shop.util.TestBase;
import com.shop.util.loginPage;

public class productOrderingTest extends TestBase{
	
			loginPage LoginPage;
			HomePage homePage;
			ProductOrderingPage productOrderingPage;
			
			public productOrderingTest() {
				super();
			}
			
			@BeforeMethod
			public void setUp() throws IOException, InterruptedException {
				Home_Page_Launch();
				LoginPage = new loginPage();
				homePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
				productOrderingPage = new ProductOrderingPage();
		}
				
			@Test
			public void OrderingSelection() throws InterruptedException {
				homePage.OrderingMenuSelect();
				Thread.sleep(5000);
				productOrderingPage.searchProducts();
				Thread.sleep(2000);
			}
			
			@AfterMethod
			public void teardown() {
				driver.quit();
				
			}



	}

