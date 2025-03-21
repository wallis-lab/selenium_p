package testfile;

import static org.junit.Assert.*;

import org.junit.Test;

import pagefoundation.TutorialsPointTestBase;
import pageobject.CheckBoxPage;

public class checkBoxTest extends TutorialsPointTestBase {

	@Test
	public void canClickMainLevel() throws InterruptedException {
		new CheckBoxPage(driver, baseUrl).clickCheckBoxPage()
		.clickSubLevel1().clickLastLevel1()
		.clickMainLevel2andSublevel4andLastLevel16();
	}

}


