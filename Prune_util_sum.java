package reva.careercup.solutions;

import reva.java.practice.BinarySearchTree;
import reva.java.practice.TreeNode;
public class Prune_util_sum {
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.leftchild = new TreeNode(12);
		root.rightchild = new TreeNode(15);
		root.leftchild.leftchild = new TreeNode(25);
		root.leftchild.rightchild = new TreeNode(30);
		root.rightchild.leftchild = new TreeNode(36);
		
		deleteNode(root, 0, 60);
		BinarySearchTree.print(root);
		
		
	}


	public static TreeNode deleteNode(TreeNode node,int sum,int k)
	{
		if(node == null)
			return null;
		sum = sum + (int)node.value;
		if(sum>k)
		{
			return node;
		}
		else 
		{
			node.leftchild = deleteNode(node.leftchild, sum, k);
			node.rightchild =deleteNode(node.rightchild, sum, k);
			
			if(node.leftchild==null&&node.rightchild==null)
				return null;
			
			
		}

		return node;

	}

}
