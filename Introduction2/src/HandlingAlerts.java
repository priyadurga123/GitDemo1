import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text="rahul";
		//sending name to 'enter your name' box
		driver.findElement(By.id("name")).sendKeys(text);
		//clicking the button 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		//shifting focus to alert or handling alert and getting text on alert
		System.out.println(driver.switchTo().alert().getText());
		//accepting the alert
		driver.switchTo().alert().accept();
		//clicking on button 
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		//once again shifting focus to alert or handling alert and getting text on alert
		System.out.println(driver.switchTo().alert().getText());
		//rejecting or dismissing the alert
		driver.switchTo().alert().dismiss();
		
	}

}
