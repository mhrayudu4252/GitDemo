package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo() {
		System.out.println("Demo Method is executing from day1 class");
	}
	@Test
	public void secondTest() {
		System.out.println("secondTest Method is executing from day2 class");
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("After suite annotation execute after all the test methods executes in testNG xml");
	}
	@AfterTest
	public void prerequisteEnd() {
		System.out.println("After Test Annotation will execute after all the @Test Annotations");
	}

}
