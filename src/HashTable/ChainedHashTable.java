package HashTable;

import java.util.LinkedList;

/*Homework 5: 
 * Hashing You will be implementing two kinds of Hash Tables, each as a Java class, in addition to testing them in a third class containing
 *  a main method.  All code should be written in Java using NetBeans, and based on zero-indexing of arrays.
 *  
	•	24 points: Implement a Java class named ChainedHashTable, based on a hash table with chaining using the multiplication method from 
	the slides/textbook. Your should use an array of LinkedList<Integer> objects as your primary instance variable / data ﬁeld.
	◦	The constructor should have a parameter for n, the total number of inputs expected. In the constructor, create the array of size m as
	 the ﬁrst power of 2 larger than n, full of constructed but empty linked lists at each index. 
	 
	 You may choose A directly, or use the integer
	  fraction method.
	  
	  
	  
	◦	There should also be public methods for insert, delete, and search as in the slides/textbook.
	◦	I also want a public printTable method, which runs a loop and prints each linked list in the hash table; consider using the LinkedList class
	 toString method.
	◦	You will need a private helper method named hash. Given an int key, it computes and returns an int index of the table.
	
	
	•	5 points extra credit: Use a Universal collection of hash functions instead of the multiplication method, for the ChainedHashTable class above. The the prime number p > m and the randomly constants a and b should be chosen in the constructor. Make sure your prime number selection is runtime-eﬃcient! If you need help with this math algorithm to ﬁnd the next prime number bigger than natural number m, I recommend going to the Math Lab in the 3rd ﬂoor of RRO.
	•	
	
	
	24 points: After your ChainedHashTable class is working, create another separate Java class called OpenAddressedHashTable in the same Java package,
	 based on a hash table with open addressing, using linear probing from the slides/textbook and an auxiliary hash function identical to your 
	ChainedHashTable's hash function. Your should use an array of Integer objects as your primary instance variable / data ﬁeld.
	◦	The constructor should have a parameter for n, the total number of inputs expected. In the constructor, create the array of size m as an array 
	of Integer of the same array length as the ChainedHashTable class's array.
	◦	There should also be public methods for insert, delete, and search as in the slides/textbook. To facilitate your delete method, you may want to
	 deﬁne a static ﬁnal int instance variable / class data ﬁeld named DELETED, whose value is Integer.MIN_VALUE.

	◦	I also want a public printTable method, which runs a loop and prints each Integer in the hash table. With Java's handy auto-unboxing feature, 
	this will be a very straight-forward printing loop.
	◦	You will need a private helper method with one parameter named hash, to implement the auxiliary hash function. This is logically the same math 
	function as the hash function in ChainedHashTable.
	◦	You will need another private helper method with two parameters named hash, to implement the primary hash function. Given a key and an "index" 
	into the probe sequence, it returns the appropriate element of the probe sequence, which is an index into the hash table's main array. It will do this 
	by invoking the one-parameter hash method.
	
	
	
	
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
Remember to comment your code! You should have a header comment with your name, date, class, assignment, and a brief description of what your code does. Every class method should have full comments above it describing the return type, name, parameters if any, and exactly what the method does.
 * */
public class ChainedHashTable {
	
	LinkedList<Integer>[] hashArray;
	int m;
	public ChainedHashTable(int n){

		m = n ==0 ? 0 : 32 - Integer.numberOfLeadingZeros(n- 1);
		m = (int)Math.pow(2, m);
		hashArray = new LinkedList[m];
		for(int i = 0; i < hashArray.length; i ++)
		{
			hashArray[i] = new LinkedList<Integer>();
		}
		
		
		
	}
	public void printTable()
	{
		System.out.println("----All things in list----");
		for(int i = 0; i < hashArray.length; i ++)
		{
			for (int item : hashArray[i]) {
			    System.out.println(item);
			}
		}
		
		
	}
	private int hash(int k)
	{
		double A = 0.618033988;
		int hash = (int)(m *  (k * A % 1)); 
		return hash;
		
	}
	public void insert(Integer x)
	{
		int hash = hash(x);
		LinkedList<Integer> list = hashArray[hash];
		if(list.contains(x))
			return;
		
		list.add(x);
		
	}
	public void delete(Integer x)
	{
		int hash = hash(x);
		LinkedList<Integer> list = hashArray[hash];
		int index = list.indexOf(x);
		if(index > -1) 
			list.remove(index);
	}
	public int search(Integer x)
	{
		int hash = hash(x);
		LinkedList<Integer> list = hashArray[hash];
		int index = list.indexOf(x);
		if(index == -1) 
			return 0;
		return list.get(index);
	}

}
