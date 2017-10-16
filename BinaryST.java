// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add additional methods and fields)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)


public class BinaryST
{
	private Node root;
	
	public BinaryST()
	{
		root = null;
	}
	
	public BinaryST(String[] s)
	{
		root = null;
		for(int x=0;x<s.length;x++) {
			if(root == null) {
				Node root = new Node(s[x]);
			} else {
				
			}
		}
	}
	
	private void placeNode(Node n, String d) {
		Node node  = new Node(d);
		if(n.data.compareTo(d) > 0) {
			if(n.left == null) {
				n.left = node;
				node.parent = n;
			} else {
				placeNode(n.left, d);
			}
		} else {
			if(n.right == null) {
				n.right = node;
				node.parent = n;
			} else {
				placeNode(n.right, d);
			}
		}
	}
	
	public int distinctSize()
	{
		// implementation
	}
	
	public int size()
	{
		// implementation
	}
	
	public int height()
	{
		// implementation
	}
	
	public void add(String s)
	{
		// implementation
	}
	
	public boolean search(String s)
	{
		// implementation
	}
	
	public int frequency(String s)
	{
		// implementation
	}
	
	public boolean remove(String s)
	{
		// implementation
	}
	
	public String[] inOrder()
	{
		// implementation
	}
	
	public String[] preOrder()
	{
		// implementation
	}
	
	public int rankOf(String s)
	{
		// implementation
	}
	
	class Node {
		
		String data;
		
		Node left;
		
		Node right;
		
		Node parent;
		
		public Node(String data) {
			this.data = data;
			parent = null;
			left = null;
			right = null;
		}
	}
	
}