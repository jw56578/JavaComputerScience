import java.util.List;
import java.util.ArrayList;

/*
 * 10 points extra credit: Define a method named radixSort, implementing a base-10 Radix Sort as in the slides/textbook. This will only be a
 few lines of code to define the radixSort method, but you will also need to create some private helper methods:
A private helper method named getDigit to obtain and return the value of a single given base-10 digit's value from a given int value. For
 example, getDigit(1, 493) would return the value of the "1's place" in 493, which is the number 3. You can make that helper method a purely
  math function, or instead make it with String methods.
A private helper method named countingSortOnDigit, which is a modified version of countingSort with an additional parameter indicating which
 base-10 digit is to be used for comparisons. (1 for rightmost digit, 2 for second digit from the right, etc.) Make sure your countingSort
  works properly before you make this new version.  The only difference will be the line(s) of code that directly compare two elements,
   which will invoke digitOf and use that single digit value, instead of comparing one entire input value with another.
   
   
 */
public class RadixSort {
	  static int getMax(int arr[], int n)
	    {
	        int mx = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > mx)
	                mx = arr[i];
	        return mx;
	    }
	 
	    // A function to do counting sort of arr[] according to
	    // the digit represented by exp.
	    static void countSort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; // output array
	        int i;
	        int count[] = new int[10];
	        java.util.Arrays.fill(count,0);
	 
	        // Store count of occurrences in count[]
	        for (i = 0; i < n; i++)
	            count[ (arr[i]/exp)%10 ]++;
	 
	        // Change count[i] so that count[i] now contains
	        // actual position of this digit in output[]
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	 
	        // Build the output array
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	        }
	 
	        // Copy the output array to arr[], so that arr[] now
	        // contains sorted numbers according to curent digit
	        for (i = 0; i < n; i++)
	            arr[i] = output[i];
	    }
	    //this is the most common implementation found when searching on you tube for an explanation
	    //yet the most common code example was that of the other radixsort method, stupid CS.
	    public void radixsort2(int[] input) {
	    	  final int RADIX = 10;
	    	  // declare and initialize bucket[]
	    	  List<Integer>[] bucket = new ArrayList[RADIX];
	    	  for (int i = 0; i < bucket.length; i++) {
	    	    bucket[i] = new ArrayList<Integer>();
	    	  }
	    	 
	    	  // sort
	    	  boolean maxLength = false;
	    	  int tmp = -1, placement = 1;
	    	  while (!maxLength) {
	    	    maxLength = true;
	    	    // split input between lists
	    	    //this is a for each loop,i is the the value in each array index
	    	    for (Integer i : input) {
	    	      tmp = i / placement;
	    	      bucket[tmp % RADIX].add(i);
	    	      if (maxLength && tmp > 0) {
	    	        maxLength = false;
	    	      }
	    	    }
	    	    // empty lists into input array
	    	    int a = 0;
	    	    for (int b = 0; b < RADIX; b++) {
	    	      for (Integer i : bucket[b]) {
	    	        input[a++] = i;
	    	      }
	    	      bucket[b].clear();
	    	    }
	    	    // move to next digit
	    	    placement *= RADIX;
	    	  }
	    	}
	    // The main function to that sorts arr[] of size n using
	    // Radix Sort
	    static void radixsort(int arr[], int n)
	    {
	        // Find the maximum number to know number of digits
	    	//if you didn't do this then you would not know where to start looking for the digit position
	    	//1,10,100,1000,10000,100000... ? you would have to start at a huge number to make sure
	        int m = getMax(arr, n);
	 
	        // Do counting sort for every digit. Note that instead
	        // of passing digit number, exp is passed. exp is 10^i
	        // where i is current digit number
	        
	        //the logic of this is to take each number in the array, mod it by something and then divide that result by the next lowest digit position
	        //so it would basically do this 
	        /* mod = number % 10
	         * indexinarray =  mod /1 
	         * put the thing into that index of the array
	         * repeat for each thing in array
	         * 
	         * 
	         * mod = number %100
	         * indexinarray = mod / 10
	         * put the thing into that index of the array
	         * repeat for each thing in array
	         * 
	         * 
	         * mod = number %1000
	         * indexinarray = mod / 100
	         * put the thing into that index of the array
	         * repeat for each thing in array
	         * */
	        
	        //so when this starts, it will send in exp =1, but where is it doing a mod 10
	        for (int exp = 1; m/exp > 0; exp *= 10)
	            countSort(arr, n, exp);
	    }
	 
}
