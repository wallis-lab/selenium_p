package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import freamework.PageObject;

public class RadioButtonPage extends PageObject {

	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public RadioButtonPage clickRadioButton() {
		WebElement textbox = getRadioButtonElement("navMenus");

		textbox.click();

		return new RadioButtonPage(driver, baseUrl);

	}

	private WebElement getRadioButtonElement(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\'"+string+"\']/li[3]/a"));

	}

	public RadioButtonPage clickYesButton() {
		// TODO Auto-generated method stub
		WebElement textbox = getRadioButtonYesElement("/html/body/main/div/div/div[2]/form/div[1]/input");

		textbox.click();
		return new RadioButtonPage(driver, baseUrl);
	}

	private WebElement getRadioButtonYesElement(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

	public WebElement gettext1() {
		// TODO Auto-generated method stub
	
		
		return driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/label"));
	}

}
