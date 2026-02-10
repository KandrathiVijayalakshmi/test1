package log4J_pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4J2_demo {

	private static final Logger logger = LogManager.getLogger(log4J2_demo.class);

    public static void main(String[] args) {
    	System.out.println("hello!");
        logger.info("this is info msg!");
        logger.debug("this is debug msg");
       
    }

}

	

