package designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter{

	@Override
	public int[] sort(int[] numbers) {
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (int j = 0; j < numbers.length; j++) {
			numberList.add(numbers[j]);
			
		}
		
		NumberSorter numberSorter = new NumberSorter();
		
		numberList = numberSorter.sort(numberList);		
		
		return numberList.stream().mapToInt(i -> i).toArray();
	}

}
