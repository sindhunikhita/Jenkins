package de.codecentric.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Ignore
public class OpenSpaceSessionsPageTest extends AbstractPageTest {

	private String pageLink = "/allSessions";
	
	@Test
	public void openPageAndValidateTitle() {
		open(pageLink);
		assertTrue("Page title does not match", PAGE_TITLE.equalsIgnoreCase(driver.getTitle()));
	}

	@Test
	public void openCurrentSessionsPage() {
		open(pageLink);
		WebElement title = driver.findElement(By.className("panel-title"));
		assertTrue(title.isDisplayed());
	}
	
}