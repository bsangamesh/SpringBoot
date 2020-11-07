package com.springBasics.springinfewsteps.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiTest {

	@InjectMocks
	SomeCDIBusiness business;

	@Mock
	SomeCDIDAO someCDIDAO;

	@Test
	public void test() {

		Mockito.when(someCDIDAO.getData()).thenReturn(new int[] { 2, 3, 4 });

		int result = business.findGreatest();
		assertEquals(4, result);

	}

}
