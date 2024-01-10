package rayuduacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import rayuduacademy.AbstractComponents.AbstractComponent;

public class cartPage extends AbstractComponent {
	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	@FindBy(css=".cartSection h3")
	private List<WebElement> cartProducts;
	
	public cartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public Boolean VerifyProductDisplay(String productName) {
		Boolean match=cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	public checkOutPage goToCheckout() {
		checkoutEle.click();
		return new checkOutPage(driver);
	}
}
