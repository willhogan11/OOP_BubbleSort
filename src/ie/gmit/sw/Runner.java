package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
	/*	Array array = new Array();
		
		Sortable sort = new SortableImpl();
		array.setArr(sort.initialise());
		sort.sort(array.getArr());
		
		System.out.println("The Sorted Array");
		sort.display(array.getArr());*/
		
		// Working on Removing Duplicates from the array (Testing this Stackoverflow Snippet first)
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
		
	}
}