package com.springBasics.springinfewsteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortingAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
