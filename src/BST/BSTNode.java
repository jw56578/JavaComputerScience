package BST;

/*
 * 12 points: Implement a Java class named BSTNode, to represent one node of a binary search tree from the slides/textbook. 
 * The private data ﬁelds should be p, left, and right which are handles to other BSTNodes, as well as an int data ﬁeld named key.
 * 
	◦	Implement a constructor method with a key parameter. It will set p left and right to NULL, and key to the constructor parameter.
	◦	Implement getter methods for key p left and right, to return the relevant data ﬁeld.
	◦	Implement setter methods for p left and right, to set the relevant data ﬁeld to the parameter; copy the handle.

 * */
public class BSTNode {
	public BSTNode p;
	public BSTNode right;
	public BSTNode left;
	public int key;
	
	public BSTNode(int key)
	{
		p  = null;
		right = null;
		left = null;
		this.key = key;
	}

}
