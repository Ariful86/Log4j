package testlogj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	static Logger logger= LogManager.getLogger(Log4JDemo.class);
	
	
	public static void main(String[] args) {
		System.out.println("Hello World..........!   \n");
		logger.debug("this is debug message");
		logger.info("information message");
		logger.warn("this is warning message");
		logger.error("this is an error message");
		logger.fatal("thsi is fatal message");
		logger.trace("This is trace message");
		
		System.out.println("\n Completed");
	}
	

}
