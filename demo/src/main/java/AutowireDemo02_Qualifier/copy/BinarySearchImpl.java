package AutowireDemo02_Qualifier.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * 1.Using the @primary
 * 2.Using instance name
 * 3.Using @qualifier  ********* 
 */

@Component 
public class BinarySearchImpl {

	@Autowired
	@Qualifier("bubble") //use the 'bubble' name to search as key
	private SortAlgotithm sortAlgorithm; 

	public int binarSearch(int[] numbers, int numberToSearch) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		// Search the array

		return 3;
	}

}
