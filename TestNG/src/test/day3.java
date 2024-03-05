package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(enabled=false)
	public void WebloginCarLoan() {//selenium}
	System.out.println("WebloginCar");
	
	}
	@Parameters({"URL","APIKey/username"})
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan(String urlname,String user) {//Appium}
		System.out.println("MobileLogincar");
		System.out.println(urlname);
		System.out.println(user);
		
	}
	@Test(dependsOnMethods={"MobileLogincarLoan"})
	public void LoginAPIcarLoan() {//Rest API automation
		System.out.println("LoginAPIcar");
	}
	@Test(timeOut=4000)
		public void MobilesignoutcarLoan() {System.out.println("Mobile SIGNOUT");}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];
		data[0][0]="firtsetusername";
		data[0][1]="password";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thridsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
	@Test(dataProvider="getData")
		public void MobilesignoutcarLoan(String username,String password) {
			System.out.println(username);
			System.out.println(password);
		}
	
	@BeforeSuite
	public void Bfsuite() {System.out.println("I am no 1");}
    @AfterSuite 
    public void Afsuite() {System.out.println("I am no 1 from last");}
    @BeforeMethod 
    public void beforeevery() {System.out.println("I will execute before every test method");}
    @AfterMethod 
    public void afterevery() {System.out.println("I will execute after every test method");}
    @BeforeClass 
    public void beforeclass() {System.out.println("Before executing any  methods in the class");}
    @AfterClass 
    public void afterclass() {System.out.println("After executing all methods in the class");}
}
