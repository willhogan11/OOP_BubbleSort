package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
		Array array = new Array(); // Create a new Array class object 
		Sortable sort = new SortableImpl(); // Using Polymorphism, create a new SortableImpl object from the Sortable interface
		
		array.setArr(sort.initialise()); // Send the newly initialised sort object as a parameter to the setArray mutator method in the Array class 
		sort.sort(array.getArr()); // Get the Values using the getArray mutator method
		
		System.out.println("The Sorted Array"); // Display Text
		sort.display(array.getArr()); // Using the sort object, display the results on screen
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// Working on Removing Duplicates from the array (Testing this Stackoverflow Snippet first)
		/*int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		boolean found = false;

		for (int j = 0; j < input.length; j++) {
			if (current == input[j] && !found) {
		        found = true;
		    } else if (current != input[j]) {
		        System.out.print(current + "\n");
		        current = input[j];
		        found = false;
		    }
		}
		System.out.print(current);*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}