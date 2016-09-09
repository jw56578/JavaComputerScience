//https://courses.csail.mit.edu/6.006/fall10/handouts/recitation10-8.pdf
//https://begeeben.wordpress.com/2012/08/21/heap-sort-in-c/
public class MaxHeap {

	int[] heap;
	int heapsize;
	
	public MaxHeap(int[] arry){
		heap = new int[arry.length];
		for(int i = 0; i < arry.length; i ++)
		{
			heap[i] = arry[i];
		}
		heapsize = arry.length;
	}
	
    public int parentOf(int childIndex)
    {
    	return (childIndex + 1) / 2 - 1;  

    }
    public int leftChildOf(int i)
    {
    	return (i + 1) * 2 -1;
    }
	  public int rightChildOf(int i )
	  {
		  return (i + 1) * 2;
		  
	  }
	  public void maxHeapify(int i){

		int leftindex = this.leftChildOf(i);
		int rightindex = this.rightChildOf(i);
		int largest =0;
		if(leftindex < heapsize && heap[leftindex] > heap[i])
		{
			largest = leftindex;	
		}
		else
			largest = i;
		
		if(rightindex < heapsize && heap[rightindex] > heap[largest])
		{
			largest = rightindex;
		}
		if(largest != i)
		{
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			maxHeapify(largest);
		}
		    
	  }
	  public void buildMaxHeap()
	  {

		  for(int i = heap.length/2 ; i >=0 ; i --)
		  {
			  this.maxHeapify(i);
		  }

	  }
	  public void heapSort()
	  {
		  heapsize = heap.length;
		  buildMaxHeap();
		  for(int i = heap.length-1; i >0; i --)
		  {
			int temp = heap[i];
			heap[i] = heap[0];
			heap[0] = temp;
			heapsize --;
			maxHeapify(0);
		  }
		  

	  }
	  public void printMaxHeap()
	  {
		  String asstring = java.util.Arrays.toString(heap);
		  System.out.println(asstring);
	  }
}




