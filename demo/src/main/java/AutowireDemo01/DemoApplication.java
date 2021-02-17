package AutowireDemo01;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext; 


@SpringBootApplication //3. tell spring Where to search for beans?
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
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args); //press CRT+1 and assign application context to local variable
		
		BinarySearchImpl binarySearchVariable =  applicationContext.getBean(BinarySearchImpl.class); //getting the beans out from the application context and assign to variable
		
		
		int result = binarySearchVariable.binarSearch(new int[] {1, 4, 23}, 3); //sending values
		
		System.out.println(result); 
		
		/*
		 *The Printed Result:   Quick Sort Algorithm Running......... 3
					
							Since we have label QuickSort Class as a Bean. Spring Runs the Quick Sort Class. 
		 */
		
	}

}
