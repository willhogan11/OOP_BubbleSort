package ie.gmit.sw;


public class SortableImpl implements Sortable {
	
	// Populate Array with random numbers and return the array itself
	public int[] initialise() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*20 + 1);
		}
		return arr;
	}
	
	// Manual Bubble sort, Very poor as has a Space Time complexity of O(n2)
	public void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length-i); j++) {
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// When called, Displays the sorted array on screen
	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}