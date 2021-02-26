package com.BeanComplex.Demo_02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BeanComplex.Demo_02.CDI.someCdi; 


@SpringBootApplication //3. tell spring Where to search for beans?
public class CdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);
	
	public static void main(String[] args) {
		
		
		//Application Context is manage all the beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args); //press CRT+1 and assign application context to local variable
		
		someCdi bussiness =  applicationContext.getBean(someCdi.class); //getting the beans out from the application context and assign to variable

		
		LOGGER.info("{} dao-{}",bussiness, bussiness.getSomeCdiDao());

		
	}

}
