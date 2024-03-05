package section8;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section11Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//2)limiting scope to footer section
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		//3)limiting browser to particular column section 
		WebElement columndriver=footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
        //4)getting all links and opening those in new tab 
		int size=columndriver.findElements(By.tagName("a")).size();
		for(int i=0;i<size;i++) {
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);//keyboard event used to open link in new tab
		//control send to each link to open in new tab
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		Thread.sleep(2000);
		}
		/*code to get title of each newly opened tab*/
		//1)handle all opened windows 
		Set<String> abc=driver.getWindowHandles();
		//2)iterate through all windows to get text 
		Iterator<String> it=abc.iterator();
		//mean while checking whether windows are present to get title of new tab 
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	
		
	}

}
