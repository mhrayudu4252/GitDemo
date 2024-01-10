package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class will execute before all the test methods executes within the class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class will execute after all the test methods executes within the class");
	}
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlName) {
		System.out.println("Web Login Car");
		System.out.println(urlName);
	}
	@Test(groups= {"smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("Mobile Login Car");
	}
	@Test(enabled=false)
	public void mobileSignInCarLoan() {
		System.out.println("Mobile SignIn Car");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method is executed before every test method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method is executed after every test method");
	}
	@Test(dataProvider="getData")
	public void mobileSignOutCarLoan(String userName,String password) {
		System.out.println("Mobile Signout Car");
		System.out.println(userName);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void loginAPICarLoan() {
		System.out.println("Login API Car");
	}
	@BeforeSuite
	public void bfSuite() {
		System.out.println("Before suite annotation execute before all the test methods executes in testNG xml");
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination first user name and password
		Object[][] data=new Object[3][2];
		//1st Data set
		data[0][0]="firstSetUserName";
		data[0][1]="firstPassword";
		//2st Data set
		data[1][0]="secondSetUserName";
		data[1][1]="secondPassword";
		//3st Data set
		data[2][0]="thirdSetUserName";
		data[2][1]="thirdPassword";
		return data;
	}

}
