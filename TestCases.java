package honey.qa.ecomm.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import honey.qa.ecomm.base.TestBase;
import honey.qa.ecomm.pages.Locators;
import io.qameta.allure.Description;

public class TestCases {

	WebDriver driver;
	Properties prop;
	TestBase testBase;
	Locators contactUs;

	@BeforeMethod
	public void setUp() {
		testBase = new TestBase();
		prop = testBase.init_properties();
		driver = testBase.init_driver(prop);
	}

	private void asserTrue(boolean contains) {

	}

	@Description("verify contactus link")
	@Test(priority = 1, enabled = true)
	public void verifyAddToCart() throws InterruptedException {
		contactUs.verifyContactUslink();
		String contacturl = driver.getCurrentUrl();
		asserTrue(contacturl.contains("contactus"));
	}

	@Description("verify all the links availablein the application")
	@Test(priority = 2, enabled = false)
	public void verifyProceedToBuy() throws InterruptedException {
		contactUs.verifyAllLinks();
		String storeUrl = driver.getCurrentUrl();
		asserTrue(storeUrl.contains("store"));
	}
}
