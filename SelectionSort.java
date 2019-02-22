
public class SelectionSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		for (int i = 0; i < a.length - 1; i++) {
	
			int min_index = i;
			
			/** for loop searches through the list for the smallest number **/
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			int min_temp = a[min_index];
			a[min_index] = a[i];
			a[i] = min_temp;		
		}
	}
}
