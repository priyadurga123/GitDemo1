import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locator2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String name="rahul";//instead of sending direct name to username field
		WebDriver driver=new ChromeDriver();//invoking the chrome driver.
		String password=getPassword(driver);//calling method 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//telling script to wait for 5 seconds when any element not visible immediately on web page.
		driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
      //using "assertEquals" method to check wheather actual text and expected text same or not
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
	}
	//Method to obtain password from displayed String dynamically(without human involvement)
	public static String getPassword(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();//using linktext to click on forgot link
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();//clicking reset password button
		String password=driver.findElement(By.cssSelector("form p")).getText();//getting text from paragraph
		//using array methods to get password text;
		String[] passwordArray=password.split("'");
		String passwordText=passwordArray[1].split("'")[0];
		return passwordText;
	}

}
