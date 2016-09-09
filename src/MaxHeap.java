//https://courses.csail.mit.edu/6.006/fall10/handouts/recitation10-8.pdf
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
    	i++;
    	if (2 * i <= heap.length)
    	{
    		return (2 * i) -1;
    	}	
    	else {
    		return -1;
    	}
    }
	  public int rightChildOf(int i )
	  {
		   i ++;
			if (2 * i  + 1 <= heap.length)
	    	{
	    		return 2 * i;
	    	}	
	    	else {
	    		return -1;
	    	}
		  
	  }
	  public void maxHeapify(int i){

		int leftindex = this.leftChildOf(i);
		int rightindex = this.rightChildOf(i);
		int largest =0;
		if(leftindex > -1 && leftindex < heapsize && heap[leftindex] > heap[i])
		{
			largest = leftindex;	
		}
		else
			largest = i;
		
		if(rightindex > -1 && rightindex < heapsize && heap[rightindex] > heap[largest])
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
}




