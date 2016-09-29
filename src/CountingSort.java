/*Homework 4: RAM Sorting Algorithms and Randomized Quickselect

You will be implementing Counting Sort and Randomized Quickselect, in addition to testing them in main. You can also earn extra credit for implementing Radix Sort.  All code should be written in Java using NetBeans.  Each method should be a class method of the main method's class. Be aware of the indexing in the pseudocode you are basing your code on.

12 points: In the main method, invoke all the methods you've implemented (described below) at least five times each on different inputs, 
for testing purposes.  Write all the inputs and the results into the console. This is the "testing" portion of your code.

24 points: Define a method named countingSort. Implement Counting Sort as in the slides/textbook. One parameter will be the input array 
to sort. Another parameter will be a memory allocated array of the same length, for storing the output. The third parameter will be the 
largest single input value. You may write your code one-indexed or zero-indexed, but be aware the pseudocode one-indexes the input and
 output while zero-indexing the auxiliary array C.
 
 

Do not use the Java Standard Library or other libraries, except you may use:

console I/O
the Java String class
java.util.Arrays.toString
java.util.Arrays.copyOf
java.util.Arrays.copyOfRange
java.util.Random class
*/


public class CountingSort {

	public void countingSort(int[] toSort, int[] output, int largest)
	{
		
        int n = toSort.length;
 
        // The output character array that will have sorted arr
       // char output[] = new char[n];
 
        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[largest];
        for (int i=0; i<largest; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i=0; i<n; ++i)
            ++count[toSort[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i=1; i<largest; ++i)
            count[i] += count[i-1];
 
        // Build the output character array
        for (int i = 0; i<n; ++i)
        {
            output[count[toSort[i]]-1] = toSort[i];
            --count[toSort[i]];
        }
 
        // Copy the output array to arr, so that arr now
        // contains sorted characters
       // for (int i = 0; i<n; ++i)
        	//toSort[i] = output[i];
		    	
	}
}
