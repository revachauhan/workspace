package reva.java.practice;

public class BTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		BinarySearchTree b = new BinarySearchTree();
		//DLL d = new DLL();
		BT_2_DLL b1 = new BT_2_DLL();
		Mirror_binary_tree m = new Mirror_binary_tree();
	
	root.leftchild = new TreeNode(2);
	root.rightchild = new TreeNode(3);
	root.leftchild.leftchild = new TreeNode(4);
	root.leftchild.rightchild = new TreeNode(5);
	root.rightchild.rightchild = new TreeNode(6);
	root.rightchild.rightchild.leftchild = new TreeNode(9);
	root.rightchild.rightchild.rightchild = new TreeNode(10);
	root.leftchild.leftchild.leftchild = new TreeNode(7);
	root.leftchild.leftchild.rightchild = new TreeNode(8);
	
	
	//BinarySearchTree.print(root);
	//System.out.println();
	//b1.convert(root, 'l');
	//d.convert_2_DLL(root);
	//d.print();
	//m.convert(root);
	//b.print(root);
	//b1.print(root.leftchild);
	
	
	TreeNode head = null;
	LeafNode2DLLL l1 = new LeafNode2DLLL();
	l1.LBDLL(root, head);
	
	BinarySearchTree.print(root);
	l1.print();
	}
}
