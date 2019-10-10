import java.io.*;

class FileDemo 
{
 public static void main(String[] args) throws IOException	
   {
   File f = new File("testFolder");
   System.out.println(f.exists());
   f.mkdir();
   System.out.println(f.exists());
   
   
   
   }

}