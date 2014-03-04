package reva.geeksforgeeks.solution;

import reva.java.practice.TreeNode;

public class Deepest_Left_LeafNode {
	static TreeNode result = null;
	static int flevel = Integer.MIN_VALUE;



	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.leftchild = new TreeNode(2);
		root.rightchild = new TreeNode(3);
		root.leftchild.leftchild = new TreeNode(4);
		root.leftchild.rightchild = new TreeNode(5);
		root.rightchild.leftchild = new TreeNode(6);
		root.rightchild.rightchild = new TreeNode(7);
		root.rightchild.leftchild.leftchild = new TreeNode(8);
		root.rightchild.leftchild.rightchild = new TreeNode(10);
		root.rightchild.rightchild.rightchild = new TreeNode(9);
		root.rightchild.leftchild.rightchild.leftchild = new TreeNode(11);
		System.out.println(utilLeftLeafNode(root,0).value);


	}


	public static TreeNode utilLeftLeafNode(TreeNode node, int level)
	{

		if(node == null)
			return null;

		if(node.leftchild!=null&&level>flevel)
		{
			result = node.leftchild;
			flevel = level;
		}

		utilLeftLeafNode(node.leftchild, level+1);
		utilLeftLeafNode(node.rightchild, level+1);

		return result;
	}






}

