package com.springBasics.springinfewsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springBasics.springinfewsteps.xml.XmlPersonDOA;

@Configuration
@ComponentScan
public class SpringInFewStepsXmlApplicationContext {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsXmlApplicationContext.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		LOGGER.info("Beans loaded {}", (Object) applicationContext.getBeanDefinitionNames());

		XmlPersonDOA xmlPersonDOA = applicationContext.getBean(XmlPersonDOA.class);
		LOGGER.info("{}", xmlPersonDOA);
		System.out.println(xmlPersonDOA.getXmlJdbcConnection());

		applicationContext.close();
	}

}
