package binarytree;

import java.util.Scanner;

class Node{
	int data;
	Node leftChild;
	Node rightChild;
	
	public Node(int data) {
		this.data=data;
	}

}


public class BinaryTree {

	static Scanner sc=new Scanner(System.in);
	 
//Method to Create A Binary Tree
	 static Node createBinaryTree() {
			System.out.println("Enter the data of Node");
			int data=sc.nextInt();
			Node node=new Node(data);
			
			System.out.println("Want Left child for Node "+node.data+ " : Y/N ");
			char response=sc.next().charAt(0);
			if(response=='Y' || response =='y') {
				node.leftChild=createBinaryTree();
			}
			else node.leftChild=null;
			
			System.out.println("Want Right child for Node "+node.data+ " : Y/N ");
			response=sc.next().charAt(0);
			if(response=='Y' || response =='y') {
				node.rightChild=createBinaryTree();
			}
			else node.rightChild=null;
			
			return node;
		}
	
	 //Method for InorderTraversal Of Binary Tree(LNR) (Left,Node,Right)
	 static void inOrderTraversal(Node node) {
			if(node==null) return;
			
			inOrderTraversal(node.leftChild);
			System.out.print(node.data+" ");
			inOrderTraversal(node.rightChild);
		}
	 
	//Method for PreorderTraversal Of Binary Tree(NLR) (Node,Left,Right)
		 static void preOrderTraversal(Node node) {
				if(node==null) return;
				
				System.out.print(node.data+" ");
				preOrderTraversal(node.leftChild);
				preOrderTraversal(node.rightChild);
			}
		 
	//Method for PostorderTraversal Of Binary Tree(LRN) (Left,Right,Node)
	 static void postOrderTraversal(Node node) {
			if(node==null) return;
			
			postOrderTraversal(node.leftChild);
			postOrderTraversal(node.rightChild);
			System.out.print(node.data+" ");
		}
	 
	
	 //Method to find the height of Binary Tree
	 static int heightBinaryTree(Node tree) {
		 if(tree==null) return 0;
		 
		 int leftHeight=heightBinaryTree(tree.leftChild);
		 int rightHeight=heightBinaryTree(tree.rightChild);
		 
		 return Math.max(leftHeight, rightHeight)+1;
	 }
	 
	 //Method to find the total number of nodes in the Binary Tree
	 static int sizeOfBinaryTree(Node tree) {
		 if(tree==null) return 0;
		 int leftSize=sizeOfBinaryTree(tree.leftChild);
		 int rightSize=sizeOfBinaryTree(tree.rightChild);
		 
		 return (leftSize+rightSize)+1;
	 }
	 
	 //Method to return the max element in Tree
	 static int maxElementInBinaryTree(Node tree) {
		 if(tree==null) return Integer.MIN_VALUE;
		  
		 return Math.max(tree.data, Math.max(maxElementInBinaryTree(tree.leftChild), maxElementInBinaryTree(tree.rightChild)));
	 }
	 
	 //Method to return the min element in Tree
	 static int minElementInBinaryTree(Node tree) {
		 if(tree==null) return Integer.MAX_VALUE;
		  
		 return Math.min(tree.data, Math.min(minElementInBinaryTree(tree.leftChild), minElementInBinaryTree(tree.rightChild)));
	 }
	 
	 
	public static void main(String[] args) {
		
		Node tree=createBinaryTree();
		System.out.print("InOrder Traversal : ");
		inOrderTraversal(tree);
		System.out.print("\nPreOrder Traversal : ");
		preOrderTraversal(tree);
		System.out.print("\nPostOrder Traversal : ");
		postOrderTraversal(tree);
		System.out.println("\nHeight of Binary Tree : "+heightBinaryTree(tree));
		System.out.println("Total Nodes present in Binary Tree : "+sizeOfBinaryTree(tree));
		System.out.println("Max Element in tree : "+maxElementInBinaryTree(tree));
		System.out.println("Min Element in tree : "+minElementInBinaryTree(tree));
		

	}

	
	
	

}
