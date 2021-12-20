package testCases;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Sample {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void Testcase1() { 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("swamy");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("swamy@114@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8855488524");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
	
	public void Testcase2() { 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("swamy");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("swamy@114@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8855488524");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
	
	public void Testcase3() { 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("swamy");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("swamy@114@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8855488524");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("swamy@114");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}
	
	
}
