package reva.careercup.solutions;

import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree. Write a function that takes only root node as arguement and 
returns (sum of values at odd height)-(sum of values at even height).*/
public class Odd_Even_Sum {

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
		System.out.println(utilFuction(root));

	}


	public static int utilFuction(TreeNode root)
	{

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		boolean flag = true;
		int sum =0;

		while(!queue.isEmpty())
		{
			Queue<TreeNode> temp_queue = new LinkedList<TreeNode>();
			
			while(!queue.isEmpty())
			{
				TreeNode current = queue.poll();
				if(flag)
					sum =sum + current.data;
				else
					sum = sum - current.data;
				if(current.leftchild!=null)
					temp_queue.add(current.leftchild);
				if(current.rightchild!=null)
					temp_queue.add(current.rightchild);

			}

			queue = temp_queue;
			temp_queue = new LinkedList<TreeNode>();
			flag = !flag;


		}

		return sum;

	}

}


/*
package reva.careercup.solutions;

import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree. Write a function that takes only root node as arguement and 
returns (sum of values at odd height)-(sum of values at even height).
public class Odd_Even_Sum {

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
		System.out.println(utilFuction(root));

	}


	public static int utilFuction(TreeNode root)
	{

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode current ;
		boolean flag = true;
		int sum =0;
		Queue<TreeNode> temp_queue = new LinkedList<TreeNode>();
		while(!queue.isEmpty())
		{

			current = queue.poll();
			if(flag)
				sum =sum + current.data;
			else
				sum = sum - current.data;
			if(current.leftchild!=null)
				temp_queue.add(current.leftchild);
			if(current.rightchild!=null)
				temp_queue.add(current.rightchild);

			if(queue.isEmpty())
			{
				queue = temp_queue;
				temp_queue = new LinkedList<TreeNode>();
				flag = !flag;
			}

		}
		
		return sum;

	}

}

*/