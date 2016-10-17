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
	▪	Print all elements of the tree by ﬁrst using maximum, then invoking predecessor size-1 times in a loop.
	▪	Search for at least 5 keys in the tree and 5 keys not in the tree, and print all inputs and results to the console.
	▪	Delete a handful of elements from the tree, print its size again, then do another in-order traversal to print out the contents.
	▪	Finally, invoke bstSort on at least 5 diﬀerent arrays of diﬀerent lengths with diﬀerent values, and print the results to the console. 
	The results of bstSort should always print in sorted order.
	▪	If you did the extra credit, you should test the select and rank methods, by querying each of those at least 5 times with diﬀerent arguments, 
	and printing the results.
	
	
	
	
You must implement your methods and classes described above from scratch, except you may use console I/O from the Java Standard Library.
You may use the pseudocode in the textbook and the course webpage. 
Remember to comment your code! You should have a header comment with your name, date, class, assignment, and a brief description of what your code does. 
Every class method should have full comments above it describing the return type, name, parameters if any, and exactly what the method does.
 * */
public class BSTTest {

}
