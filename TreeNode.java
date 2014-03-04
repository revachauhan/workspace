package reva.java.practice;

import java.io.Serializable;

import reva.CTCI.soutions.CH_4.*;

public class TreeNode<E> implements Serializable {
	
	public TreeNode<E> leftchild;
	public TreeNode<E> rightchild;
	public E value;
	public TreeNode<E> parent;
	
	
	public TreeNode(E value)
	{
		
		this.value = value;
		this.leftchild = null;
		this.rightchild= null;
		
	}
	public TreeNode()
	{
		
	}

}
