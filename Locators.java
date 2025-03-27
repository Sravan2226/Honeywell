package honey.qa.ecomm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import honey.qa.ecomm.base.TestBase;
import honey.qa.ecomm.util.ElementUtil;

public class Locators extends TestBase{

	WebDriver driver;
	ElementUtil elementutil;
	
	
	By contactUs = By.xpath("//a[contains(text(), 'ContactUs']");
	By about = By.xpath("(//nav[@class='sc-kpDqfm jGsMhc']/ul/li/div[@class='ListItemLabel']/span)[8]");
	By solutions = By.xpath("(//nav[@class='sc-kpDqfm jGsMhc']/ul/li/div[@class='ListItemLabel']/span)[1]");
	By store = By.xpath("(//div[@class='CollapsibleListItem-content']/ul/li/div/span)[1]");
	By shopNow = By.xpath("(//div[@class='CollapsibleListItem-content']/ul/li/a)[1]");
	
	
	
	public Locators(WebDriver driver) {
		this.driver = driver;
		 elementutil = new ElementUtil(driver);
	}
	
	
	public void verifyContactUslink() throws InterruptedException  {	
		elementutil.doClick(about);
		elementutil.doClick(contactUs);
	}
	
	public void verifyAllLinks() throws InterruptedException  {
		elementutil.doClick(solutions);
		elementutil.doClick(store);
		elementutil.doClick(shopNow);
	}
	
}
