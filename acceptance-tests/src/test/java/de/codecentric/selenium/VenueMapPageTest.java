package de.codecentric.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VenueMapPageTest extends AbstractPageTest {

	private String pageLink = "/feedback";
	
	@Test
	public void openPageAndValidateTitle() {
		open(pageLink);
		assertTrue("Page title does not match", PAGE_TITLE.equalsIgnoreCase(driver.getTitle()));
	}
	
	@Test
	public void openVenueMapPage() {
		open(pageLink);
		WebElement title = driver.findElement(By.className("panel-title"));
		assertTrue(title.isDisplayed());
	}

}