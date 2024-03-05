import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class asssaual {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File("C:\\Users\\Win 10\\screenshot.png"));
	   /*Refer the youtube 'selenium playlist' ,you saved*/

	}

}
