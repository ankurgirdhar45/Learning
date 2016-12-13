package code;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class log4jtest {
	@Test
	public void testappender(){
		Logger log = LogManager.getLogger(log4jtest.class);
		log.debug("debug message");
		System.out.println("this is syso");
		log.info("this is info message");
		log.error("error aa gyi");
		log.fatal("OMG fatal");
	}
}
