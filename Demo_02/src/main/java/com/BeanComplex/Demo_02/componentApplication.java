package com.BeanComplex.Demo_02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.BeanComplex.componentscan.ComponentDAO; 


@SpringBootApplication //3. tell spring Where to search for beans?
@ComponentScan("com.BeanComplex.componentscan") //search on the 'component' package
public class componentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(componentApplication.class);
	
	public static void main(String[] args) {
		
		
		//Application Context is manage all the beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(componentApplication.class, args); //press CRT+1 and assign application context to local variable
		
		ComponentDAO componentDAOVariable1 =  applicationContext.getBean(ComponentDAO.class); //getting the beans out from the application context and assign to variable
		
		LOGGER.info("{}",componentDAOVariable1);
	
	
	}

}
