import java.io.*;

class FileDemo2 
{
 public static void main(String[] args) throws IOException	
   {
	File f2 = new File("C:\\teju234");
	f2.mkdir();
        
   File f = new File("C:\\teju234","tejsingh.txt");
   System.out.println(f.exists());
   f.createNewFile();
   System.out.println(f.exists());
   
   
   
   }

}