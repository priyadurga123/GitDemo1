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
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
      driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
      //explict wait
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']")));
      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
      //1)Handling new opened tab and get text from it , as below 
      /*using 'getWindowHandles' method to get all opened windiows ids*/
      Set<String> windows=driver.getWindowHandles();
      /*iterating over window ids to get the parent and child id's*/
      Iterator<String> it=windows.iterator();
      String parentId=it.next();
      String childId=it.next();
      /*now moving focus to new tab*/
      driver.switchTo().window(childId);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
      System.out.println(driver.findElement(By.tagName("h3")).getText());
      //moving focus to parent window and get text 
      driver.switchTo().window(parentId);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h3")));
      System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
      }

}
