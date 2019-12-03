import java.util.regex.*;

class RegexMailId
   {
   public static void main(String[] args)
      {
	  Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
      Matcher m = p.matcher(args[0]);	  
	  if(m.find() && m.group().equals(args[0]))
	     {
		 System.out.println("Valid Mail");
		 
		 }
	   else
	     {
		 System.out.println("Invalid Maildid");
		 }
	  }
   }
   