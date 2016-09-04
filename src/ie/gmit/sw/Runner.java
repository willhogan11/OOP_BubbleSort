package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
		Array array = new Array();
		array.setArr(new int[]{5,8,1,9,3,10,12,52,7});
		
		Sortable sort = new SortableImpl();
		sort.sort(array.getArr());
		
		System.out.println("The Sorted Array");
		sort.display(array.getArr());
	}
}