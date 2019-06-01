package test.java.aidana;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.java.utils.DriverUtils;
import test.java.utils.PropertiesUtils;

import java.io.IOException;


public class FirstClass {

    static WebDriver driver;

    @BeforeClass

    public void setup() throws IOException {
        String browsers = PropertiesUtils.getPropertiesValue("browser");
        driver = DriverUtils.getDriver(browsers);
    }

    @Test
    public void test() throws InterruptedException, IOException {
        Thread.sleep(3000);
        driver.get("https://codingbat.com/java");

        String  login = PropertiesUtils.getPropertiesValue("login");

        driver.findElement(By.cssSelector("input[name='uname']")).sendKeys(login);

        String password = PropertiesUtils.getPropertiesValue("password");

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);

        driver.findElement(By.cssSelector("input[name='dologin']")).click();

        String getEmailname = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td")).getText();
        getEmailname= getEmailname.substring(0,20);

        System.out.println(getEmailname);

        String tempLogin = login.substring(0,20);



        Assert.assertEquals(tempLogin,getEmailname);

        System.out.println("this is login " +login +"\nthis is new login " +tempLogin);

        driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/a")).click();
    }

}
