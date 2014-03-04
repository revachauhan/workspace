package reva.careercup.solutions;

import reva.java.practice.TreeNode;
//All greater values to the node and change its value
public class BST_greater_sum {
	int max_sum;

	public BST_greater_sum() {
		max_sum =0;// 
	}
	TreeNode modify_tree(TreeNode node,int sum){


		if(node == null)
			return null;
		else
		{	

			modify_tree(node.rightchild, max_sum);		

			max_sum = max_sum + (int)node.value;

			node.value = max_sum;
			modify_tree(node.leftchild, max_sum);


		}	

		return node;
	}

}
