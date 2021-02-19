package AutowireDemo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * 1.Using the @primary
 * 2.Using instance name ********* 
 * 3.Using @qualifier  
 */



@Component // Tell Spring this is a Beans
public class BinarySearchImpl {

	@Autowired
	private SortAlgotithm bubbleSortAlgorithm; /*
												 * calling the implement by the class name. When you have two 'components' classes
												
												 * Can use when No '@primary'
												 */

	public int binarSearch(int[] numbers, int numberToSearch) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

		// Search the array

		return 3;
	}

}
