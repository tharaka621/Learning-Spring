package SpringWithoutSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgotithm {

	public int[] sort(int[] numbers) {

		System.out.println("Quick Sort Algorithm Running.........");

		// Logic for Quick Sort

		return numbers;
	}

}
