package designpatterns.adapter;

import java.util.Comparator;
import java.util.List;

public class NumberSorter {

	public List<Integer> sort(List<Integer> numbers){
		
		numbers.sort(Comparator.naturalOrder());
		
		return numbers;
	}
	
}
