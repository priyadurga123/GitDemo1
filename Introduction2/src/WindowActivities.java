import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//telling script to maximize the current browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//'get' command have inbulit wait mechanism(script will wait until all components are loaded)
		driver.get("http://google.com");
		//'navigate' command is similar to 'get' command,but it does not have wait mechanism(script will not wait)
        driver.navigate().to("https://rahulshettyacademy.com");
		//'back' command takes back to the history page
        driver.navigate().back();
		//'forward' command takes forward to the history page
        driver.navigate().forward();
		
	}

}
