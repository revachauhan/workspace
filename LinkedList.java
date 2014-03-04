package reva.java.practice;

public class LinkedList {

	Node head;


	public LinkedList() {

		head = null;

	}


	void insert(int value){

		if(head == null)
		{
			head = new Node(value);
			
		}
		else 
		{
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;

			temp.next = new Node(value);


		}

	}

	Node insert_in_front(int value)
	{
		Node temp = new Node(value);
		temp.next = head;
		head = temp;
		return head;


	}


	void print(LinkedList list)
	{
		Node temp = list.head;
		System.out.println("I AM HERE");
		while(temp!= null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
		
	}

	
	boolean find(int value)
	{
		Node temp = head;
		
		while (temp!=null)
		{
			if(temp.value==value)
				return true;
			temp = temp.next;
		}
		
		
		return false;
				
		
	}

	void delete(int value)
	{
		if(head.value== value)
		{
			head = head.next; 

		}
		else 
		{
			Node temp = head;
			while(temp!=null)
			{
				if(temp.value==value)
					temp.next = temp.next.next;
				temp = temp.next;

			}


		}		
	}

}
