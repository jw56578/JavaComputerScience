/*

12 points: Implement a recursive method named quicksort. Implement quicksort as in the slides/textbook, using the rightmost element of the
 subarray as the pivot (the "naive" pivot choice). One parameter will be an array to sort. Two more parameters will be the start and end 
 index of the subarray in which to sort. It is up to you whether the upper bound is inclusive or exclusive, but comment which you chose to 
 do -- the pseudocode uses an inclusive upper bound. This method will have no return value, and its only effect will be to rearrange the
  given array's values into sorted order.
  
  

 
12 points: Once you get your partition and quicksort methods working correctly, create a recursive method called randomizedQuicksort as 
in the slides/textbook, which is extremely similar to quicksort above. Its parameters, return value, and purpose are the same as
 the above quicksort method.  The only difference is the choice of pivot.  First, swap a randomly selected element in the subarray 
 with the rightmost element of the subarray, then proceed as above to use the rightmost element as the pivot, by invoking partition
  and recursing. You may use the the java.util.Random class as a random number generator.
  
  */
public class QuickSortWithPartition {
	java.util.Random rand;
	public QuickSortWithPartition()
	{
		rand = new java.util.Random();
		//int num = rand.nextInt(arraylength);
		
		
	}

	void swap(int[] items, int firstIndex, int secondIndex){
	    int temp = items[firstIndex];
	    items[firstIndex] = items[secondIndex];
	    items[secondIndex] = temp;
	}
	int partition(int[] items, int left, int right, int pivot) {

		int
	        i       = left,
	        j       = right;

		//keep going until the pointers pass each other
	    while (i <= j) {
	    	//this is the left pointer moving right until it finds a value that is greater than or equal to the pivot value
	        while (items[i] < pivot) {
	            i++; //this now holds the index of what is greater than or equal to the pivot
	        }
	        //this is the right pointer moving left until it finds a value that is less than or equal to the pivot value
	        while (items[j] > pivot) {
	            j--;
	        }
	        //hmm, why does left have to be less than j
	        if (i <= j) {
	            swap(items, i, j);
	            i++;
	            j--;
	        }
	    }
	  //i now represents the index in which every thing to the left of it should be sorted already
	    //so this value should just be used as the starting left point for the next recursion
	    //because the indexes to the right are not necessarily sorted at this poing
	    return i; 
	}
	
	void randomizedQuicksort(int[] items, int left, int right) {

	    int index;
	    
	    if (items.length > 1) {
	    	int pivot = items[left + rand.nextInt(right - left)];
	        index = partition(items, left, right,pivot);

	        if (left < index - 1) {
	        	randomizedQuicksort(items, left, index - 1);
	        }

	        if (index < right) {
	        	randomizedQuicksort(items, index, right);
	        }

	    }

	}
	void quickSort(int[] items, int left, int right) {

	    int index;
	    
	    if (items.length > 1) {
	    	//the pivot is the value in whatever position you choose, not the index
	    	//its normal to choose the middle, still not sure why you would choose anything other than the middle
	    	//this is using right most as a "naive" implementation, i have no idea why you have to subtract 1
	    	int pivot   = items[right- 1];//  items[((right + left) / 2)];
	        index = partition(items, left, right,pivot);
	        //at this point, everything from index over to the right is now sorted in that it is larger than the used pivot value
	        //and everything to the left of the index is smaller than the used pivot value
	        
	        //now we are going to sort everything on the left side of that index point recursively
	        if (left < index - 1) {
	            quickSort(items, left, index - 1);
	        }
	        //now we are going to sort everything on the right sode of that index recursively
	        if (index < right) {
	            quickSort(items, index, right);
	        }

	    }

	}
}
