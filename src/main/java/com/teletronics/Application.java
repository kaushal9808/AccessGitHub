package com.teletronics;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.JobExecutionExitCodeGenerator;
import org.springframework.context.ConfigurableApplicationContext;

import static java.util.Arrays.asList;

@SpringBootApplication
public class Application {
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	static ConfigurableApplicationContext context;
	
	public static void main(String[] args){
		start(args);
	}
	
	static int stop(){ 
		LOG.info("GitHubAccess service shutting down");
		return SpringApplication.exit(context, new JobExecutionExitCodeGenerator());
	}
	
	private static void start(String[] args){
		System.setProperty("sun.net.http.allowRestrictedHeaders","true");
		context = SpringApplication.run(Application.class, args);
		final List<String> activeProfiles = asList(context.getEnvironment().getActiveProfiles());
		LOG.info("Github Service completed : Active profiles : " + activeProfiles);
		context.registerShutdownHook();
		
	}
	
	

}
