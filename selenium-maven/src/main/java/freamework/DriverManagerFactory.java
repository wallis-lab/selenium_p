package freamework;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManagerFactory {

	public static DriverManager getManager(String driverType) {
		
		if(driverType.equals("Chrome")){
			 ChromeOptions options = new ChromeOptions();

	            // ✅ 增加这些参数让 Jenkins 上更稳定
	            options.addArguments("--headless=new"); // 或 "--headless"（新版本推荐用 new）
	            options.addArguments("--disable-gpu");
	            options.addArguments("--no-sandbox");
	            options.addArguments("--disable-dev-shm-usage");
	            options.addArguments("--window-size=1920,1080");

	            return new ChromeDriverManager(options);
	
		}else if(driverType.equals("Edge")){
			
			return new EdgeDriverManager();	
		}
		throw new IllegalArgumentException("This driver type is not supported: " + driverType);
	}
}
