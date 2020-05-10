package com.springBasics.springinfewsteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortingAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
