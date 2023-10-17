package Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sparkstone.co.nz/sampleapp/101/");
		
		String title = driver.getTitle();
		System.out.println("title is: "+title);

	}

}
