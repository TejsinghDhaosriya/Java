/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc =new Scanner(System.in);
	     int a=sc.nextInt();
	     double b=sc.nextFloat();
	     double c=(double)a-0.5;
	     if(c<=b && a%2==0)
	        System.out.println(b-c);
	    else if(c>b && a%2==0)
	         System.out.println(c);
	    else 
	       System.out.println(c);
	   
	   sc.close();
	    
	}
}
