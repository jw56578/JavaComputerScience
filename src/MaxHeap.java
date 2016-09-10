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
		//find the largest of the children and replace the parent with that larger child
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
		//if neither child was the larger then don't do anything
		if(largest != i)
		{
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;
			//we need to run this again because you have now moved the parent down to the child and you need to check
			//whether any of the sub nodes are larger than the parent you just moved down into child position
			//this is basically going down the entire subtree from one child 
			maxHeapify(largest);
		}
		    
	  }
	  public void buildMaxHeap()
	  {
		  //this calculation logically starts at a place in the middle that will cover the entire heap, no need to start at the end and waste time
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
			  /*we know that the largest number is at the very beginning of the heap, that is what maxheapify does
			   *  so because we are sorting ascending we can automatically
			  * put that largest number at the end of the heap which means that is now in its proper sort position
			  *
			  */
			int temp = heap[i];
			heap[i] = heap[0]; //putting largest number at end of heap
			heap[0] = temp; //putting the last child node at the top of the heap because it has to go somewhere, you can't make the heap bigger
			heapsize --; //if you don't reduce the heap size then the largest number will get placed back at the top of the heap which we don't want
			//if you didn't to heapsize-- then basically nothing would happen because the largest number would keep going back up on the top
			maxHeapify(0); // re order the heap to put the next largest number back at the top. so this process can begin again
		  }
		  

	  }
	  public void printMaxHeap()
	  {
		  String asstring = java.util.Arrays.toString(heap);
		  System.out.println(asstring);
	  }
}




