import java.util.regex.*;

class PatternDemo
    {
	public static void main(String[] args)
	  {
	   int count=0;
	   Pattern p = Pattern.compile("ab");
	   Matcher m = p.matcher("abbabbbaab");
	   while(m.find())
	      {
		  count++;
		  System.out.println(m.start()+"___"+m.end()+"______"+m.group());
		  
		  }
	  System.out.println("The number of occurences is "+count);
	  }
	
	
	}