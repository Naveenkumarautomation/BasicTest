package com.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shop.util.HomePage;
import com.shop.util.TestBase;
import com.shop.util.loginPage;

public class HomePageTest extends TestBase{
	
			loginPage LoginPage;
			HomePage homePage;
			
			public HomePageTest() {
				super();
			}
			
			@BeforeMethod
			public void setUp() throws IOException, InterruptedException {
				Home_Page_Launch();
				LoginPage = new loginPage();
				homePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
				
			@Test
			public void OrderingSelection() throws InterruptedException {
				homePage.OrderingMenuSelect();
				Thread.sleep(5000);
			}
			
			@AfterMethod
			public void teardown() {
				driver.quit();
			}


	}


