package reva.geeksforgeeks.solution;

import java.util.LinkedList;
import java.util.Queue;

import reva.java.practice.TreeNode;

/*
 * 
 * Find next right node of a given key
Given a Binary tree and a key in the binary tree, find the node right to the given key. 
If there is no node on right side, then return NULL.
 Expected time complexity is O(n) where n is the number of nodes in the given binary tree.

For example, consider the following Binary Tree. Output for 2 is 6, output for 4 is 5. Output for 10, 6 and 5 is NULL.

                 10
               /    \
 	      	  2      6
            /   \     \ 
       	   8     4     5

 * 
 */
public class NextRightNode 
{

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.leftchild = new TreeNode(2);
		root.rightchild = new TreeNode(6);
		root.leftchild.leftchild = new TreeNode(8);
		root.leftchild.rightchild = new TreeNode(4);
		root.rightchild.rightchild = new TreeNode(5);

		TreeNode result = printNextRightNode(root, 5);
		if(result!=null)
			System.out.println(result.value);
		else 
			System.out.println(result);


	}

	public static TreeNode printNextRightNode(TreeNode node,int target)
	{

		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> subqueue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{	

			TreeNode temp = queue.poll();
			if((int)temp.value==target)
			{
				if(queue.peek()!=null)
					return queue.peek();
				else 
					return null;
			}
			else
			{
				if(temp.leftchild!=null)
					subqueue.add(temp.leftchild);

				if(temp.rightchild!=null)
					subqueue.add(temp.rightchild);
			}
			if(queue.isEmpty())
			{
				queue = subqueue;
				subqueue = new LinkedList<>();
			}

		}

		return null;


	}
}
