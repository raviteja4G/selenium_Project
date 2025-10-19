package Lib;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

/*
 * Logger is an interface, not a class so cannot create an object of an interface directly.
 * Configurator.setRootLevel(Level.INFO) - Only show logs of INFO level or higher (INFO, WARN, ERROR, FATAL)
 * pass() uses log.info() (level = INFO)
 * Fail() uses log.error() (level = ERROR)
 * Info - root level
 * Warn - Higher than root level
 * Error - Higher than root level
 * Debug - Lower than root level
 * Trace  - Lower than root level
 */

public class reporter {
	
	//LogManager log = LogManager.getLogManager();
	private static final Logger log = LogManager.getLogger(reporter.class);
	
	static {
        // Force console logging even if no log4j2.xml file is present
        Configurator.setRootLevel(Level.INFO);
    }
	
	public static void info(String message) {
		log.info(message);
		
	}
	
	public static void pass(String message) {
		log.info(message);
	}
	
	public static void fail(String message) {
		log.error(message);
	}

}
