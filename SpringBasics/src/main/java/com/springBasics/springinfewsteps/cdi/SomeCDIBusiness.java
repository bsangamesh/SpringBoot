package com.springBasics.springinfewsteps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

	public int findGreatest() {
		int high = Integer.MIN_VALUE;
		int[] data = someCDIDAO.getData();

		for (int val : data) {
			if (val > high)
				high = val;
		}

		return high;
	}

}
