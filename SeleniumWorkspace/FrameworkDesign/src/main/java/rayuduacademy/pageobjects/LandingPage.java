package rayuduacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rayuduacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//WebElement userEmail=driver.findElement(By.id("userEmail"));
	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	@FindBy(id="userPassword")
	WebElement passwordEle;
	@FindBy(id="login")
	WebElement submit;
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	public ProductCatalogue loginApplication(String email,String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue prodCat=new ProductCatalogue(driver);
		return prodCat;
	}
	public String getErrorMessage() {
		waitForWebElementElemenToAppear(errorMessage);
		return errorMessage.getText();
	}
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
