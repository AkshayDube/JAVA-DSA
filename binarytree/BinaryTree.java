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
	 
	
	public static void main(String[] args) {
		
		Node tree=createBinaryTree();
		System.out.print("InOrder Traversal : ");
		inOrderTraversal(tree);
		System.out.print("\nPreOrder Traversal : ");
		preOrderTraversal(tree);
		System.out.print("\nPostOrder Traversal : ");
		postOrderTraversal(tree);
		

	}

	
	
	

}
