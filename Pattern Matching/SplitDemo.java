import java.util.regex.*;

public class SplitDemo
  {
  public static void main(String[] args)
      {
	  Pattern p =Pattern.compile("i");
	  String[] s= p.split("tejsingh is genius") ;
	  for(String s1:s)
	     {
		 System.out.println(s1);
		 }
	  
	  }
	  
  }
  