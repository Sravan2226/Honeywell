package honey.qa.ecomm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	Properties prop;

	public Properties init_properties() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"E:\\Newselenium\\ProKarma\\src\\main\\java\\prokarma\\qa\\ecomm\\config\\config.Properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public WebDriver init_driver(Properties prop) {

		String browser = prop.getProperty("Browser");

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("Please pass the correct browser name...");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));

		return driver;

	}

}
