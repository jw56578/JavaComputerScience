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
		
		cht.printTable();
		
		int find1 = cht.search(1);
		System.out.println(find1);
		
		int find5 = cht.search(5);
		System.out.println(find5);
		
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
		
		int find1 = cht.search(1);
		System.out.println(find1);
		
		int find5 = cht.search(5);
		System.out.println(find5);
		
		cht.delete(3);
		cht.printTable();
	}

}
