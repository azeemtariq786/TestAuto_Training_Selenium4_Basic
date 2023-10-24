package functionalTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.*;
import pages.*;

public class TruckTests extends Driver {
	

	
	@Test
	public void verify_EnginePerformance_BoundaryValues() {
		
		// Arrange
		String expectedErrorValue = "Must be a number between 1 and 2000";
		homePage.clickTruckTab();
		
		
		// Act
		vehicleData.setEnginePerformance("14500");
		String error = vehicleData.enginePerformanceError();
		
		System.out.println("error is: "+error);
		
		// Assert
		Assert.assertEquals(error, expectedErrorValue);
	}
	
	public void verify_anotherTest() {
		
	}

}
