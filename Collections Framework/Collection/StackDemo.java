import java.util.*;

class StackDemo
   {
    public static void main(String [] args)
	   {
	   Stack s = new Stack();
        for(int i =1;i<10;i++)	    
		s.push(i);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
        System.out.println(s.search(7));
				
		
	   
	   }
	   
   }