import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//invoking the chrome driver.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//telling script to wait for 5 seconds when any element not visible immediately on web page.
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello1234");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//finding element by CSS Selector
        driver.findElement(By.linkText("Forgot your password?")).click();//using linktext to find element
        Thread.sleep(1000);//telling script to wait until view(display page) get stable
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("John");//using Xpath to find element.
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//using index in xpath
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");//using index in cssSelector
        driver.findElement(By.xpath("//form/input[3]"));//using parent-child in xpath;
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        driver.findElement(By.cssSelector("form p")).getText();//parent-child in cssSelector
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//using regular expressions in cssSelector
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("button[contains(@class,'submit')]")).click();//using regular expression in xpath
        
	}

}
