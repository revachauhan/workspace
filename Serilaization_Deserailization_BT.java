package reva.geeksforgeeks.solution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import reva.java.practice.TreeNode;

public class Serilaization_Deserailization_BT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3990762167487334271L;


	public static void main(String[] args) {

		TreeNode<Character> root = new TreeNode<Character>('a');
		root.leftchild = new TreeNode<Character>('b');
		root.rightchild = new TreeNode<Character>('c');
		root.leftchild.leftchild = new TreeNode<Character>('d');
		root.leftchild.rightchild = new TreeNode<Character>('e');
		root.rightchild.rightchild = new TreeNode<Character>('f');
		root.rightchild.rightchild.rightchild = new TreeNode<Character>('g');
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sdo.txt"));
			serialize_util(root,out);
			out.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		TreeNode<Character> root1 = null;
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("sdo.txt"));
			TreeNode<Character> newroot = deserialize_util(in, root1);
			in.close();
			util_print(newroot);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}


	}

	private static void util_print(TreeNode<Character> node) {
		if(node==null)
			return;
		else{
			System.out.print(node.value +"->");
			util_print(node.leftchild);
			util_print(node.rightchild);
		}
	}

	public static void serialize_util(TreeNode<Character> node,ObjectOutputStream out) throws IOException 
	{
		if(node==null)
			return;
		else if(node.leftchild==null && node.rightchild == null)
		{	
			out.writeObject(node);
			out.writeObject('-');
			return ;
		}
		else if(node.leftchild==null || node.leftchild ==null)
		{
			out.writeObject('#');

			return;
		}

		else
		{	
			out.writeObject(node);
			serialize_util(node.leftchild, out);
			serialize_util(node.rightchild, out);
		}


	}


	public static TreeNode<Character> deserialize_util(ObjectInputStream in,TreeNode<Character> node)
	{
		try{
			Object o = in.readObject();

			if(o.equals('-'))
			{
				node =  null;
				return node;
			}
			else if(o.equals('#'))
			{
				node =  null;
				return node;
			}
			else
			{	

				node = (TreeNode<Character>) o;
				deserialize_util(in, node.leftchild);
				deserialize_util(in, node.rightchild);

			}


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

		return node;
	}

}
