package reva.java.practice;

public class Mirror_binary_tree {

	public TreeNode convert(TreeNode node)
	{
		if(node==null)
			return null;
		else{
			if(node.leftchild==null&&node.rightchild==null)
				return node;
			else 

			{	node.leftchild = convert(node.leftchild);
				node.rightchild = convert(node.rightchild);
				if(node.rightchild!=null||node.leftchild!=null)
				{
					TreeNode temp = node.leftchild;
					node.leftchild = node.rightchild;
					node.rightchild = temp;
				}
			}
		}

		return node;

	}

}
