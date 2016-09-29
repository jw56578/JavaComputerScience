/*
 * 24 points: Define a method named randomizedQuickselect. Implement Randomized Quickselect as in the slides/textbook. One parameter is 
the input array.  
Two more parameters are the inclusive bounds of the subarray to consider. One more parameter is i, the order statistic 
number to find the value of in the input array. This method must be nondestructive, meaning it does not reorder or modify the original input
 array! So, you will want to make a local copy of the input array using java.util.Arrays.copyOf, then use the local copy for everything.
  You will also need to reuse the same partition method from homework 4, which you used for quicksort.  If your partition method is not 
  working properly, I strongly recommend you debug it and get it working correctly before moving on to the rest of this assignment.
  
  

   
   
   RANDOMIZED-QUICKSELECT(A, p, r, i) // p to r inclusive. Order statistic i

1. if p == r // base case is length-1 subarray

2. return A[p]

3. z = RANDOM-INT(p, r) //random pivot choice like randomized quicksort

4. swap A[z] with A[r]

5. q = PARTITION(A, p, r) // the same PARTITION used in quicksort

6. k = q - p + 1 // calculate the order statistic k of the pivot

7. if i == k // check if pivot is the ith order statistic, our answer!

8. return A[q]

9. elseif i < k // we’re looking for an earlier order statistic

10. return RANDOMIZED-QUICKSELECT(A, p, q-1, i)

11. else return RANDOMIZED-QUICKSELECT(A, q+1, r, i-k)
 */
public class RandomizedQuickSelect {

	java.util.Random rand;
	public RandomizedQuickSelect()
	{
		rand = new java.util.Random();
		//int num = rand.nextInt(arraylength);
		
		
	}
	void swap(int[] items, int firstIndex, int secondIndex){
	    int temp = items[firstIndex];
	    items[firstIndex] = items[secondIndex];
	    items[secondIndex] = temp;
	}
	public int randomizedQuickselect(int[] array,int p, int r, int i)
	{
		array = java.util.Arrays.copyOf(array, array.length);
		
		if(p == r)
			return array[p];
		
		int randomNum = rand.nextInt((r - p) + 1) + p;

		swap(array,randomNum, r);

		int q = partition(array, p, r);
		int k = q - p + 1; // calculate the order statistic k of the pivot
		if(i == k)
			return array[q];
		else if(i < k)
			return randomizedQuickselect(array, p, q-1, i);
		else
			return randomizedQuickselect(array, q+1, r, i-k);
		
		//int[] copy = java.util.Arrays.copyOf(array, 0);
	}

	// This function returns k'th smallest element in arr[l..r] using
	// QuickSort based method.  ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
	int kthSmallest(int arr[], int l, int r, int k)
	{
	    // If k is smaller than number of elements in array
	    if (k > 0 && k <= r - l + 1)
	    {
	        // Partition the array around last element and get
	        // position of pivot element in sorted array
	        int pos = partition(arr, l, r);
	 
	        // If position is same as k
	        if (pos-l == k-1)
	            return arr[pos];
	        if (pos-l > k-1)  // If position is more, recur for left subarray
	            return kthSmallest(arr, l, pos-1, k);
	 
	        // Else recur for right subarray
	        return kthSmallest(arr, pos+1, r, k-pos+l-1);
	    }
	 
	    // If k is more than number of elements in array
	    return Integer.MAX_VALUE;
	}
	 

	 
	// Standard partition process of QuickSort().  It considers the last
	// element as pivot and moves all smaller element to left of it
	// and greater elements to right
	int partition(int arr[], int l, int r)
	{
	    int x = arr[r], i = l;
	    for (int j = l; j <= r - 1; j++)
	    {
	        if (arr[j] <= x)
	        {
	            swap(arr,i, j);
	            i++;
	        }
	    }
	    swap(arr,i, r);
	    return i;
	}
	 
	
}
