package LooselyCoupleDemo;

import org.apache.logging.log4j.util.SortedArrayStringMap;

//THIS IS A DUMMY CLASS ***************

public class BinarySearchImpl {
	
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
