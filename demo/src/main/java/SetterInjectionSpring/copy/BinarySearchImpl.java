package SetterInjectionSpring.copy;

import org.apache.logging.log4j.util.SortedArrayStringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * ************NOTE (RECOMENDATION)**********
 	Use Constructor injection for mandatory classes 
 	for optional classes use setter injection 
 	not necessary need to mention a setter method to set the injection 
 	
 	
 	**NOTE : No really difference in Setter or Constructor Injection.  So no need to have an either. 
 */

@Component //Tell Spring this is a Beans
public class BinarySearchImpl {
	
	@Autowired //Tell Spring this a dependency for 'BinarySearchImpl'
	private SortAlgotithm SortAlgotithmVaruable;

	//This is Setter Injection 
	public void setSortAlgotithmVaruable(SortAlgotithm sortAlgotithmVaruable) { //This is a setter
		this.SortAlgotithmVaruable = sortAlgotithmVaruable;
	}



	public int binarSearch(int[] numbers, int numberToSearch){
		
		/*
		 * ******* THIGHLY CUPPLE*******************************************
		BubbleSortAlgorithm bubbleSortAlgorithmVariable = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithmVariable.sort(numbers);
		*/
		
		int[] sortedNumbers = SortAlgotithmVaruable.sort(numbers);
		
		//Search the array
		
		return 3;
	}

}
