package pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import freamework.PageObject;

public class ModelDialogsPage extends PageObject {

	public ModelDialogsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		// TODO Auto-generated constructor stub
	}

	public ModelDialogsPage clickModelDialogsPage() {
		WebElement textbox = getCheckPageElement("collapseThree");

		textbox.click();

		return new ModelDialogsPage(driver, baseUrl);

	}

	private WebElement getCheckPageElement(String string) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id='" + string + "']/div/ul/li[5]/a"));
	
	}
	
	public ModelDialogsPage clickAlertPage() {
		WebElement textbox = getAlertPageElement("headingThree");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textbox);

		textbox.click();

		return new ModelDialogsPage(driver, baseUrl);

	}

	private WebElement getAlertPageElement(String string) {
		
		return driver.findElement(By.id(string));
	
	}
	
	
	public ModelDialogsPage clicksmallModal() {
		WebElement textbox = getsmallModalElement();
		//html/body/main/div/div/div[2]/button[1]
		textbox.click();

		return new ModelDialogsPage(driver, baseUrl);

	}

	private WebElement getsmallModalElement() {
		return driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
	}

	public ModelDialogsPage clickModal1close() {
	    // 等待 modal 出现（可选，看你流程）
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleModalSm")));

	    // 点击 modal 里的 close 按钮
	    WebElement textbox = getsmallcloseElement(); // 这个应该是 close 的按钮
	    textbox.click();

	    // 等待 modal 完全消失
	  
	    return new ModelDialogsPage(driver, baseUrl);
	}
	
	
	

	private WebElement getsmallcloseElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"exampleModalSm\"]/div/div/div[3]/button"));
	}

	public ModelDialogsPage clickmodal2() {
		// TODO Auto-generated method stub
		
		
		WebElement textbox = getlargeModalElement();
		//html/body/main/div/div/div[2]/button[1]
		textbox.click();

		return new ModelDialogsPage(driver, baseUrl);}

	private WebElement getlargeModalElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
	}

	public ModelDialogsPage closeModal2() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleModalLg")));
		WebElement textbox = getlargecloseElement();
		textbox.click();
		
		return new ModelDialogsPage(driver, baseUrl);
		// TODO Auto-generated method stub
		
	}

	private WebElement getlargecloseElement() {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"exampleModalLg\"]/div/div/div[3]/button"));
	}


	
	
}
