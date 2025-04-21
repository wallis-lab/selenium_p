import org.testng.annotations.Test;

import pagefoundation.TutorialsPointTestBase;
import pageobject.ModelDialogsPage;

public class ModalDialogsTest extends TutorialsPointTestBase{
  @Test
  public void clickSmallModelOrLargeModel() {
	  new ModelDialogsPage(driver,baseUrl)
	  .clickAlertPage()
	  .clickModelDialogsPage()
	  .clicksmallModal()
	  .clickModal1close()
	  .clickmodal2()
	  .closeModal2();
	  
  }
}
