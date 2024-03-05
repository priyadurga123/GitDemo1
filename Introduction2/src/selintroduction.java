import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//invoking browser
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());//1
		System.out.println(driver.getCurrentUrl());//1
        driver.close();//1
	}

}
