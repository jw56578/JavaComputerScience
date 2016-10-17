package BST;
/*Homework 6: Binary Search Trees You will be implementing a binary search tree as a Java class (with no balancing mechanism), and implement the BST sort algorithm, 
 * in addition to testing it all in main.  All code should be written in Java using NetBeans.


	
	
	•	10 points extra credit: Augment your BSTNode and BinarySearchTree to support order statistic queries.
	 Your BST must otherwise be working correctly, in order to get any extra credit.
	◦	The BSTNode class will have a new data ﬁeld size, for the number of nodes in the node's subtree. 
	The BSTNode constructor should set the size to 0.
	◦	Insert and delete will need to be modiﬁed to recompute sizes as indicated in the slides/textbook. 
	For insert, you'll need to increment sizes of nodes on the path to the root (including the inserted node) 
by 1. The newly inserted node will end up with a subtree size of 1 after insertion, since it's a leaf.
	◦	Implement select and rank queries as in the slides/textbook. Keep in mind the pseudocode is not object oriented.
	•	
	
	
	
	18 points: Create another class in the same package, with a method named bstSort, and a main method for testing bstSort and the BinarySearchTree class.
	◦	The bstSort method should take an int array parameter, and print the elements of the array in sorted order by ﬁrst inserting all the elements into a 
	local BinarySearchTree, then performing an in-order traversal of the tree.
	
	
	◦	In main, test your BinarySearchTree class and your bstSort method, by doing at least the following:
	▪	Create a BinarySearchTree and insert at least 20 elements into it.
	▪	Do pre- in- and post-order traversals of the tree, and also print its size.
	▪	Print all elements of the tree by ﬁrst using minimum, then invoking successor size-1 times in a loop.
	▪	Print all elements of the tree by ﬁrst using maximum, then invoking predecessor size-1 times in a loop
	▪	Search for at least 5 keys in the tree and 5 keys not in the tree, and print all inputs and results to the console.
	▪	Delete a handful of elements from the tree, print its size again, then do another in-order traversal to print out the contents.
	
	▪	Finally, invoke bstSort on at least 5 diﬀerent arrays of diﬀerent lengths with diﬀerent values, and print the results to the console. 
	The results of bstSort should always print in sorted order.
	▪	If you did the extra credit, you should test the select and rank methods, by querying each of those at least 5 times with diﬀerent arguments, 
	and printing the results.
	
	
	
	
 * */
public class BSTTest {
	
	public void bstSort()
	{
		int[] stuff = {4,22,44,7,8,9,5434,2,245,7,8,511,222,33,253,42,2342,5,75,88,1,2,3,4,5,6,7,8};
		BinarySearchTree bst = new BinarySearchTree();
		for(int i = 0; i < stuff.length; i ++)
		{
			bst.insert(new BSTNode(stuff[i]));
		}
		//bst.inOrder(bst.root);
		//bst.preOrder(bst.root);
		//bst.postOrder(bst.root);
		System.out.println("Size: " + bst.size);
		
		BSTNode min = bst.minimum(bst.root);
		for(int i = 0; i < bst.size -1; i ++)
		{
			min = bst.successor(min);
			//System.out.println(min.key);
		}
		
		BSTNode max = bst.maximum(bst.root);
		for(int i = 0; i < bst.size -1; i ++)
		{
			max = bst.predecessor(max);
			//System.out.println(max.key);
		}
		
		BSTNode test1 = bst.search(bst.root,4);
		BSTNode test2 = bst.search(bst.root,22);
		BSTNode test3 = bst.search(bst.root,44);
		BSTNode test4 = bst.search(bst.root,245);
		BSTNode test5 = bst.search(bst.root,7);
		System.out.println(test1.key);
		System.out.println(test2.key);
		System.out.println(test3.key);
		System.out.println(test4.key);
		System.out.println(test5.key);
		

		System.out.println("Size: " + bst.size);
		bst.delete(test1);
		bst.delete(test2);
		bst.delete(test3);
		bst.delete(test4);
		bst.delete(test5);
		System.out.println("Size: " + bst.size);
		bst.inOrder(bst.root);
		
		
	/*
		test1 = bst.search(bst.root,10);
		test2 = bst.search(bst.root,11);
		test3 = bst.search(bst.root,12);
		test4 = bst.search(bst.root,13);
		test5 = bst.search(bst.root,14);
		System.out.println(test1.key);
		System.out.println(test2.key);
		System.out.println(test3.key);
		System.out.println(test4.key);
		System.out.println(test5.key);
		
		
		
		*/
		
	}

}
