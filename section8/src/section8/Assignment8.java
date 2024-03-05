package section8;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment8 {
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();

    driver.get("http://qaclickacademy.com/practice.php");

    driver.findElement(By.id("autocomplete")).click();

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       
/*or
public class DynamicDropDownHandle {
	public static void main(String[] args) {		
String expected="germany";		
WebDriver driver = new ChromeDriver();		
driver.manage().window().maximize();		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		driver.get("http:qaclickacademy.com/practice.php");		


driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ger");		


List<WebElement>suggestion=driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));				


for(int i=0;i<suggestion.size();i++) {						



if(suggestion.get(i).getText().equalsIgnoreCase(expected)){				

suggestion.get(i).click();*/
       

}

}