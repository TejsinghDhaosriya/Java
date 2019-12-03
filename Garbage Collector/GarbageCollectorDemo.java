import java.util.Date;

class GarbageCollectorDemo
   {
   public static void main(String[] args)
      {
	  Runtime r = Runtime.getRuntime();
	  System.out.println(r.totalMemory());
	  System.out.println(r.freeMemory());
	  
	  	  System.out.println("-------------");
	  for(long i=0;i<100000000;i++)
	     {
		 Date d = new Date();
		 d=null;
		 }
	    
	  
	  	  System.out.println("-------------");
	  System.out.println(r.totalMemory());
	  System.out.println(r.freeMemory());
	  r.gc();
	  
	  	  System.out.println("-------------");

	  System.out.println(r.totalMemory());
	  System.out.println(r.freeMemory());
	  }
   
   
   }