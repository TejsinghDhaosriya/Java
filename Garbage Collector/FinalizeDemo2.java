class FinalizeDemo2
     {
	 static FinalizeDemo2 s;
	 public static void main(String[] args) throws InterruptedException,NullPointerException
	    {
		FinalizeDemo2 fd=new FinalizeDemo2();
		
		 System.out.println(fd.hashCode());
		 fd=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(s.hashCode());
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(s.hashCode());
		System.out.println("End of main");
		
		}
	 public void finalize()
	     {
		 System.out.println("Finalize method called");
		 s=this;
		 
		 }
	 
	 }