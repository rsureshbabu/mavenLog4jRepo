package com.slokam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.spi.LoggerFactory;

public class Product {

	//initializing logger obj for current class
	private static Logger logger = Logger.getLogger(Product.class);
	static {
		InputStream is;
		File file;
		try {
			file= new File("src/main/resources/log4j.properties");
			is = new FileInputStream(file);
			PropertyConfigurator.configure(is);
		} catch (FileNotFoundException e) {
			logger.warn("Properties file not found"+e);
			
		
		}
		}

	public static void main(String[] args) {

		Layout layout=new SimpleLayout();
		Appender appender=new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.info("info Message...");

/*		
		logger.trace("This is Trace Message..");
		logger.debug("This is Debug Message..");
		logger.info("This is infoo Message..");
		logger.warn("This is warn   Message..");
		logger.error("This is Error Message..");
		logger.fatal("This is Fetal Message..");
		
*/		
	}
}
