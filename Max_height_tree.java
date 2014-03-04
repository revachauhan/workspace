package reva.java.practice;

public class Max_height_tree {
	
	int height1,height2;
	
	public Max_height_tree() {
	height1 = 0;
	height2 =0;
	}
	
	public int height(TreeNode node)
	
	{	
		if(node==null)
			return -1;//This decides if a 
		else{
		
		height1=height(node.leftchild)+1;
		height2 =height(node.rightchild)+1;
		
		}
		return (Math.max(height1,height2));
		
		
	}

}
