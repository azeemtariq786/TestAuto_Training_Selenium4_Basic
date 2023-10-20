package Fundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module7 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/");
		
		String title = driver.getTitle();
		System.out.println("title is: "+title);
		
		driver.findElement(By.id("nav_truck")).click();
		
		// select make
		WebElement ddMake = driver.findElement(By.id("make"));
		Select option = new Select(ddMake);
		option.selectByVisibleText("Nissan");
		
		// engine performance
		driver.findElement(By.id("engineperformance")).sendKeys("1400");
		
		// date of manufacture
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/14/2023");	
	
		// number of seats
		WebElement ddNumberOfSeats = driver.findElement(By.id("numberofseats"));
		option = new Select(ddNumberOfSeats);
		option.selectByVisibleText("5");
		
		// Fuel type
		WebElement ddFuelType = driver.findElement(By.id("fuel"));
		option = new Select(ddFuelType);
		option.selectByVisibleText("Gas");
		
		// Payload
		driver.findElement(By.id("payload")).sendKeys("850");
		
		// Total Weight
		driver.findElement(By.id("totalweight")).sendKeys("7500");
		
		// List Price
		driver.findElement(By.id("listprice")).sendKeys("45000");
		
		// License Plate
		driver.findElement(By.id("licenseplatenumber")).sendKeys("Test Auto");
		
		// Annual Mileage
		driver.findElement(By.id("annualmileage")).sendKeys("12000");
		
		// click next
		driver.findElement(By.id("nextenterinsurantdata")).click();
				
		// Enter Insurant data page		
		// first name
		driver.findElement(By.id("firstname")).sendKeys("Automation");
		
		// Last name
		driver.findElement(By.id("lastname")).sendKeys("Fundamentals");
		
		// Date of Birth		
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("11/15/1980");
		
		// Gender - radio button

		List<WebElement> genderOptions = driver.findElements(By.xpath("//input[@name='Gender']/parent::label"));

		for (WebElement element: genderOptions) {
			if(element.getText().equalsIgnoreCase("Female")) {
				element.click();
			}
		}

		
		// Street address
		driver.findElement(By.id("streetaddress")).sendKeys("1920 Torronto St");
		
		// Country - dropdown
		WebElement ddCountry = driver.findElement(By.id("country"));
		option = new Select(ddCountry);
		option.selectByVisibleText("Barbados");
		
		// Zip code
		driver.findElement(By.id("zipcode")).sendKeys("23140");
		
		// City
		driver.findElement(By.id("city")).sendKeys("Victoria");
		
		// Occupation - dropdown
		WebElement ddOccupation = driver.findElement(By.id("occupation"));
		option = new Select(ddOccupation);
		option.selectByVisibleText("Farmer");
		
		// Hobbies - checkboxes
		List<WebElement> hobbies = driver.findElements(By.xpath("//input[@name='Hobbies']/parent::label"));
		
		String [] hobbiesToCheck = {"Bungee Jumping", "Cliff Diving"};
		
		for(String item: hobbiesToCheck) {
			for (WebElement hobby: hobbies) {
				if(hobby.getText().equalsIgnoreCase(item)) {
					hobby.click();
					break;
				}
			}
		}


		
		// Website
		driver.findElement(By.id("website")).sendKeys("https://xaama.tech/");
		
		// picture - not covered in fundamental series
		
		
		// next button
		driver.findElement(By.id("nextenterproductdata")).click();
		
		// Enter product data 
		// Start date
		driver.findElement(By.id("startdate")).sendKeys("09/25/2025");
		
		// Insurance sum
		WebElement ddInsuranceSum = driver.findElement(By.id("insurancesum"));
		option = new Select(ddInsuranceSum);
		option.selectByVisibleText("10.000.000,00");
		
		// Damage Insurance
		WebElement ddDamageInsurance = driver.findElement(By.id("damageinsurance"));
		option = new Select(ddDamageInsurance);
		option.selectByVisibleText("Partial Coverage");
		
		
		// Optional products - checkboxes		
		List<WebElement> products = driver.findElements(By.xpath("//input[@name='Optional Products[]']/parent::label"));
		
		for (WebElement product: products) {
			if (product.getText().equalsIgnoreCase("Legal Defense Insurance")) {
				product.click();
			}
		}

		
		// Next button
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		// Select price option
		//
		
		String plan = "Platinum";
		String planXpath = "//input[@name='Select Option' and @value='"+plan+"']/parent::label";
		
		driver.findElement(By.xpath(planXpath)).click();
		
		// send quote
		Thread.sleep(3000);
		driver.findElement(By.id("nextsendquote")).click();
		
		// send quote
		
		// eamils
		driver.findElement(By.id("email")).sendKeys("xamaatechnologies@gmail.com");

		driver.findElement(By.id("phone")).sendKeys("2503846786");

		driver.findElement(By.id("username")).sendKeys("Test");
		

		driver.findElement(By.id("password")).sendKeys("Password1");
		

		driver.findElement(By.id("confirmpassword")).sendKeys("Password1");
		

		driver.findElement(By.id("Comments")).sendKeys("Test automation fundamental training series.");	
		
		driver.quit();	
		

	}
	


}
