import static org.junit.Assert.*;

import org.junit.Test;

import HashTable.ChainedHashTable;
import HashTable.OpenAddressedHashTable;

public class HashTableTests {

	/*
	 * •	12 points: Create a third class in the same Java package, with a main method for testing. In main, test your two hash table classes by doing at 
	least the following:
	◦	Create a ChainedHashTable object and ﬁll it with at least n = 20 inserted elements. Print out the hash table, remove a handful of its elements, 
	then print out the hash table again. Then search for at least 5 keys in the table and 5 keys not in the table, printing out the results of the search 
	each time.
	
	
		◦	Create a OpenAddressedHashTable object and ﬁll it with at least n = 20 inserted elements. Be sure not to put more elements into the table, because 
	an open addressed table is full after m insertions. Print out the hash table, remove a handful of its elements, then print out the hash table again. 
	Then search for at least 5 keys in the table and 5 keys not in the table, printing out the results of the search each time.
You must implement your methods and classes described above from scratch, except you may use the following parts of the Java Standard Library:
	•	console I/O
	•	java.lang.String class
	•	java.lang.Integer class
	•	java.util.LinkedList<E> class
	•	java.util.Random class.
	•	java.util.Arrays.toString, java.util.Arrays.copyOf, java.util.Arrays.copyOfRange




	 * */
	@Test
	public void testChainedHashTable() {
		ChainedHashTable cht = new ChainedHashTable(20);
		
		
		String test1 = "hello";
		String test2 = "hello world";
		String test3 = "hello 3";
		String test4 = "hello world 4";
		
		cht.insert(1);
		cht.insert(2);
		cht.insert(3);
		cht.insert(4);
		cht.insert(5);
		cht.insert(6);
		cht.insert(7);
		cht.insert(8);
		cht.insert(9);
		cht.insert(10);
		cht.insert(11);
		cht.insert(12);
		cht.insert(13);
		cht.insert(14);
		cht.insert(15);
		cht.insert(16);
		
		cht.printTable();
		
		System.out.println("finding stuff in Chained hashtable");
		int find = cht.search(1);
		System.out.println("should be 1: "  + find);
		find = cht.search(4);
		System.out.println("should be 4: "  + find);
		find = cht.search(5);
		System.out.println("should be 5: "  + find);
		find = cht.search(11);
		System.out.println("should be 11: "  + find);
		find = cht.search(16);
		System.out.println("should be 16: "  + find);
		
		System.out.println("finding stuff not in Chained hashtable, should be -1");
		find = cht.search(0);
		System.out.println( find);
		find = cht.search(17);
		System.out.println(find);
		find = cht.search(18);
		System.out.println(find);
		find = cht.search(19);
		System.out.println(find);
		find = cht.search(20);
		System.out.println(find);
		
	
		
		cht.delete(3);
		cht.printTable();
		
	}
	@Test
	public void testOpenAddressedHashTable() throws Exception {
		OpenAddressedHashTable cht = new OpenAddressedHashTable(20);
		
		
		
		String test1 = "hello";
		String test2 = "hello world";
		String test3 = "hello 3";
		String test4 = "hello world 4";
		
		cht.insert(1);
		cht.insert(2);
		cht.insert(3);
		cht.insert(4);
		cht.insert(5);
		cht.insert(6);
		cht.insert(7);
		cht.insert(8);
		cht.insert(9);
		cht.insert(10);
		cht.insert(11);
		cht.insert(12);
		cht.insert(13);
		cht.insert(14);
		cht.insert(15);
		cht.insert(16);
		
		
		cht.printTable();
		
		System.out.println("finding stuff in open addressed hashtable");
		int find = cht.search(1);
		System.out.println("should be 1: "  + find);
		find = cht.search(4);
		System.out.println("should be 4: "  + find);
		find = cht.search(5);
		System.out.println("should be 5: "  + find);
		find = cht.search(11);
		System.out.println("should be 11: "  + find);
		find = cht.search(16);
		System.out.println("should be 16: "  + find);
		
		System.out.println("finding stuff not in open addressed, should be -1");
		find = cht.search(0);
		System.out.println( find);
		find = cht.search(17);
		System.out.println(find);
		find = cht.search(18);
		System.out.println(find);
		find = cht.search(19);
		System.out.println(find);
		find = cht.search(20);
		System.out.println(find);
		
		cht.delete(3);
		cht.delete(19);
		cht.printTable();
	}

}
