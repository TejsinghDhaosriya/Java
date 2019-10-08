import java.util.*;

class LinkedListDemo

{
 public static void main(String[]args)
 {
	 LinkedList l = new LinkedList();
	  l.add("Tej");
	  l.add(1313);
	  System.out.println(l);
	  l.addFirst("My name is");
	  
	  System.out.println(l);
	  l.addFirst("error");
	  
	  System.out.println(l);
	  l.set(0,"Introduction");
	  l.addLast("genius");
	  
	  System.out.println(l);
	 
	 
 }

}