package testfile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pagefoundation.TutorialsPointTestBase;
import pageobject.TestBoxPage;

public class TextBox extends TutorialsPointTestBase {

	@Test
	public void canGetDriverType() {
		String expectedDriverType = "Chrome";
		
		String actrualDviverType = getDriverType();
		
		assertTrue("Not get the expected driver type" + expectedDriverType, expectedDriverType.equals(actrualDviverType));
	}
	@Test
	public void canClickTextBox() {
		
		new TestBoxPage(driver, baseUrl).enterfullname();
		
		
	}
		

}
