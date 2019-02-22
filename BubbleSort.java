public class BubbleSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		
		int temp, n = a.length;
		boolean swapped;
		
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			
			for (int j = 1; j < n - i; i++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					swapped = true;
				}
				
			}
			
			if (!swapped) {
				break;
			}
		}
		
	}
}
