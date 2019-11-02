import java.util.Scanner;
public class Q{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         int s;
         s = input.nextInt();//define size of array 
      //The array is defined "arr" and elements are of  integer type.
        int[] arr = new int[s];   
       for(int i=0;i<arr.length;i++)
	   {
 	   arr[i]=input.nextInt();
          } 


//Find the average of all odd numbers present in that array and print the same.
double count=0, sum=0;
 double avg=0.0;
for(int i=0;i<arr.length;i++)
{
  if(arr[i]%2!=0)
  {
    sum=sum+arr[i];
   count =count+1;
}
}
avg=sum/count;
System.out.print(sum);
System.out.print(count);
System.out.print(avg);
}}