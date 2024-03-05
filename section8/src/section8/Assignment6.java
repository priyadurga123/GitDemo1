package section8;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
        //finding checkbox and clicking and getting text of label 
		driver.findElement(By.xpath("//label[@for='bmw']/input")).click();
		String labelText=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		//finding the dropdown and selecting the option on the dropdown 
		Select s=new Select(driver.findElement(By.cssSelector("select[id*='dropdown']")));
		s.selectByVisibleText(labelText);
		//entering the selected name in alert box text
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(labelText);
		//clicking on alert 
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		Thread.sleep(2000);
		//shifting the focus to pop-up to get text 
		String t=driver.switchTo().alert().getText();
		//checking if alert text containing labelText 
		if(t.contains(labelText)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}

}
