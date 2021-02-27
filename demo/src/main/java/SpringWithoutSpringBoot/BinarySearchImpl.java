package SpringWithoutSpringBoot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private Logger Logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("bubble") //use the 'bubble' name to search as key
	private SortAlgotithm sortAlgorithm; 

	public int binarSearch(int[] numbers, int numberToSearch) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		// Search the array
		return 3;
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("Welcome");
		Logger.info("Post Construct");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("Good Day");
		Logger.info("pre Destroy");
	}

}
