package reva.careercup.solutions;
import java.util.ArrayList;


public class Subset_of_set {

	public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set)
	{
		ArrayList<ArrayList<Integer>> allsubset = new ArrayList<ArrayList<Integer>>();
		int max = 1<<set.size();
		for(int i = 0;i<max;i++)
		{
			ArrayList<Integer> subset = converInttoSet(i,set);
			allsubset.add(subset);

		}

		return allsubset;


	}

	private static ArrayList<Integer> converInttoSet(int i,ArrayList<Integer> set)
	{
		ArrayList<Integer> subset=  new ArrayList<Integer>();
		int index =0;
		for(int k = i;k>0; k>>=1)
		{
			if((k&1)>0)
				subset.add(set.get(index));	
			index++;
		}
		return subset;
	}

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 5; i++) 
		{
			a.add(i+1);
		}
		ArrayList<ArrayList<Integer>> result = getSubset(a);

		System.out.println(result);
	}

}


