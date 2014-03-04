package reva.java.practice;

public class IsMirror {

	public static void main(String[] args) {
		TreeNode<Integer> root1 = new TreeNode(8);
		root1.leftchild = new TreeNode(6);
		root1.rightchild = new TreeNode(10);
		
		
		TreeNode<Integer> root2 = new TreeNode(8);
		root2.leftchild = new TreeNode(10);
		root2.rightchild = new TreeNode(6);
		
		System.out.println(isMirrorImage(root1, root2));
		

	}
	
	 public static boolean isMirrorImage(TreeNode n1, TreeNode n2)
	    {
	        if(n1==null&& n2 == null)
	            return true;
	        else if (n1==null || n2== null)
	            return false;
	        else if (n1.value!=n2.value)
	            return false;
	        
	        return (isMirrorImage(n1.leftchild,n2.rightchild)&&isMirrorImage(n1.rightchild,n2.leftchild));
	    
	    }
	
	}
	
