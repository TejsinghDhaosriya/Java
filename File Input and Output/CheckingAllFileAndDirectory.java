import java.io.*;

class CheckingAllFileAndDirectory
{
 public static void main(String[] args) throws IOException	
   {
	File f2 = new File("C:\\apex");
	int count =0;
	String [] s = f2.list();
	for(String s1:s)	{
	count++;
   System.out.println(s1+"\n"+count );
	}
   
   
   }

}