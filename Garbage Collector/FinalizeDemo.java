
class FinalizeDemo
     
	 {
	 public static void main(String[] args)
	    {
		FinalizeDemo fd=new FinalizeDemo();
	fd =null;
		System.gc();
		System.out.println("End of main");
		
		}
		public void finalize()
		   {
		   System.out.println("finalizde method called");		   
		   }
	 
	 
	 
	 }