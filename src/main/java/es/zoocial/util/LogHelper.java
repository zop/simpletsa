package es.zoocial.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogHelper {
	
	public static void error(Class<?> clazz, String message, Throwable t) {
		Logger log = Logger.getLogger(clazz.getName());
		log.log(Level.SEVERE, message, t);
	}

	public static void warning(Class<?> clazz, String message, Throwable t) {
		Logger log = Logger.getLogger(clazz.getName());
		log.log(Level.WARNING, message, t);
	}

}