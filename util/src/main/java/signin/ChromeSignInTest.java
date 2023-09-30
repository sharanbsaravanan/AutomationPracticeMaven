package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSignInTest {
    public static void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver//chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get ("http://www.automationpractice.pl/index.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement (By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("email")).sendKeys("sharan1beta@gmil.com");
        Thread.sleep(2000);

        driver.findElement(By.name("passwd")).sendKeys("act12345");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).click();

    }

}
