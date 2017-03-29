package de.codecentric.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartingPageTest extends AbstractPageTest {

	private String pageLink = "/";
	
	@Test
	public void openPageAndValidateTitle() {
		open(pageLink);
		assertTrue("Page title does not match", PAGE_TITLE.equalsIgnoreCase(driver.getTitle()));
	}
	
	@Test
	public void openStartingPage() {
		open(pageLink);
		WebElement title = driver.findElement(By.className("panel-title"));
		assertTrue(title.isDisplayed());

		WebElement currentSessions = driver.findElement(By.id("current_sessions"));
		assertTrue(currentSessions.isDisplayed());
	}

}