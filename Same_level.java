package reva.careercup.solutions;

import reva.java.practice.TreeNode;

//Check of all the leaves are at the same level in the tree
public class Same_level {

	static int maxdepth  = -1;
	public boolean _sameLevel(TreeNode node, int level)
	{
		if(node == null)
			return true;

		else if(node.leftchild==null &&node.rightchild==null)
		{	
			if(maxdepth<level)

				maxdepth = level;
			else 
				return (maxdepth==level);
		}


		else
		{

			return(_sameLevel(node.leftchild, level+1)&&_sameLevel(node.rightchild, level+1));

		}

		return true;


	}


}
