import static org.junit.Assert.*;

import org.junit.Test;
//https://www.youtube.com/watch?v=I8XXfgF9GSc
public class TestSimpleString {

	@Test
	public void testCountSortWorks() {
		int[] array1 = {6,4,3,1,3,4,5,6,7,8,2,2,3,4};
		int[] sorted = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8};
				
		CountingSort cs = new CountingSort();
		int[] output = new int[array1.length];
		cs.countingSort(array1, output, 9);
		assertArrayEquals(output, sorted);
		
		
	}

}
