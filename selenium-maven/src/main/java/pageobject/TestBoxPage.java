package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import freamework.PageObject;

public class TestBoxPage extends PageObject{

	public TestBoxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
		
	}

	public TestBoxPage clickTextBoxPage() {
		WebElement textbox = getProductPageElement("text-box.php");
		
		textbox.click();
		
		return new TestBoxPage(driver, baseUrl);
			
	}
	
	
	public TestBoxPage enterfullname() {
		WebElement fullname= driver.findElement(By.id("fullname"));
		WebElement email= driver.findElement(By.id("email"));
		WebElement address= driver.findElement(By.id("address"));
		WebElement password= driver.findElement(By.id("password"));
		
		fullname.sendKeys("name");
		email.sendKeys("name@gmail.com");
		address.sendKeys("14420 sanford ave flushing");
		password.sendKeys("12345678");
		
		WebElement submit= driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
		
		submit.click();
		
		return new TestBoxPage(driver, baseUrl);
			
	}
	
	

	private WebElement getProductPageElement(String textbox) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//a[text()='"+textbox +"']/@href"));
		
	}
	
	
	
	
	
	
	
}
