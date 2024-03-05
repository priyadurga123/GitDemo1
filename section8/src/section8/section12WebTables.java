package section8;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

public class section12WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		/*using javascriptexecutor class to use methods needed to scroll main page*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		//now scrolling the table 
		js.executeScript("document.querySelector('.tableFixHead'), scrollTop=5000");
		//finding the 4th column and all those values
		int sum=0;
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(WebElement v:values) {
			sum=sum+Integer.parseInt(v.getText());
		}
		System.out.println(sum);
	}

}
