package rahulshettyacademy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();
        //finding the elements list 
		List<WebElement> products =driver.findElements(By.xpath("//div[@class='card-body']"));
		//div[@class='card-body']/h5/b
		//Iterating over products for 'ZARA COAT 3' product
		WebElement prod=products.stream().filter(product->product.findElement(By.xpath("//h5/b")).getText().equals("ZARA COAT 3"))
		.findFirst().orElse(null);
		System.out.println(prod);
		//finding particular product and clicking it's button 
		prod.findElement(By.cssSelector("button[style*='float']")).click();
		/**/
		//explicitly waiting till the animating page to load and disappaer
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ng-animating")));
		//finding cart element 
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		//verifying whether products are added to checkout 
		List<WebElement> cartProducts= driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match=cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase("ZARA COAT 3"));
		//verifying whether ZARA COAT 3 found or not
		Assert.assertTrue(match);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		/**/
		//Handling autosuggestive dropdown by Actions class 
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")),"ind").build().perform();//entering text 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ta-results']")));//dropdown to get open
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();//clicking one of dropdown option
		
		
		

	}

}
