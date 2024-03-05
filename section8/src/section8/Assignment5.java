package section8;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;
import java.util.Iterator;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com");
	      driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	      //switching focus from browser window to Top frame and to middle frame
	      driver.switchTo().frame("frame-top");
	      driver.switchTo().frame("frame-middle");
	      System.out.println(driver.findElement(By.id("content")).getText());
	     
	      
	}

}
