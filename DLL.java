package reva.java.practice;

public class DLL {

	DLL_Node head;
	DLL_Node tail;

	public DLL() {
		head = null;
		tail = null;

	}

	void print()

	{
		DLL_Node temp = head;

		while(temp!=null)
		{
			System.out.println(temp.value);
			temp =temp.next;
		}


	}

	public void convert_2_DLL(TreeNode node)
	{

		if(node!=null)

		{
			convert_2_DLL(node.leftchild);
			insert((int)node.value);
			convert_2_DLL(node.rightchild);

		}
	}
	public void insert(int value)
	{
		if(head ==null)
		{
			head = new DLL_Node(value);

			head.next = null;
			head.prev = null;
			tail = head;

		}

		else 
		{
			DLL_Node temp = new DLL_Node(value);
			tail.next = temp;
			temp.prev = tail;
			tail = temp;




		}



	}

}
