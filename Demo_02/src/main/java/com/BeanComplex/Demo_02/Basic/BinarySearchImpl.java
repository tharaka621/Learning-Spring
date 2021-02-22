package com.BeanComplex.Demo_02.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component // Tell Spring this is a Beans
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // or @Scope("prototype")  //get two different instance of a bean
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
