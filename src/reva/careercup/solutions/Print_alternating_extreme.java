package reva.careercup.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Print_alternating_extreme {

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
		root.rightchild.leftchild.leftchild.rightchild = new TreeNode(9);
		getExtremeNodes(root);
	}

	public static void getExtremeNodes(TreeNode node)
	{
		if(node==null)
			return;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		boolean left = true;
		TreeNode elementoprint;
		while(!queue.isEmpty())
		{
			Queue<TreeNode> newlevel = new LinkedList<TreeNode>();
			elementoprint = queue.peek();
			while(!queue.isEmpty())
			{
				
				if(!left)
					elementoprint = queue.peek();
				
				TreeNode current = queue.poll();
				if(current.leftchild!=null)
					newlevel.add(current.leftchild);
				if(current.rightchild!=null)
					newlevel.add(current.rightchild);


			}
			System.out.println(elementoprint.data);
			queue = newlevel;
			left = !left;


		}

	}



}
