package LooselyCoupleDemo;

/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

*/

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		/*
		 * 'BinarySearchImpl' Depend on the 'SortAlgorithim'
		 * So, 'SortAlgorithm' is Dependency for 'BinarySearchImpl'
		 * 
		 */
		
		
		//Since 'loosely couple' we can change the requirement by simply given the algorithm name. In this case 'QuickSortAlgorithm'
		BinarySearchImpl binarySearchVariable = new BinarySearchImpl(new QuickSortAlgorithm()); //creating instance 
		int result = binarySearchVariable.binarSearch(new int[] {1, 4, 23}, 3); //sending values
		System.out.println(result);
		
		//SpringApplication.run(DemoApplication.class, args);
	}

}
