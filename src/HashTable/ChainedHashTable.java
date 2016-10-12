package HashTable;

import java.util.LinkedList;

/*
	•	Implement a Java class named ChainedHashTable, based on a hash table with chaining using the multiplication method from 
	the slides/textbook. Your should use an array of LinkedList<Integer> objects as your primary instance variable / data ﬁeld.
	◦	The constructor should have a parameter for n, the total number of inputs expected. In the constructor, create the array of size m as
	 the ﬁrst power of 2 larger than n, full of constructed but empty linked lists at each index. 
	 
	 You may choose A directly, or use the integer
	  fraction method.
	  
	  
	  
	◦	There should also be public methods for insert, delete, and search as in the slides/textbook.
	◦	I also want a public printTable method, which runs a loop and prints each linked list in the hash table; consider using the LinkedList class
	 toString method.
	◦	You will need a private helper method named hash. Given an int key, it computes and returns an int index of the table.
	
	
	•	5 points extra credit: Use a Universal collection of hash functions instead of the multiplication method, for the ChainedHashTable class above. 
	The the prime number p > m and the randomly constants a and b should be chosen in the constructor. Make sure your prime number selection is runtime-eﬃcient!
	 If you need help with this math algorithm to ﬁnd the next prime number bigger than natural number m, I recommend going to the Math Lab in the 3rd ﬂoor 
	 of RRO.
	•	
	

	
	
	
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
