package com.BeanComplex.Demo_02.CDI;

import javax.inject.Named;

@Named
public class someCdiDao {

	public someCdiDao(){
		
		System.out.println("CDI Dao");
	}
	
}
