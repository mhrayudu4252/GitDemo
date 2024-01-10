package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Web Login Home");
	}
	@Test(groups= {"smoke"})
	public void mobileLoginHomeLoan() {
		System.out.println("Mobile Login Home");
	}
	@Test
	public void loginAPIHomeLoan() {
		System.out.println("Login API Home");
	}

}
