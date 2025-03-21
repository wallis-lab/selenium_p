package testfile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import pagefoundation.TutorialsPointTestBase;
import pageobject.RadioButtonPage;

public class RadioButtonTest extends TutorialsPointTestBase {

	@Test
	public void canclickYesButton() {

		String checkYes= "Yes";
		
		new RadioButtonPage(driver, baseUrl).clickRadioButton().clickYesButton();
		
		String FindYes = new RadioButtonPage(driver, baseUrl).gettext1().getText();
		
		assertEquals(checkYes,FindYes);
		
	}
}
