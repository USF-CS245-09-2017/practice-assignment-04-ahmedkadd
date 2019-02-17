
public class SelectionSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		for (int i = 0; i < a.length; i++) {
			
			int index = i;
			int min = a[i];
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					index = j;
				}
			}
			
			a[index] = a[i];
			a[i] = min;		
		}
	}
}
