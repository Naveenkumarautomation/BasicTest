package com.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shop.util.HomePage;
import com.shop.util.TestBase;
import com.shop.util.loginPage;

public class loginPageTest extends TestBase {
	
			public static loginPage LoginPage;
			HomePage homePage;
			
			public loginPageTest() {
				super();
			}

			@BeforeMethod
			public void setUp() throws IOException, InterruptedException {
				Home_Page_Launch();
				LoginPage = new loginPage();
				
			}
			
			@Test
			public void loginTest() throws InterruptedException {
				homePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			}
			
			@AfterMethod
			public void teardown() {
				driver.quit();
			}

			
		}



