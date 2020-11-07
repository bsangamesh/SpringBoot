package com.springBasics.springinfewsteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springBasics.springinfewsteps.basic.BinarySearch;

@Configuration
@ComponentScan
public class SpringInFewStepsBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInFewStepsBasicApplication.class);

	public static void main(String[] args) {

		// BinarySearch binarySearch = new BinarySearch(new BubbleSort());

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringInFewStepsBasicApplication.class);

		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);

		LOGGER.info("{}", binarySearch);
		System.out.println(binarySearch1);

		int res = binarySearch.binarySearch(new int[] { 1, 4, 5 }, 3);
		System.out.println(res);
		
		applicationContext.close();
	}

}
