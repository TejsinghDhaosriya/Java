import java.io.*;

public class CreateFileInADirectory
      {
	  public static void main(String[] args) throws IOException
	     {
		 File f = new File("DirectoryTej");
		 f.mkdir();
		 File f2 = new File("DirectoryTej","tej2.txt");
		 f2.createNewFile();
		 System.out.println(f2.exists());
		 
		 
		 
		 
		 }
	  }