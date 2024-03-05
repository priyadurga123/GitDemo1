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

public class Assignment2  {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//***dropping
		WebElement options=driver.findElement(By.xpath("//select"));
		Select s=new Select(options);
		s.selectByVisibleText("Consultant");
		//clicking submit
		driver.findElement(By.id("signInBtn")).click();
		//**adding to cart
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='btn']")));
		//**getting all products
		List<WebElement> buttons=driver.findElements(By.cssSelector("button[class*='btn']"));
		for(int i=0;i<buttons.size();i++) {
			buttons.get(i).click();
		}
		
	}

}
