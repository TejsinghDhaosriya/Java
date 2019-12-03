import java.util.regex.*;
import java.io.*;
class RegexReadMobileNoFromFile
      {
	  public static void main(String[] args) throws IOException
	    {
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		BufferedReader br= new BufferedReader(new FileReader("input.txt"));
		PrintWriter out= new PrintWriter("output.txt");
		String line=br.readLine();
		while(line!=null)
		   {
		     Matcher m = p.matcher(line);
			 while(m.find())
			    {
				  out.println(m.group());
				  
				
				}
                       line=br.readLine();		   
		   }
		
out.flush();
		
		}
	  
	  }

