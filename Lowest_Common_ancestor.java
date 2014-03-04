package reva.java.practice;
//This code returns node when a lowest common ancestor is said to be found
public class Lowest_Common_ancestor {

	TreeNode  print_common_ancestors(int n1, int n2,TreeNode node)
	{
		if(node == null)
			return null;
		else{
			if((int)node.value>n1&&(int)node.value>n2)
				return print_common_ancestors(n1, n2, node.leftchild);
			
			if((int)node.value<n1&&(int)node.value<n2)
				return print_common_ancestors(n1, n2, node.rightchild);
			
			return node;
			
		}
		

	}

}
