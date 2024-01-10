import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name="Rahul";
		System.setProperty("webdriver.chrome.driver","E:\\Rahul Shetty\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String resetPassword=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(resetPassword);
		Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws Exception {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(5000);
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray=passwordText.split("'");
		String password=passwordArray[1].split("'")[0];
		return password;
		
	}

}
