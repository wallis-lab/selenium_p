package pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import freamework.PageObject;
import pagefoundation.TutorialsPointTestBase;

public class CheckBoxPage extends PageObject {

	public CheckBoxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);

	}

	public CheckBoxPage clickCheckBoxPage() {
		WebElement textbox = getCheckPageElement("navMenus");

		textbox.click();

		return new CheckBoxPage(driver, baseUrl);

	}

	private WebElement getCheckPageElement(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id='" + string + "']/li[2]/a"));
	}

	public CheckBoxPage clickSubLevel1() {

		WebElement textbox = getMainlevelElement("//*[@id=\"bs_1\"]/span[1]");

		textbox.click();

		return new CheckBoxPage(driver, baseUrl);

	}

	private WebElement getMainlevelElement(String string) {

		return driver.findElement(By.xpath(string));
	}

	public CheckBoxPage clickLastLevel1() {
		WebElement textbox = getMainlevelElement("//*[@id=\"bf_1\"]/span[1]");

		textbox.click();

		return new CheckBoxPage(driver, baseUrl);
	}

	public CheckBoxPage clickMainLevel2andSublevel4andLastLevel16() throws InterruptedException {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement MainLevel2 = getMainLevel2Element("//*[@id='bs_2']/span[1]");

		MainLevel2.click();

		WebElement SubLevel4 = getSubLevel4Element("//*[@id='bf_4']/span[1]");

		SubLevel4.click();

		WebElement LastLevel16 = getLastLevel16Element("//*[@id=\"c_bf_4\"]");

		LastLevel16.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		LastLevel16.click();

		WebElement LastLevel15 = getLastLevel15Element("//*[@id=\"c_io_15\"]");

		LastLevel15.click();

		WebElement LastLevel151 = getLastLevel151Element("//*[@id=\"c_io_16\"]");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", LastLevel151);
		Thread.sleep(500); // 可选，等待页面稳定

		LastLevel151.click();

		return new CheckBoxPage(driver, baseUrl);

	}

	private WebElement getLastLevel151Element(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

	private WebElement getLastLevel15Element(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

	private WebElement getLastLevel16Element(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

	private WebElement getSubLevel4Element(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

	private WebElement getMainLevel2Element(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(string));
	}

}
