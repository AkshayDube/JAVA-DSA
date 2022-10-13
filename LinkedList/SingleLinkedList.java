package LinkedList;

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
	}
}

public class SingleLinkedList {
	
	//Function to print the list
	public static void printList(Node head) {
		Node list=head;
		while(list!=null) {
			System.out.print(list.data+" ");
			list=list.next;
		}
		System.out.println(); //Just to add a new line
	}
	
	//Function to insert an element at beginning
	public static Node insertBegin(Node head,int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		return newNode;
	}

	//function to insert an element at Last
	public static Node insertLast(Node head,int data) {
		Node newNode=new Node(data);
		if(head==null)
			return newNode;
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=newNode;
		return head;
	}
	//function to delete the first element in the Linked List
	public static Node deleteHead(Node head) {
		if(head==null)
			return null;
		return head.next;
	}
	
	//function to delete the last element in the linked list
	public static Node deleteLast(Node head) {
		if(head==null) return null;
		if(head.next==null) return null;
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}

	//function to insert an element at the specified position
	public static Node insertAtPosition(Node head,int position,int data) {
		Node newNode=new Node(data);
		if(position==1) {
			newNode.next=head;
			return newNode;
		}
		Node temp=head;
		for(int i=0;(i<position-2)&&(temp!=null);i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	public static Node deleteAtPosition(Node head,int position) {
		if(position==1)
			return head.next;
		Node temp=head;
		for(int i=0;(i<position-2)&&(temp!=null);i++)
			temp=temp.next;
		if(temp==null || position<1)
			return head;
		temp.next=temp.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		Node head=insertBegin(null, 10);
		head=insertLast(head, 20);
		head=insertBegin(head, 30);
		head=insertLast(head, 40);
		head=insertBegin(head, 50);
		head=insertLast(head, 60);
		head=insertBegin(head, 70);
		head=insertLast(head, 80);
		head=insertBegin(head, 90);
		
		printList(head);
		
		head=deleteHead(head);
		head=deleteLast(head);
		
		printList(head);
		
		head=insertAtPosition(head, 1, 10);
		head=insertAtPosition(head, 2, 20);
		head=insertAtPosition(head, 3, 30);
		head=insertAtPosition(head, 7, 100);
		
		printList(head);
		
		head=deleteAtPosition(head,1);
		head=deleteAtPosition(head,2);
		
		printList(head);
	}
	
	

}


