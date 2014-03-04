
package reva.careercup.solutions;
import reva.java.practice.*;

public class tester {

	public static void main(String[] args) {
		
		
		isBST a = new isBST();
		Max_sum m = new Max_sum();
		BST_greater_sum s = new BST_greater_sum();
		Left_view_BT  b1 = new Left_view_BT();
		
		TreeNode root = new TreeNode(10);
		root.leftchild = new TreeNode(12);
		root.rightchild = new TreeNode(15);
		root.leftchild.leftchild = new TreeNode(25);
		root.leftchild.rightchild = new TreeNode(30);
		root.rightchild.leftchild = new TreeNode(36);
		boolean result1 = a.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(result1);
		
		
		 result1 = a.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(result1);
		System.out.println();
		
		System.out.println(m.findMaxSum(root));
		System.out.println();
		s.modify_tree(root, 0);
		BinarySearchTree.print(root);
		
		System.out.println();
		b1.print_left_view(root, 0);
	}

}
