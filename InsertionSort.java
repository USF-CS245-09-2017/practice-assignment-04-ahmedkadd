public class InsertionSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		for (int i = 1; i < a.length; i++) {
			int num = a[i];
			
			if (num < a[i - 1]) {
				int j = i - 1;
				
				while (j >= 0 && num < a[j]) {
					a[j + 1] = a[j];
					j--;
				}	
				
				a[j + 1] = num;
			}
		}
	}
}
