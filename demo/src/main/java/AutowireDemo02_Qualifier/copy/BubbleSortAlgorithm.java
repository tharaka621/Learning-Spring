package AutowireDemo02_Qualifier.copy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgotithm {

	public int[] sort(int[] numbers) {

		System.out.println("Bubble Sort Algorithm Running.........");

		// Logic for Bubble Sorts

		return numbers;
	}

}
