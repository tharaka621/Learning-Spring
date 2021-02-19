package beanScope.copy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext; 


@SpringBootApplication //3. tell spring Where to search for beans?
public class DemoApplication {
	
	/*
	 *	1. singleton - One instance per Spring Context  ** Default
	 *	2. prototype - New bean whenever requested  ** @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) to class binarySearch
	 *	3. request   - One bean per HTTP request
	 *  4. session   - One bean per HTTP session
	 *
	 */

	public static void main(String[] args) {
		
		
		//Application Context is manage all the beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args); //press CRT+1 and assign application context to local variable
		
		BinarySearchImpl binarySearchVariable1 =  applicationContext.getBean(BinarySearchImpl.class); //getting the beans out from the application context and assign to variable
		BinarySearchImpl binarySearchVariable2 =  applicationContext.getBean(BinarySearchImpl.class); //getting the beans out from the application context and assign to variable
		
		System.out.println(binarySearchVariable1);
		System.out.println(binarySearchVariable2);
		
		
		
		
	}

}
