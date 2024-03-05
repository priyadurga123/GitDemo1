import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

import org.openqa.selenium.By;
public class autoSuggestiveCheckboxs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//finding autosuggest element and sending text
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(2000);
		//grab all the suggested options by using common path
		List<WebElement> options= driver.findElements(By.cssSelector("a[class*='ui-']"));
		//Itreating through options for selecting required option as our wish,let's say india
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();//performed click operation to selct.
				break;
			}
		}
		
		//**below code related to checkboxs
		//finding number of checkboxs by using common path
      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
      //selcting a checkbox 
      driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
      //checking whether box selected.
      System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
      
      /*below code related to 'how to confirm some element enabled or disabled with useraction on other element'
       * enable method fails due to some reasons so we prefer to use getattribute method to verify the enable functionality
       */
      //clicking on one element
      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
    	 System.out.println("it's enabled");
    	 Assert.assertTrue(true);//pass the test case,as the 'return date' element enabled on clicking.
     }else {
    	 System.out.println("it's not enabled");
    	 Assert.assertTrue(false);//fail the test case,as the 'return date' element not enabled on clicking. 
     }
      
	}

}
