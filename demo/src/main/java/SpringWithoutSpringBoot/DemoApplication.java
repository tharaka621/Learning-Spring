package SpringWithoutSpringBoot;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 

@Configuration
@ComponentScan
public class DemoApplication {
	
	/*
	 * We Should tell to Spring
	 * 		1.What are the Beans?
	 * 		2.What are the dependencies of a bean?
	 * 		3.Where to search for beans? =>No need to do here since we are in the same package
	 */

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearchVariable = new BinarySearchImpl(new QuickSortAlgorithm()); //No need, Since Spring is doing this instead 
		
		//Application Context is manage all the beans
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(DemoApplication.class)){ //creating application context
		
		BinarySearchImpl binarySearchVariable =  applicationContext.getBean(BinarySearchImpl.class); //getting the beans out from the application context and assign to variable
		
		
		int result = binarySearchVariable.binarSearch(new int[] {1, 4, 23}, 3); //sending values
		
		System.out.println(result); 
		
		//applicationContext.close(); // close application context
		} //try- catch block auto close the application contest even there is an exception
	}

}
