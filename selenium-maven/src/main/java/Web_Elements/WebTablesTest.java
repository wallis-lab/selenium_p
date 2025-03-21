package Web_Elements;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import pagefoundation.TutorialsPointTestBase;
import pageobject.WebTablePage;

public class WebTablesTest extends TutorialsPointTestBase {

	@Test
	public void canAddElementtoTable() {

		String checkAgeText = "8811";

		new WebTablePage(driver, baseUrl).clickAddElement().enterAllInfo();
		
		
		
		
	/*	.clickLoginbutton();
		
		String findText = new WebTablePage(driver, baseUrl).getElementText().getText();
				

		assertEquals(checkText, findText);*/
	}

	@Test
	public void canChangeElementtoTable() {

	}

	@Test
	public void candeleteElementtoTable() {

	}

}
