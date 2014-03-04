package reva.careercup.solutions;

import reva.java.practice.TreeNode;

public class Left_view_BT {
	int max_level;

	Left_view_BT(){
		max_level = -1;

	}

	void print_left_view(TreeNode node,int level){
		if(node==null)
			return;

		else{
			if(level> max_level)
			{
				max_level = level;
				System.out.print(node.value+"->");
			}

			print_left_view(node.leftchild,level+1);
			print_left_view(node.rightchild,level+1);

		}


	}

}
