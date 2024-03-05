import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//clicking to open adult box 
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//clicking to increase adult count to 5
		for(int i=0;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		//clicking on input(Departure) box to open dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
//**********for verification of options,always do the above one step before,otherwise dropdown options or values disapper,not possiable to inspect
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//clicking  to select dropdown option in 'to box' (refersection7 dynamic dropdowns)
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		

	}

}

