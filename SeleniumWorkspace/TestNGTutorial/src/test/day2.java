package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"smoke"})
	public void pLoan() {
		System.out.println("pLaon method is executing from day2 class");
	}
	
	@BeforeTest
	public void preRequiste() {
		System.out.println("Executing Before Test method before all Test Annotations");
	}

}
