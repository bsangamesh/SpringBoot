package com.springBasics.springinfewsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springBasics.springinfewsteps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringInFewStepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsCDIApplication.class);
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInFewStepsCDIApplication.class);
		
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{}", business);
		
		
		
	}
}
