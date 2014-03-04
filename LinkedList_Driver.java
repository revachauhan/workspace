package reva.java.practice;

public class LinkedList_Driver {
	
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		int i =1;
		while(i <5)
		{
			list.insert(i);
			i++;
		}
		
		list.print(list);
		list.delete(2);
		list.print(list);
		list.insert_in_front(12);
		list.print(list);
		System.out.println(list.find(4));
	}

}
