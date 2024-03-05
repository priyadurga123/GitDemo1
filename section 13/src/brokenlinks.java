import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //getting all footer section links
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			//getting individual link 
			String url=link.getAttribute("href");
			
		}
		

	}

}
