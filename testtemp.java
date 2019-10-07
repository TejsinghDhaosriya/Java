import java.util.Scanner;
interface GCD {

   public int findGCD(int n1,int n2);

}

class B implements GCD    
  {
  public int findGCD(int n1,int n2)
  {
	  int i=2,j=0;
	  int [] temp= new int[50];
	  while(true)
	  {
		  
		  if(n1%i == 0)
		  {
			  temp[j]=i;
			  n1=n1/i;
			  j=j+1;
		  }
		  else if (n1==0)
			  break;
		  else
			  i=i+1;
		  
	  }
	  
	  i=2;j=0;
	  int [] temp2= new int[50];
	  
	  while(true)
	  {
		  
		  if(n2%i == 0)
		  {
			  temp2[j]=i;
			  n2=n2/i;
			  j=j+1;
		  }
		  else if (n2==0)
			  break;
		  else
			  i=i+1;
		  
	  }
	  i=0;
	  int p=1;
	  int k=0;
	  for(i=0;i<j;i++)
	  {
		  if(temp2[i]==temp[k])
		  {
			 p=p*(temp2[i]); 
			 k=k+1; 
			  
		  }
		  
		  
	  }
	  return p;
  }
  
  }
  
  
  
  public class testtemp
     {
	 
	 public static void main(String[] args)
	    {
		B a = new B();
		
		Scanner sc = new Scanner(System.in);
		 int p1= sc.nextInt();
		 int p2 = sc.nextInt();
		 
		 System.out.print(a.findGCD(p1,p2));
		
		} 
	 
	 }
  