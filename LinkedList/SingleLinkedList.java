package LinkedList;

public class SingleLinkedList {
	
	//Function to print the list
	public static void printList(Node head) {
		Node list=head;
		while(list!=null) {
			System.out.print(list.data+" ");
			list=list.next;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		n1.next=n2;
		n2.next=n3;

		printList(n1);
	}
	
	

}

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
	}
}
