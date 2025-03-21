package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import freamework.PageObject;

import pageobject.WebTablePage;

public class WebTablePage extends PageObject {

	public WebTablePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);

	}

	public WebTablePage clickAddElement() {

		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[4]/a")).click();
		WebElement addButton = getWebTablePageElement();

		addButton.click();

		return new WebTablePage(driver, baseUrl);

	}

	private WebElement getWebTablePageElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button"));

	}

	public WebTablePage enterAllInfo() {

		WebElement fullname = driver.findElement(By.id("firstname"));
		WebElement lastname = driver.findElement(By.id("lastname"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement age = driver.findElement(By.id("age"));
		WebElement salary = driver.findElement(By.id("salary"));
		WebElement deparment = driver.findElement(By.id("deparment"));

		fullname.sendKeys("age1");
		lastname.sendKeys("ag11");
		email.sendKeys("88@gmail.com");
		age.sendKeys("8811");
		salary.sendKeys("12312312312312311111");
		deparment.sendKeys("insurance");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div[2]/input"));

		return new WebTablePage(driver, baseUrl);
	}

	public WebTablePage clickLoginbutton() {
		return null;

	}

	public WebTablePage getElementText() {
		return null;

	}

}
