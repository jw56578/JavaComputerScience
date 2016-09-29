import static org.junit.Assert.*;

import org.junit.Test;

public class RandomizedQuickSelectTests {

	@Test
	public void testKSmallest() {
		int[] array1 = {8,6,5,4,3,2,1};
		int[] sorted = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8};
				
		RandomizedQuickSelect r = new RandomizedQuickSelect();
		
		//int shouldbe3 = r.randomizedQuickselect(array1, 1, array1.length, 3);
		
		
		int arr[] = {12, 3, 5, 7, 4, 19, 26};
	    int shouldbe5 = r.kthSmallest(arr, 0, arr.length-1, 3);
	    assertEquals(shouldbe5, 5);
	    int shouldbe7 = r.kthSmallest(arr, 0, arr.length-1, 4);
	    assertEquals(shouldbe7, 7);
	    int shouldbe12 =r.kthSmallest(arr, 0, arr.length-1, 5);
	    assertEquals(shouldbe12, 12);
	    
	    
	    shouldbe5 = r.randomizedQuickselect(arr, 0, arr.length-1, 3);
	    assertEquals(shouldbe5, 5);
	    shouldbe7 = r.randomizedQuickselect(arr, 0, arr.length-1, 4);
	    assertEquals(shouldbe7, 7);
	    shouldbe12 =r.randomizedQuickselect(arr, 0, arr.length-1, 5);
	    assertEquals(shouldbe12, 12);
	    
	}
	@Test
	public void testRadixSort() {
		int arr[] = {12, 3, 5, 7, 4, 19, 26};
		int shouldbesorted[] = {3,4,5,7,12,19,26};
		RadixSort rs = new RadixSort();
		rs.radixsort(arr, arr.length);
		assertArrayEquals(arr, shouldbesorted);
	}
	@Test
	public void testRadixSort2() {
		int arr[] = {1200,100,10,1, 3, 5, 7, 4, 19, 26};
		int shouldbesorted[] = {1,3,4,5,7,10,19,26,100,1200};
		RadixSort rs = new RadixSort();
		rs.radixsort2(arr);
		assertArrayEquals(arr, shouldbesorted);
	}
}
