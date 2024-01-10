package rayuduacademy;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rayuduacademy.TestComponents.BaseTest;
import rayuduacademy.TestComponents.Retry;
import rayuduacademy.pageobjects.ProductCatalogue;
import rayuduacademy.pageobjects.cartPage;

public class ErrorValidations extends BaseTest {
	
	@Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
	public void LoginErrorValidation() throws Exception {
		// TODO Auto-generated method stub	
		ProductCatalogue prodCat=landingPage.loginApplication("vidyarayudu668@gmail.com", "Rahu$469");
		Assert.assertEquals("Incorrect email  password",landingPage.getErrorMessage());
		
	}
	
	@Test
	public void productErrorValidation() throws Exception {
		String productName="ZARA COAT 3";	
		ProductCatalogue prodCat=landingPage.loginApplication("vidyarayudu668@gmail.com", "Rahul$469");
		List<WebElement> products=prodCat.getProductList();
		prodCat.addProductToCart(productName);
		cartPage cp=prodCat.goToCartPage();
		Boolean match=cp.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		
	}

}