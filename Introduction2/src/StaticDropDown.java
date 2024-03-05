import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			//finding dropdown element
			WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			//using 'select' class in selenium to select options in dropdown,(creating object to 'select' class)
			Select dropdown=new Select(staticDropDown);
			//using different methods of class 
		   dropdown.selectByIndex(1);
		   dropdown.selectByVisibleText("AED");
		   dropdown.selectByValue("INR");//select if attribute value is equal to 'INR'
		   System.out.println(dropdown.getFirstSelectedOption().getText());//method to get text of selected option
		   
			

	}

}

