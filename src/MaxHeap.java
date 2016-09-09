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
	
    public void buildheap()  
    {  
    	int[] data = heap;
    	//you have to start at the end of the heap and work up so the length -1 represents the end, which will be the last child node
        int currentNodeIndex = data.length - 1;  
        while (currentNodeIndex >= 0)  
        {  
        	//whatever node you are looking at, you need to find its parent so that you can compare and swap
        	//this is the formula for getting the parent index of any other index
            int parentIndex = (currentNodeIndex + 1) / 2 - 1;  
            //j is now the index of the parent
            
            
            int parentValue = data[parentIndex];  
            int nodeValue = data[currentNodeIndex];
            //v is now the value of the parent 
            if (parentValue < (nodeValue)  || parentValue == (nodeValue))  
            {  
            	  data[currentNodeIndex] = data[parentIndex];  
                  data[parentIndex] = nodeValue;  
    
            }  
  
          currentNodeIndex--;
        }  
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
			if (2 * i  + 1 <= heap.length)
	    	{
	    		return 2 * i + 1;
	    	}	
	    	else {
	    		return -1;
	    	}
		  
	  }
	  public void maxHeapify(int i){

		int leftindex = this.leftChildOf(i);
		int rightindex = this.rightChildOf(i);
		int largest =0;
		if(leftindex <= heapsize && heap[leftindex] > heap[i])
		{
			largest = leftindex;	
		}
		else
			largest = i;
		
		if(rightindex <= heapsize && heap[rightindex] < heap[largest])
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

		  for(int i = heap.length/2 ; i >=1 ; i --)
		  {
			  this.maxHeapify(i);
		  }

	  }
	  public void heapSort()
	  {

	  }
}




