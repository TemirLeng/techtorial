package tangsholpan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriver {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://instagram.com");
		String actual = "Instagram";
		String expected = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);

		WebElement loginButton = driver.findElement(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']"));
		loginButton.click();
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.xpath(
				"//span[@id='react-root']/section/main[@role='main']//article[@class='agXmL']//form[@method='post']//input[@name='username']"));
		userName.click();
		Thread.sleep(2000);
		userName.sendKeys("moon_light_in_the_dark");

		WebElement password = driver.findElement(By.xpath(
				"//span[@id='react-root']/section/main[@role='main']//article[@class='agXmL']//form[@method='post']//input[@name='password']"));
		password.click();
		password.sendKeys("123456789qwerty");
		Thread.sleep(2000);

		WebElement login2 = driver.findElement(By.xpath("//button[@class='_0mzm- sqdOP  L3NKy       ']"));
		login2.click();
		Thread.sleep(2000);

		String actualName = "moon_light_in_the_dark";
		String expectedName = driver.findElement(By.xpath("//div[@class='SKguc']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(actualName, expectedName);

		WebElement notification = driver.findElement(By.xpath("//button[@class='aOOlW   HoLwm ']"));
		notification.click();
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//span[@class='glyphsSpriteUser__outline__24__grey_9 u-__7']"));
		button.click();
		Thread.sleep(2000);

		WebElement settings = driver.findElement(By.xpath("//button[@class='dCJp8 afkep _0mzm-']"));
		settings.click();
		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.xpath("(//div[@class='mt3GC']//button[@class='aOOlW   HoLwm '])[6]"));
		logout.click();
		Thread.sleep(2000);

		String actualText = "By signing up, you agree to our Terms , Data Policy and Cookies Policy .";
		String expectedText = driver.findElement(By.xpath("//p[@class='g4Vm4']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(actualText, expectedText);

	}

	@AfterTest
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
