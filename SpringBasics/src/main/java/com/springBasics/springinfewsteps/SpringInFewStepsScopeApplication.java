package com.springBasics.springinfewsteps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springBasics.springinfewsteps.scope.PersonDOA;

@Configuration
@ComponentScan
public class SpringInFewStepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsScopeApplication.class);
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInFewStepsScopeApplication.class);
		
		PersonDOA personDOA = applicationContext.getBean(PersonDOA.class);
		PersonDOA personDOA2 = applicationContext.getBean(PersonDOA.class);
		
		LOGGER.info("{}", personDOA.getJdbcConnection());
		LOGGER.info("{}", personDOA2.getJdbcConnection());
		
		
		
		
	}

}
