package com.BeanComplex.Demo_02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BeanComplex.Demo_02.Scope.personDAO; 


@SpringBootApplication //3. tell spring Where to search for beans?
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
	
	public static void main(String[] args) {
		
		
		//Application Context is manage all the beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args); //press CRT+1 and assign application context to local variable
		
		personDAO personDAOVariable1 =  applicationContext.getBean(personDAO.class); //getting the beans out from the application context and assign to variable
		personDAO personDAOVariable2 =  applicationContext.getBean(personDAO.class); //getting the beans out from the application context and assign to variable

		
		LOGGER.info("{}",personDAOVariable1);
		LOGGER.info("{}",personDAOVariable1.getJdbcConnection());
		LOGGER.info("{}",personDAOVariable1.getJdbcConnection());
		
		LOGGER.info("{}",personDAOVariable2);
		LOGGER.info("{}",personDAOVariable2.getJdbcConnection());
		
	}

}
