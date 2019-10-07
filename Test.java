class test 
 {
 
 public static void main(String[] args)
     {
	 System.out.println("10/0");
	 try{
	 System.out.println(10/0);
	 }
	 
catch(Exception e)
	{}	
		
	catch(ArithmeticException e)
	 {
		System.out.println(e.getMessage());
		 
		 
	 }
	 
	 }
 
 }