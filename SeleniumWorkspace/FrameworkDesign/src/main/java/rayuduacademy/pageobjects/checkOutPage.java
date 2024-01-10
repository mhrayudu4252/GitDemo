package rayuduacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import rayuduacademy.AbstractComponents.AbstractComponent;

public class checkOutPage extends AbstractComponent {

	WebDriver driver;
	public checkOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="[placeholder='Select Country']")
	private WebElement country;
	@FindBy(css=".action__submit")
	private WebElement submit;
	private @FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;
	By results =By.cssSelector(".ta-results");
	
	public void selectCountry(String countryName) {
		Actions a=new Actions(driver);
		a.sendKeys(country,countryName).build().perform();
		waitForElemenToAppear(results);
		selectCountry.click();
		
	}
	public ConfirmationPage submitOrder() throws Exception {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", submit);
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(submit).click().build().perform();
		//submit.click();
		return new ConfirmationPage(driver);
	}
}