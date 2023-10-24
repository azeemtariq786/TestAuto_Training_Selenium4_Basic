package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EnterVehicleDataPage;
import pages.HomePage;

public class Driver extends ObjectContainer{

	//public WebDriver driver;

	@BeforeMethod
	public void setup() {
		launchApplication();
		homePage = new HomePage();
		vehicleData = new EnterVehicleDataPage();
	}
	
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options =  openOnMonitor();

		 driver = new ChromeDriver(options);

		driver.get("https://www.sparkstone.co.nz/sampleapp/101/");

		String title = driver.getTitle();
		System.out.println("title is: "+title);
	}
	
	@AfterMethod
	public void cleanup() {
		driver.quit();
		
	}

	public static ChromeOptions openOnMonitor() {
		ChromeOptions options = new ChromeOptions();
		// Set the window position and size to place it on the extended display
		options.addArguments("--window-position=1366,0"); // Change these values based on your extended display resolution
		options.addArguments("--window-size=1920,1080");  // Change these values based on your extended display resolution

		return options;

	}

}
