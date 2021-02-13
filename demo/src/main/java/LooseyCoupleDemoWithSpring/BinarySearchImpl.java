package LooseyCoupleDemoWithSpring;

import org.apache.logging.log4j.util.SortedArrayStringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//THIS IS A DUMMY CLASS ***************

@Component //Tell Spring this is a Beans
public class BinarySearchImpl {
	
	@Autowired //Tell Spring this a dependency for 'BinarySearchImpl'
	private SortAlgotithm SortAlgotithmVaruable;

	public BinarySearchImpl(SortAlgotithm sortAlgotithmVaruable) {
		super();
		SortAlgotithmVaruable = sortAlgotithmVaruable;
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
