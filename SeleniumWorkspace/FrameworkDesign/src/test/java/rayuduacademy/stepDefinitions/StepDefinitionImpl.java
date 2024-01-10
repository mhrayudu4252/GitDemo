package rayuduacademy.stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rayuduacademy.TestComponents.BaseTest;
import rayuduacademy.pageobjects.ConfirmationPage;
import rayuduacademy.pageobjects.LandingPage;
import rayuduacademy.pageobjects.ProductCatalogue;
import rayuduacademy.pageobjects.cartPage;
import rayuduacademy.pageobjects.checkOutPage;

public class StepDefinitionImpl extends BaseTest {
	
	public LandingPage landingPage;
	public ProductCatalogue productcatalogue;
	public ConfirmationPage confirmationpage;
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Eommerce_Page() throws Exception {
		//code
		landingPage=launchApplication();
	}
	
	@Given("^Logged in with userName (.+) and UserPassword (.+)$")
	public void Logged_In_With_UserName_And_UserPassword(String userName,String password) {
		
		 productcatalogue=landingPage.loginApplication(userName,password);
	}
	
	@When("^I add product (.+) from cart$")
	public void I_add_product_from_Cart(String productName) {
		List<WebElement> products=productcatalogue.getProductList();
		productcatalogue.addProductToCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void Checkout_and_Submit_the_order(String productName) throws Exception {
		cartPage cp=productcatalogue.goToCartPage();
		Boolean match=cp.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		checkOutPage cop=cp.goToCheckout();
		cop.selectCountry("india");
		confirmationpage=cop.submitOrder();
	}	
	
	@Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_confirmationPage(String string)
    {
    	String confirmMessage = confirmationpage.getconfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
    }
	@Then("^\"([^\"]*)\" message is displayed$")
    public void something_message_is_displayed(String strArg1) throws Throwable {
		Assert.assertEquals(strArg1,landingPage.getErrorMessage());
		driver.close();
    }
}