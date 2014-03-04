package reva.java.practice;
//Convert a binary tree to a doubly linked list 
public class BT_2_DLL {


	public TreeNode convert(TreeNode node)
	{
		if(node== null)
			return null;


		if(node.leftchild==null && node.rightchild== null)
			return node;

		else
		{	
			TreeNode temp = null;

			temp  = convert(node.leftchild);
			if(temp!=null)
			{
				while(temp.rightchild!=null)
					temp= temp.rightchild;
				temp.rightchild = node;
				node.leftchild = temp;
			}
			temp = convert(node.rightchild);
			if(temp!=null)
			{
				while(temp.leftchild!=null)
					temp = temp.leftchild;
				temp.leftchild = node;
				node.rightchild = temp;
			}
		}
		return node;

	}


	void print(TreeNode node)
	{
		while(node.leftchild!=null)
			node = node.leftchild;

		while(node!=null)
		{	System.out.println(node.value);
		node = node.rightchild;
		}
	}

}
