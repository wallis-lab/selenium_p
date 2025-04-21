package pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement MainLevel2 = getMainLevel2Element("//*[@id='bs_2']/span[1]");
	    wait.until(ExpectedConditions.elementToBeClickable(MainLevel2));
	    js.executeScript("arguments[0].scrollIntoView(true);", MainLevel2);
	    MainLevel2.click();

	    WebElement SubLevel4 = getSubLevel4Element("//*[@id='bf_4']/span[1]");
	    wait.until(ExpectedConditions.elementToBeClickable(SubLevel4));
	    js.executeScript("arguments[0].scrollIntoView(true);", SubLevel4);
	    SubLevel4.click();

	    WebElement LastLevel16 = getLastLevel16Element("//*[@id=\"c_bf_4\"]");
	    wait.until(ExpectedConditions.elementToBeClickable(LastLevel16));
	    js.executeScript("arguments[0].scrollIntoView(true);", LastLevel16);
	    try {
	        LastLevel16.click();  // Try clicking normally
	    } catch (ElementClickInterceptedException e) {
	        js.executeScript("arguments[0].click();", LastLevel16);  // Fallback to JavaScript click
	    }

	    WebElement LastLevel15 = getLastLevel15Element("//*[@id=\"c_io_15\"]");
	    wait.until(ExpectedConditions.elementToBeClickable(LastLevel15));
	    js.executeScript("arguments[0].scrollIntoView(true);", LastLevel15);
	    LastLevel15.click();

	    WebElement LastLevel151 = getLastLevel151Element("//*[@id=\"c_io_16\"]");
	    wait.until(ExpectedConditions.elementToBeClickable(LastLevel151));
	    js.executeScript("arguments[0].scrollIntoView(true);", LastLevel151);
	    Thread.sleep(500); // Wait for page stability
	    try {
	        LastLevel151.click();  // Try clicking normally
	    } catch (ElementClickInterceptedException e) {
	        js.executeScript("arguments[0].click();", LastLevel151);  // Fallback to JavaScript click
	    }

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
