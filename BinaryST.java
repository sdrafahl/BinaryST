// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add additional methods and fields)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)


public class BinaryST
{
	private Node root;
	
	private int unique;
	
	private int size;
	
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
				int result = placeNode(root, s[x]);
				switch(result) {
					case 0 :
						this.size++;
					break;
					
					case 1: 
						this.unique++;
						this.size++;
					break;
				}
			}
		}
	}
	
	private int placeNode(Node n, String d) {
		Node node  = new Node(d);
		if(n.data.compareTo(d) == 0) {
			n.quantity++;
			return 0;
		}
		if(n.data.compareTo(d) > 0) {
			if(n.left == null) {
				n.left = node;
				node.parent = n;
				updateHeight(node.parent, 1);
				return 1;
			} else {
				return placeNode(n.left, d);
			}
		} else {
			if(n.right == null) {
				n.right = node;
				node.parent = n;
				updateHeight(node.parent, 1);
				return 1;
			} else {
				return placeNode(n.right, d);
			}
		}
	}
	
	private void updateHeight(Node n, int height) {
		if(n.height < height) {
			n.height = height;
		}
		if(n.parent == null) {
			return;
		}
		updateHeight(n.parent, height + 1);
	}
	
	public int distinctSize()
	{
		return this.unique;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public int height()
	{
		if(this.root == null) {
			return 0;
		} else {
			return this.root.height + 1;
		}
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
		
		int quantity;
		
		int height;
		
		Node left;
		
		Node right;
		
		Node parent;
		
		public Node(String data) {
			this.data = data;
			this.quantity = 1;
			parent = null;
			left = null;
			right = null;
			this.height = 0;
		}
	}
	
}