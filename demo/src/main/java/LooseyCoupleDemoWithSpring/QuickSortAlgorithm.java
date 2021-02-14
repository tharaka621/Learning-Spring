package LooseyCoupleDemoWithSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //make primary. So this components run from two components
public class QuickSortAlgorithm implements SortAlgotithm{
	
	public int[] sort(int[] numbers){
		
		System.out.println("Quick Sort Algorithm Running.........");
		
		//Logic for Quick Sort
		
		return numbers;
	}

}
