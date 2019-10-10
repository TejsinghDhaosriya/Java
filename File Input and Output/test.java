import java.io.*;

class test 
{
 public static void main(String[] args) throws IOException	
   {
	File f2 = new File("C:\\apex");
	
	String [] s = f2.list();
	for(String s1:s)	{
   System.out.println(s1 );
	}
   
   
   }

}