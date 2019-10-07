	
	interface a{  
	    public abstract void run();
	
	}
	class b implements a{
		
		public void run(){}
		
		
	}
	class c extends b {
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("NPTEL");
				
			}
			
			
		}
		
		
	}
	
	
	public class testraj
{

	public static void main(String[] args)
	{
      c c= new c();
c.run();	  
}
	
		
	
}