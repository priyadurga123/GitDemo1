package section8;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MouseOverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//Action class to perfome mouse actions 
		Actions a=new Actions(driver);
		//find an element
		WebElement move=driver.findElement(By.cssSelector("a[id='nav']"));
		//moving the mouse cursor on 'move' element
		a.moveToElement(move).build().perform();
		//performing right click of mouse on element
		a.moveToElement(move).contextClick().build().perform();
		//performing selection of element by mouse or double click
		a.moveToElement(move).doubleClick().build().perform();
		//sending captial letters as text to input field by keyboard action
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
		
		

	}

}
