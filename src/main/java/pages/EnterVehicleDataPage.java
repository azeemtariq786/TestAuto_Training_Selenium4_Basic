package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.Driver;

public class EnterVehicleDataPage extends Driver {


	public String enginePerformanceError() {
		//input[@id='engineperformance']/following-sibling::span[contains(@class, 'error')]

		return driver.findElement(By.xpath("//input[@id='engineperformance']/following-sibling::span[contains(@class, 'error')]")).getText();
	}

	public void setEnginePerformance(String value) {
		// engine performance
		driver.findElement(By.id("engineperformance")).sendKeys(value);

	}

	public void enterVehicleData() {
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


	}
	public void clickNext() {
		// click next
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

}
