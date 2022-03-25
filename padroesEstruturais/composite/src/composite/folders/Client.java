package composite.folders;

import java.util.Arrays;

import composite.folders.model.*;

public class Client {

	public static void main(String[] args) {
		FileSystemItem file1 = new File("file 1");
		FileSystemItem file2 = new File("file 2");
		FileSystemItem file3 = new File("file 3");
		FileSystemItem file4 = new File("file 4");
		

		FileSystemItem folder1 = new Folder("folder1", Arrays.asList(file1));
		FileSystemItem folder2 = new Folder("folder2", Arrays.asList(folder1, file2));
		FileSystemItem folder = new Folder("folder3", Arrays.asList(folder2, file3, file4));
		
		folder.print("");
		
		
		
		

	}

}
