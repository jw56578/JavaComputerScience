import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MaxHeapTests {
	MaxHeap mh = null;
	public  MaxHeapTests()
	{
		mh = new MaxHeap(new int[]{3,55,34,54,24,5,100});

	}

	@Test
	public void CanGetParent() {
		int parent = mh.parentOf(0);
		assertTrue(-1== parent);
		parent = mh.parentOf(5);
		assertTrue( 2 == parent);
		parent = mh.parentOf(6);
		assertTrue( 2 == parent);
		parent = mh.parentOf(4);
		assertTrue( 1 == parent);
	}
	public void CanGetLeftChild() {
		int child = mh.leftChildOf(0);
		assertTrue(1== child);
		
	}
}
