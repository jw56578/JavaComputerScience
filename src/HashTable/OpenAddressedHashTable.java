package HashTable;

import java.util.LinkedList;

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
