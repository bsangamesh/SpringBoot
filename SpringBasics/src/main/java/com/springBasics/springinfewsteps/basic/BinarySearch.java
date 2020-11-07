package com.springBasics.springinfewsteps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

	@Autowired
	@Qualifier("bubble")
	private SortingAlgorithm sortingAlgorithm;
	
	/*
	 * public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
	 * this.sortingAlgorithm = sortingAlgorithm; }
	 */

	/*
	 * public BinarySearch(SortingAlgorithm sortingAlgorithm) {
	 * this.sortingAlgorithm = sortingAlgorithm; }
	 */
	public int binarySearch(int[] numbers, int num){
		System.out.println("inside search methods");
		int[] sortedNum = sortingAlgorithm.sort(numbers);
		System.out.println(sortingAlgorithm);
		return 2;
	}
	
}
