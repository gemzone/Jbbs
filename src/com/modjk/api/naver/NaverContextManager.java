package com.modjk.api.naver;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class NaverContextManager implements ServletContextListener
{
	public static final Logger logger = LoggerFactory.getLogger(NaverContextManager.class);
	
	public static String clientId = null;
	public static String clientSecret = null;
	
	public static final String naverStateSessionName = "naver_state";
	
// private static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

	@Override
	public void contextDestroyed(ServletContextEvent e)
	{
		logger.info("NaverContextManager::Destroyed");
//		scheduler.shutdown();
	}
	
	@Override
	public void contextInitialized(ServletContextEvent e)
	{
		logger.info("NaverContextManager::Initialize");
		
		clientId = e.getServletContext().getInitParameter("naver_client_id");
		clientSecret = e.getServletContext().getInitParameter("naver_client_secret");
		
		logger.info("clientId " + clientId);
		logger.info("clientSecret " + clientSecret);
	}

}
