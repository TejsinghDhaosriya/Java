import java.util.*;
 class HashSetDemo
   {
   public static void main(String[] args)
      {
	  HashSet h = new HashSet();
	  
	  h.add("a");
	  h.add(1);
	  h.add("b");
	  h.add("c");
	  System.out.println(h.add("e")); // add method return true on successfull 
	  System.out.println(h.add("a"));
	  System.out.println(h);
	  
	  }
   
   }