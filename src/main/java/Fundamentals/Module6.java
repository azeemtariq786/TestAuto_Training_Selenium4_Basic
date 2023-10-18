package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/");
		
		String title = driver.getTitle();
		System.out.println("title is: "+title);
		
		driver.findElement(By.id("nav_truck")).click();
		
		
		WebElement ddMake = driver.findElement(By.id("make"));
		Select option = new Select(ddMake);
		option.selectByVisibleText("Nissan");
		
		driver.findElement(By.id("engineperformance")).sendKeys("1400");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/14/2023");
		
		
		// ------------------------- Module 6 - Lab work - Assignment -------------------
		
		// complete all fields on Enter Vehicle data, enter insurant data, & enter product data pages
		// radio button and check boxes handling is excluded form lab work, 
		
		// In Module 7, we'll complete radio & check boxes, error handling.
		
		
		
		// ------------------------- end of Module 6 - Lab work - Assignment -------------------
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
