package HashTable;

import java.util.LinkedList;

/*
 * 	
	24 points:  OpenAddressedHashTable in the same Java package,
	 based on a hash table with open addressing, using linear probing from the slides/textbook and an auxiliary hash function identical to your 
	ChainedHashTable's hash function. Your should use an array of Integer objects as your primary instance variable / data ﬁeld.
	◦	The constructor should have a parameter for n, the total number of inputs expected. 
	
	WTF
	In the constructor, create the array of size m as an array of Integer of the same array length as the ChainedHashTable class's array.
	
	
	◦	There should also be public methods for insert, delete, and search as in the slides/textbook. To facilitate your delete method, you may want to
	 deﬁne a static ﬁnal int instance variable / class data ﬁeld named DELETED, whose value is Integer.MIN_VALUE.

	◦	I also want a public printTable method, which runs a loop and prints each Integer in the hash table. With Java's handy auto-unboxing feature, 
	this will be a very straight-forward printing loop.
	◦	You will need a private helper method with one parameter named hash, to implement the auxiliary hash function. This is logically the same math 
	function as the hash function in ChainedHashTable.
	◦	You will need another private helper method with two parameters named hash, to implement the primary hash function. Given a key and an "index" 
	into the probe sequence, it returns the appropriate element of the probe sequence, which is an index into the hash table's main array. It will do this 
	by invoking the one-parameter hash method.
	
 * */
public class OpenAddressedHashTable {

	Integer[] hashArray;
	int m;
	final int DELETED = Integer.MIN_VALUE;
	
	public OpenAddressedHashTable(int n){

		m = n ==0 ? 0 : 32 - Integer.numberOfLeadingZeros(n- 1);
		m = (int)Math.pow(2, m);
		hashArray = new Integer[m];
		for(int i = 0; i < hashArray.length; i ++)
		{
			
		}
	}
	private int hash(int k, int i)
	{
		int hash = hash(k) + i % m;
		return hash;
	}
	private int hash(int k)
	{
		double A = 0.618033988;
		int hash = (int)(m *  (k * A % 1)); 
		return hash;
		
	}
	public int insert(int k) throws Exception
	{
		for(int i = 0; i < hashArray.length; i ++)
		{
			int j = hash(k, i);
			if(hashArray[j] == null || hashArray[j] == DELETED )
			{     
				hashArray[j] = k;      
				return j;
			}
		}
		throw new Exception("hash table overflow");
	}
	public int delete(int k) throws Exception
	{
		for(int i = 0; i < hashArray.length; i ++)
		{
			int j = hash(k, i);
			if(hashArray[j] == k)
			{     
				hashArray[j] = DELETED;
				return j;
			}
		}
		throw new Exception("element not found");
	}
	public int search(int k)
	{
		for(int i = 0; i < hashArray.length; i ++)
		{
			int j = hash(k, i);
			if(hashArray[j] == null)
			{     
				return -1;
			}
			if(hashArray[j] == k)
			{     
				return hashArray[j];
			}
		}
		return -1;
	}
	public void printTable()
	{
		System.out.println("----All things in open address hashtable----");
		for(int i = 0; i < hashArray.length; i ++)
		{
			System.out.println(hashArray[i]);
		}

	}
}
