
package reva.careercup.solutions;
//Implement a code to check if a binary tree is a binary search tree
import reva.java.practice.TreeNode;

public class isBST {


	boolean isBST(TreeNode node,int min,int max)
	{

		if(node==null)
			return true;

		if(node.leftchild==null && node.rightchild==null)
			return true;

		else if((int)node.value>min&&(int)node.value<max)
			return(isBST(node.leftchild, min, (int)node.value)&&isBST(node.rightchild,(int)node.value,max));
		else 
			return false;

	}

}
