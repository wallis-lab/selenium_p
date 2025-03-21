package freamework;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager{

	private final String WEB_DRIVER_SYSTEM_PROPERTY_EDGE = "webdriver.edge.driver";
	private final String edgeDriverPath = "src\\resources\\msedgedriver.exe";
	
	EdgeDriverManager(){
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY_EDGE, edgeDriverPath);
	}

	public void createDriver() {
		setDriver(new EdgeDriver());
	}
}

