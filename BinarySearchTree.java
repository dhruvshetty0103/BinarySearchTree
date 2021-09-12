package com.hashtable.sentencefrequency;
/* Linked list Node
 * Constructor to create a new node
 * Next is by default initialized as null
 */
class Node 
{
	int data;
	Node leftNode;
	Node rightNode;
	public Node(int item)
	{
		data = item;
		leftNode = rightNode = null;
	}
}
public class BinarySearchTree<K> 
{
	Node root; // root of list
	BinarySearchTree()
	{
		root = null;
	}
	void insert(int key)
	{
		root = insert(root, key);
	}
	Node insert(Node root, int key)
	{

		/* If the tree is empty,
	           return a new node */
		if (root == null)
		{
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.data)
			root.leftNode = insert(root.leftNode, key);
		else if (key > root.data)
			root.rightNode = insert(root.rightNode, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// Method to print the LinkedList.
	void inorder()
	{
		inorderRec(root);
	}

	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.leftNode);
			System.out.println(root.data);
			inorderRec(root.rightNode);
		}
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(Node current) {
		return current == null ? 0
				: 1 + this.getSizeRecursive(current.leftNode) + this.getSizeRecursive(current.rightNode);
	}

	public static void main(String[] args)
	{
		/* Start with the empty list. */
		BinarySearchTree tree = new BinarySearchTree();

		// Insert the values
		tree.insert(56);
		tree.insert(70);
		tree.insert(30);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);
		System.out.println("Binary search tree size:" + tree.getSize());
		// Print the LinkedList
		tree.inorder();
	}
}