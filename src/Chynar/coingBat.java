package Chynar;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class coingBat {
 
	WebDriver driver;
	
	@BeforeTest
	
	public void before() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@Test 
	public void testWebPage() {
		driver.get("https://www.codingbat.com/");
		WebElement login=driver.findElement(By.xpath("//td/input[@name='uname']"));
		login.sendKeys("iskenderovachynar10@gmail.com");
		WebElement password=driver.findElement(By.xpath("//td/input[@name='pw']"));
		password.sendKeys("chynar10");
		driver.findElement(By.xpath("//td/input[@name='dologin']")).click();
		
        WebElement logout=driver.findElement(By.xpath("//a[@href='/logout']"));	
		logout.click();
		String idText = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[1]")).getText();
		boolean isPresent = true;
		Assert.assertTrue(isPresent, idText);
	}
	
}
