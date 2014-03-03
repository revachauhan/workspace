package reva.careercup.solutions;

import java.io.File;

public class FileSystemDisplay_recursively {


	public static void main(String[] args) {
		display("C:\\Users\\RevaSingh\\Dropbox\\EBooks_Fall'12");



	}

	public static void display(String path)
	{

		File f = new File(path);
		if(!f.isDirectory())
		{
			System.out.println(path);	
		}
		else
		{
			for(File f1 : f.listFiles())

				display(path + "\\" +f1.getName());

		}
	}
}
