package reva.java.practice;
//Converts only leaf node to doubly linked list and reamining tree remains as it is 
import reva.java.practice.TreeNode;

public class LeafNode2DLLL {
	TreeNode head;


	public TreeNode LBDLL(TreeNode node, TreeNode head1)
	{
			head = head1;

		if(node == null)
			return null;

		if(node.leftchild==null && node.rightchild==null)
		{
			TreeNode temp ;
			temp = new TreeNode(node.value) ;
			if(head1 == null)
			{
				head = temp;
				
			}
			else
			{
				temp.rightchild = head1;
				head1.leftchild = temp;
				head = temp;
			}

			return null;

		}
		else
		{
			node.rightchild = LBDLL(node.rightchild, head);
			node.leftchild = LBDLL(node.leftchild, head);

		}

		return node;

	}
	public void print()
	{
		System.out.println();
		TreeNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value + " ");
			temp = temp.rightchild;
			
		}
			
	}
	
}
