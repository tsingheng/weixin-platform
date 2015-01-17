package net.shangtech.weixin.platform.listener;

import java.io.IOException;
import java.util.Properties;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationStartupListener implements ServletContextListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationStartupListener.class);
	
	private static final String APPLICATION_CONFIG = "config/application.properties";
	
	@Override
    public void contextDestroyed(ServletContextEvent arg0) {
	    // does nothing
    }

	@Override
    public void contextInitialized(ServletContextEvent event) {
	    Properties properties = new Properties();
	    ServletContext sc = event.getServletContext();
	    try {
	        properties.load(getClass().getClassLoader().getResourceAsStream(APPLICATION_CONFIG));
	        properties.forEach((key, value) -> {
	        	sc.setAttribute(String.valueOf(key), value);
	        	LOGGER.info("load property [{}={}]", key, value);
	        });
        } 
	    catch (IOException e) {
	    	LOGGER.error("load application properties error", e);
        }
	    sc.setAttribute("ctx", event.getServletContext().getContextPath());
    }

}
