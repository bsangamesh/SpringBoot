package com.springBasics.springinfewsteps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

	public int[] getData() {
		return new int[] { 5, 3, 22 };
	}
}
