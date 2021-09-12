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

	public static void main(String[] args)
	{
		/* Start with the empty list. */
		BinarySearchTree tree = new BinarySearchTree();

		// Insert the values
		tree.insert(56);
		tree.insert(70);
		tree.insert(30);
		// Print the LinkedList
		tree.inorder();
	}
}