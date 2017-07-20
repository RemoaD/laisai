package com.tata.common.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("path", sce.getServletContext().getContextPath());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
