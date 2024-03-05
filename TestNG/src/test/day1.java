package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@Test 
	public void Demo() {
		System.out.println("hello");
	}
   @Test 
   public void SecondTest() {
	   System.out.println("bye");
   }
   @AfterTest
   public void lastexecution() {System.out.println("I will execute last");}
}
