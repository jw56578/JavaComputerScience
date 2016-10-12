import Shapes.MyDrawing;
import Shapes.Shape;
import csci348.drawings.Drawing;



public class Program {

	public static void main(String[] args) {
		MyDrawing d = new MyDrawing(600,600);
		
	}
	public static void TestQuickSort()
	{	/*
		 * 12 points: In the main method, invoke both quicksort and randomizedQuicksort that you've implemented at least five times each 
		 * on different inputs, for testing purposes (these two methods are detailed below).  Alternatively, you may rig your main method
		 *  to take an array from the user via the Scanner class, then display the output to the console, all wrapped up in a loop that
		 *   continues until the user exits the program.  Write all the inputs and the results into the console. This is the testing portion
		 *    of the assignment.
		 *    
		 */  
		QuickSort sorter = new QuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		String asstring = java.util.Arrays.toString(input);
		System.out.println(asstring);
		
		int[] input2 = {24,2,45,20,56,75,2,56,99,53,12};
		QuickSortWithPartition sorter2 = new QuickSortWithPartition();
		
		
		sorter2.quickSort(input2, 0, input2.length - 1);
		asstring = java.util.Arrays.toString(input2);
		System.out.println(asstring);
		
		int[] input3 = {24,2,45,20,56,75,2,56,99,53,12};
		sorter2.quickSort(input3, 0, input3.length - 1);
		asstring = java.util.Arrays.toString(input3);
		System.out.println(asstring);
		
		int[] input4 = {24,2,45,20,56,75,2,56,99,53,12};
		sorter2.randomizedQuicksort(input4, 0, input4.length - 1);
		asstring = java.util.Arrays.toString(input4);
		System.out.println(asstring);
		
		
		int[] input5 = {88,44,33,22,11,48448,-3,-555,-22,24,2,45,20,56,75,2,56,99,53,12};
		sorter2.randomizedQuicksort(input5, 0, input5.length - 1);
		asstring = java.util.Arrays.toString(input5);
		System.out.println(asstring);
		
	}
	public static void TestMaxHeap(){
		MaxHeap mh = new MaxHeap(new int[]{3,55,34,54,24,5,100});
		//mh.buildheap();
		int child = mh.leftChildOf(0);
		child = mh.leftChildOf(1);
		child = mh.leftChildOf(2);
		child = mh.leftChildOf(3);
		child = mh.leftChildOf(4);
		child = mh.leftChildOf(6);
		
		mh.heapSort();
		
		mh = new MaxHeap(new int[]{3,55,34,54,24,5,100,66,66,66, 1,0 ,1000});
		mh.heapSort();
		
		mh.printMaxHeap();
		

	}

}
