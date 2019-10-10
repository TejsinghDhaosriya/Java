import java.io.*;

class FileDemo 
{
 public static void main(String[] args) throws IOExceptions
   {
   File f = new File("tej.txt");
   System.out.println(f.exists());
   f.createNewFile();
   System.out.println(f.exists());
   
   
   
   }

}