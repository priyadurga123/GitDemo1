
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
public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	
		//6)declaring implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//7)declaring explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver);//5)calling addItems method
		//8)remaining are general clicking actions..
		
	}
	public static void addItems(WebDriver driver) {
		
		//2)Decalring our intrested productlist which we want to add to cart
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		//1)getting all productlist
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		/*3)Iterating through productlist to check is our intreseted products are present,
		 * if present we add to cart */
		List itemsNeededList=Arrays.asList(itemsNeeded);//converting array to arrayList to use contains method
		int j=0;//to count the intreseted products present in productlist
		for(int i=0;i<products.size();i++) {
			//4)getting concise text of each product to compare with interested product item
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			if(itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();//getting that particular button out of 30
				if(j==itemsNeeded.length) {//checking whether all wish products are present or selected in productlist
					break;
				}
			}
		}
	}

}
