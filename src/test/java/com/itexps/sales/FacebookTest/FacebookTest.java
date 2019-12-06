package com.itexps.sales.FacebookTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://google.com/";
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void facebookTest() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("patel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hitesh");
		driver.findElement(By.xpath("//*[@type=\'submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText());
		
				
	}

}
