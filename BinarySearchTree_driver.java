package reva.java.practice;
import reva.careercup.solutions.*;

public class BinarySearchTree_driver {

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		Max_height_tree m = new Max_height_tree();
		Prune_util_sum test = new Prune_util_sum();
		ancestors a1 = new ancestors();
		
		
		TreeNode root1 = new TreeNode(10);
		int[] BST_values = {3,1,2,17,13,24};
		for(int i : BST_values)
		BST.insert(root1,i);
		//TreeNode root2 = new TreeNode(15);
		//BST.insert1(root2, 0);
		BST.print(BST.root);
		System.out.println();
		a1.print_com_ancestors(BST.root,2);
		//System.out.println(BST.root.righchild.leftchild.value);
		
		//BST.delete1(BST.root,17);
		
		//BST.print(BST.root);
		
		System.out.println();
		int result = m.height(BST.root);
		System.out.println(result);
		
		
		test.deleteNode(BST.root, 0, 45);
		BST.print(BST.root);
		
		
		

	}

}
