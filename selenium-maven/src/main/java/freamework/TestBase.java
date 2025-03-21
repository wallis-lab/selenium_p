package freamework;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {
	protected WebDriver driver;
	protected String baseUrl;
	protected DriverManager manager;
	
	protected TestBase(String baseUrl){
		this.baseUrl = baseUrl;
	}
	
	@Before
	public void setup() {
		String driverType= getDriverType();
		this.manager= DriverManagerFactory.getManager(driverType);
		this.manager.createDriver();
		this.driver=this.manager.getDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().window().maximize();
		this.driver.navigate().to(this.baseUrl);
	}
	
	public String getDriverType() {
		Properties propertie = new Properties();
		try{					 
			 String filePath = "src\\resources\\config.properties";
			 InputStream inputstream =new FileInputStream(filePath);
			 propertie.load(inputstream);
			}
		catch(Exception e){
			 throw new RuntimeException("Failed to load config.properties", e);
			 }
		
		return propertie.getProperty("browserType");
	}
	
	@After
	public void cleanup() {
		if (this.manager != null) {
		this.manager.quitDriver();
	}}
}
