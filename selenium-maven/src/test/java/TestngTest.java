import org.testng.annotations.Test;

import pagefoundation.TutorialsPointTestBase;
import pageobject.CheckBoxPage;

public class TestngTest extends TutorialsPointTestBase{
	
	
	@Test
	public void canClickMainLevelwithtestNG() throws InterruptedException {
		
		new CheckBoxPage(driver, baseUrl).clickCheckBoxPage()
		.clickSubLevel1().clickLastLevel1()
		.clickMainLevel2andSublevel4andLastLevel16();
	}

}
