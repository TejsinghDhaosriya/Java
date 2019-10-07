import java.util.*;
import static java.lang.System.out; 
class array
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("tejsingh");
		l.add(1313);
		out.println(l);
		l.add("m");
		out.println(l);
		l.remove(1);
		out.println(l);
		l.add(1,"genius");
		out.println(l);
		
		l.add(null);
		out.println(l);
		
		
		
		
	}
	
	
}