package plugins.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Eedanna K
 * 
 */
public class FindDuplicateInList {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// sample data
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3);

		final Iterator<Integer> iterator = ((Iterable<Integer>) numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1)
				.collect(Collectors.toSet())).iterator();

		while (iterator.hasNext()) 
		{
			System.out.print("Duplicate values --> "+iterator.next());
		}
	}

}
