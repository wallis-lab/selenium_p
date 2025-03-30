package freamework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jConfiguration {
	
	private static Logger logger = LogManager.getLogger(log4jConfiguration.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		System.out.println("Test log4j!!!!");
		
		logger.info("info massage");
		logger.error("error massage");
		logger.warn("warn massage");
		logger.fatal("fatal massage");
		
			
		System.out.println("finished");
		
	}
	
}
