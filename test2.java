class MyThread extends Thread
{
public  void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		  
		}
	}
	
	
}

 class test2	
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread t= new MyThread();
		Thread.currentThread().setPriority(9);
t.setPriority(2);
		t.start();
		Thread.currentThread().setName("Tejsingh Patel");
      	
	System.out.println(Thread.currentThread().getName());
      for(int j=0;j<10; j++)
		System.out.println("Main Thread");
    System.out.println(t.getName());
	t.setName("raj");
	
	 System.out.println(t.getName());
	
		
	}
	
	
}