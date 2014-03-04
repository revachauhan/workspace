package reva.java.practice;

public class ancestors {
	
	/*boolean print_com_ancestors(TreeNode node,int target){
		if(node == null)
			return false;
		if(node.value==target)
		{
		
		return true;
		}
		else
		{
			
			if( print_com_ancestors(node.leftchild,target)||print_com_ancestors(node.rightchild,target))
			{	
				System.out.println(node.value);
				return true;
			}	
			
		}
		return false;
		
	}

	*/
	public TreeNode print_com_ancestors(TreeNode node,int target)
	{
		if(node==null)
			return null;
		if((int)node.value == target)
			return node;
		
		else if((int)node.value<target )
		{
			if(node.rightchild==print_com_ancestors(node.rightchild, target))
				System.out.println(node.value);
		}
		else if((int)node.value>target)
		{
			if(node.leftchild==print_com_ancestors(node.leftchild, target));
			System.out.println(node.value);
		}
		
		return node;
	}
	
}
