package com.springBasics.springinfewsteps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springBasics.springinfewsteps.basic.BinarySearch;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringInFewStepsBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearch binarySearch;

	@Test
	public void test() {

		int result = binarySearch.binarySearch(new int[] { 1, 2, 3, 4 }, 4);
		assertEquals(8, result);

	}

}
