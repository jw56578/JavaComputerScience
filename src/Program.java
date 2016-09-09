import csci348.drawings.Drawing;

public class Program {

	public static void main(String[] args) {
		
		MaxHeap mh = new MaxHeap(new int[]{3,55,34,54,24,5,100});
		//mh.buildheap();
		int child = mh.leftChildOf(0);
		child = mh.leftChildOf(1);
		child = mh.leftChildOf(2);
		child = mh.leftChildOf(3);
		child = mh.leftChildOf(4);
		child = mh.leftChildOf(6);
		
		mh.heapSort();
		

	}

}
