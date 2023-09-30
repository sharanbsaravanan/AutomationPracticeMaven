package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeSignUpTest {
    public static void test() throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver//chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("sharan1beta@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("customer_firstname")).sendKeys("Saravanan");
        Thread.sleep(2000);
        driver.findElement(By.name("customer_lastname")).sendKeys("Baskaran");
        Thread.sleep(2000);
      //  driver.findElement(By.name("email")).sendKeys("sharan1beta@gmail.com");
        //Thread.sleep(2000);
        driver.findElement(By.name("passwd")).sendKeys("Act@12345");
        Thread.sleep(2000);
      WebElement daysdd =  driver.findElement(By.id("days"));
        Select date = new Select(daysdd);
        date.selectByValue("7");
        Thread.sleep(2000);

        WebElement monthdd =  driver.findElement(By.id("months"));
        Select month = new Select(monthdd);
        month.selectByValue("4");
        Thread.sleep(2000);

        WebElement yeardd =driver.findElement(By.id("years"));
        Select year =new Select(yeardd);
        year.selectByValue("1995");
        Thread.sleep(2000);

        driver.findElement(By.name("newsletter")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();







    }
}
