package BST;
/*	•	30 points: Implement another Java class named BinarySearchTree, based on a binary search tree from the slides / textbook. 
	Your primary data ﬁeld will be a BSTNode named root, to represent the root of the tree. 
	It will also contain a data ﬁeld named size to record the number of elements stored in the tree. Insert should increment size, and delete should decrement size.
	◦	Implement a zero-parameter constructor to set the root to NULL, and size to 0.
		 In addition to the pseudocode, insert should also increment the size data ﬁeld, and delete should decrement the size data ﬁeld.
	
	◦	Implement all dynamic set operations as described in the slides/ textbook: search, minimum, maximum, successor, predecessor, insert, and delete.

	◦	You will need a private helper method named transplant, as in the slides/textbook.
	◦	Implement traversal methods named preOrder, inOrder, and postOrder based on the three kinds of traversals discussed in the slides/textbook.
	 "Visiting" a node means printing to standard output the key followed by 1 blank space.
	◦	Implement a getter method for size.
	
	*/
public class BinarySearchTree {
	BSTNode root;
	int size = 0;
	
	public BinarySearchTree()
	{
		root = null;
		size=0;
	}
	public void preOrder(BSTNode node)
	{
		System.out.println(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	public void inOrder(BSTNode node)
	{
		inOrder(node.left);
		System.out.println(node.key + " ");
		inOrder(node.right);
	}
	public void postOrder(BSTNode node)
	{
		preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.key + " ");
	}
	public void insert(BSTNode z)
	{
		BSTNode y = null;
		BSTNode x = root;
		
		while(x != null)
		{
			y = x;
			if(z.key < x.key)
			{
				x = x.left;
			}else{
				x = x.right;
			}
		}
		z.p = y;
		if(y == null)
			this.root = z;
		else if(z.key < y.key)
		{
			y.left = z;
		}
		else
		{
			y.right= z;
		}
		
		size ++;
	}
	public void delete(BSTNode z)
	{
		if(z.left == null)
			transplant(z,z.right);
		else if ( z.right == null)
			transplant(z,z.left);
		else
		{
			BSTNode y = minimum(z.right);
			if(y.p != z)
			{
				transplant(y, y.right);
				y.right = z.right;
				y.right.p = y;
			}
			transplant(z, y);
			y.left = z.left;
			y.left.p = y;
		}
		size --;
	}
	public BSTNode predecessor(BSTNode x)
	{
		if(x.left != null)
			return maximum(x.left);
		while(x.p != null && x == x.p.left)
			x = x.p;
		return x.p;
	}
	public BSTNode successor(BSTNode x)
	{
		if(x.right != null)
			return minimum(x.right);
		while(x.p != null && x == x.p.right)
			x = x.p;
		return x.p;
	}
	public BSTNode search(int k)
	{
		return search(root,k);
	}
	public BSTNode maximum(BSTNode node)
	{
		while(node.right != null)
		{
			node = node.right;
		}
		return node;
	}
	public BSTNode minimum(BSTNode node)
	{
		while(node.left != null)
		{
			node = node.left;
		}
		return node;
	}
	public BSTNode search(BSTNode node,int k)
	{
		if(node == null)
			return null;
		if(k == node.key)
			return root;
		if(k < node.key)
			return search(node.left,k);
		else
			return search(node.right,k);
	}

	private void transplant(BSTNode u, BSTNode v)
	{
		if(u.p == null)
			this.root = v;
		else if(u == u.p.left)
		{
			u.p.left = v;
		}
		else
			u.p.right = v;
		if(v != null)
			v.p = u.p;
		
	}
}
