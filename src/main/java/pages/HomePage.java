package pages;

import org.openqa.selenium.By;

import common.Driver;

public class HomePage extends Driver {
	
	
	public void clickTruckTab() {
		driver.findElement(By.id("nav_truck")).click();
	}

}
