package section8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();



		driver.get("http://qaclickacademy.com/practice.php");



		WebElement table=driver.findElement(By.id("product"));



		System.out.println(table.findElements(By.tagName("tr")).size());



		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());

		}

		

	}


/*or
import java.util.List;
import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7 {	public static void main(String[] args) {		WebDriver driver = new ChromeDriver();		driver.manage().window().maximize();		driver.get("https://rahulshettyacademy.com/AutomationPractice/");				WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));				int numberOfRows = table.findElements(By.tagName("tr")).size();		int numberOfCols = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
						System.out.println("No of Rows -"+numberOfRows);		System.out.println("No of Columns -"+numberOfCols);				List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));				for(WebElement column : secondRow) {			System.out.println(column.getText());		}	}}
Give Feedback

What went well? What could be improved?

TH
Add feedback...*/
