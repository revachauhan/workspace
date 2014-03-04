package reva.java.practice;

public class BinarySearchTree {

	TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	BinarySearchTree(int value)
	{
		root = new TreeNode(value);
	}

public 	void insert(TreeNode node,int value)

	{
		if(root == null)
		{

			root = node;
			insert(root,value);
		}
		else
		{

			if((int)node.value>value)
			{

				if(node.leftchild==null)
					node.leftchild = new TreeNode(value);
				else

					insert(node.leftchild,value);

			}
			else
			{

				if(node.rightchild==null)
					node.rightchild = new TreeNode(value);
				else
					insert(node.rightchild,value);
			}


		}




	}

	public static  void print(TreeNode node)

	{
		if(node!=null)
		{
			print(node.leftchild);
			System.out.print(node.value+"->");
			print(node.rightchild);

		}	


	}

	/*public TreeNode delete(TreeNode node,int value)
	{
		if(node == null)
			return null;
		else if(node.value == value) 
		{
			if(node.leftchild==null && node.rightchild==null)
			{	

				return null;

			}
			else if(node.leftchild==null && node.rightchild!=null)
			{

				return node.rightchild;


			}

			else if(node.leftchild!=null && node.rightchild==null)
			{

				return node.leftchild;

			}

			else if(node.leftchild!=null && node.rightchild!=null)
			{
				TreeNode temp = node;
				temp = node.leftchild;
				while(temp.rightchild!=null)
					temp = temp.rightchild;


				node.value = temp.value;
				node.leftchild = delete(node.leftchild, temp.value); 


			}


		}
		else if(value<node.value)

		{
			delete(node.leftchild,value);
		}


		else{

			delete(node.rightchild,value);
		}

		return node;
	}		
	 */	

	void delete(TreeNode n,TreeNode parent,int val)
	{
		if(n == null)
			return;
		else if((int)n.value==val)
		{
			if(n.leftchild==null && n.rightchild ==null)
			{

				if((int)parent.leftchild.value==val)
					parent.leftchild = null;
				else
					parent.rightchild = null;
			}
			else if( n.rightchild ==null)
			{
				if((int)parent.leftchild.value==val)
					parent.leftchild = n.leftchild;
				else
					parent.rightchild = n.leftchild;

			}
			else if(n.leftchild ==null)
			{

				if((int)parent.leftchild.value==val)
					parent.leftchild = n.rightchild;
				else
					parent.rightchild = n.rightchild;

			}
			else
			{


				TreeNode temp = n;
				parent= n;
				n = n.leftchild;
				while(n.rightchild!=null)
				{	parent = n;
				n = n.rightchild;
				}
				temp.value = n.value;
				delete(n,parent,(int) n.value);



			}

		}

		else if ((int)n.value>val)
			delete(n.leftchild,n,val);
		else 
			delete(n.rightchild,n,val);

	}



	public TreeNode delete1(TreeNode node,int value)

	{
		if(node == null)
			return null;
		else if((int)node.value==value)
		{
			if(node.rightchild==null&&node.leftchild==null)
				return null;
			else if(node.leftchild==null)
				return node.rightchild;
			else if(node.rightchild==null)
				return node.leftchild;
			else
			{	TreeNode temp = node;
			temp = temp.leftchild;
			while(temp.rightchild!=null)
				temp = temp.rightchild;
			node.value = temp.value;
			node.leftchild = delete1(node.leftchild,(int)temp.value);
			}
		}
		else if(value<(int)node.value)
			node.leftchild = delete1(node.leftchild,value);
		else
			node.rightchild = delete1(node.rightchild, value);
		return node;

	}
	
	
}







