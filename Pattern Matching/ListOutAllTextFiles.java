import java.util.regex.*;
import java.io.*;

class ListOutAllTextFiles
  {
    public static void main(String[] args)
	   {
	     int count =0;
	    File f =new File("C:\\Users\\Hope\\TejJava\\Pattern Matching");
		Pattern p = Pattern.compile("[a-zA-Z0-9.$_]+[.]java");
		String[] s=f.list();
		for(String s1:s)
		  {
		  Matcher m = p.matcher(s1);
		  if(m.find() && m.group().equals(s1))
		       {
			   count++;
			   System.out.println(s1);
			   }
		  
		  }
	      System.out.println(count);
	   }
  
  }