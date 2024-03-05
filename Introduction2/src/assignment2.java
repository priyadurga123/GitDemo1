import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		//sending name,email
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahul123");
		//clicking the checkbox
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		//clicking dropdown and selecting male option
		driver.findElement(By.xpath("//select/option[2]")).click();
		Thread.sleep(2000);
		//clicking radiobuttn
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("03-09-1993");
		//clicking on submit button
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String b=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
		System.out.println(b);
	}

}
