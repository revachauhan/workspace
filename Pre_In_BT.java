package reva.geeksforgeeks.solution;

import reva.java.practice.TreeNode;

public class Pre_In_BT {

	public static void main(String[] args) {
		int []preorder = {7,10,4,3,1,2,8,11};
		int []inorder  = {4,10,3,1,7,11,8,2};

		TreeNode root = null;
		TreeNode result_root = constructBinaryTree(preorder, inorder, 0, inorder.length-1,0,preorder.length-1);
		util_print(result_root);

	}

	public static TreeNode constructBinaryTree(int [] pre, int [] in, int startI, int endI,int startP, int endP)
	{
		if(startI>endI || startP>endP )
		{
			return null;
		}
		if(startI==endI) return new TreeNode(in[startI]);
		if(startP==endP) return new TreeNode(pre[startP]);
		TreeNode node = new TreeNode<>(pre[startP]);
		int offset = search(in,(int)node.value);
		if(offset==-1)
			return null;

		{
			node.leftchild = constructBinaryTree(pre, in, startI, offset-1,startP+1,offset-startI+startP);
			node.rightchild = constructBinaryTree(pre, in, offset+1,endI,offset-startI+startP+1,endP);
		}


		return node;


	}


private static void util_print(TreeNode node) {
	if(node==null)
		return;
	else{
		System.out.print(node.value +"->");
		util_print(node.leftchild);
		util_print(node.rightchild);
	}
}

private static int search(int[] in, int target) 
{
	for (int i = 0; i < in.length; i++) {
		if(in[i]==target)
			return i;
	}
	return -1;
}

}
