package reva.careercup.solutions;

import reva.java.practice.TreeNode;

public class Max_sum{
	int sum_left;
	int sum_right;

	public Max_sum() {
		sum_left =0;
		sum_right= 0;
	}


	int findMaxSum(TreeNode node)
	{

		if(node == null)
			return 0;

		else
		{
			sum_left = (int)node.value + findMaxSum(node.leftchild);
			sum_right =(int)node.value+ findMaxSum(node.rightchild);
			return Math.max(sum_left,sum_right);

		}


	}
}