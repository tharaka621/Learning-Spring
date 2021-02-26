package com.BeanComplex.Demo_02.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class someCdi {
	
	@Inject
	someCdiDao someCdiDao;

	public someCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(someCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	} 
}
