import java.util.*; 

 class IteratorListDemo
    {
	 public static void main(String[] args)
	    {
        LinkedList l = new LinkedList();
         l.add("MY");
         l.add("Name");
         l.add("is");
         l.add("Tejsingh");
         System.out.println(l);
		ListIterator itr = l.listIterator();
          while(itr.hasnext())
            {
			 String s = (String)itr.next();
			 if(s.equals("My"))
			     itr.add("Extra");
			
			
			}		  
       System.out.println(l);
		
		}
	
	} 