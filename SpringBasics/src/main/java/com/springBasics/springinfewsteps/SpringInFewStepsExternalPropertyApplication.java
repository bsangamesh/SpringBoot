package com.springBasics.springinfewsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springBasics.springinfewsteps.externalProperty.SomeExternalFile;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringInFewStepsExternalPropertyApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsExternalPropertyApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringInFewStepsExternalPropertyApplication.class);

		SomeExternalFile externalFile = applicationContext.getBean(SomeExternalFile.class);

		LOGGER.info("{}", externalFile.getUrl());


		applicationContext.close();
	}

}
