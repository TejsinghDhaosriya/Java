import java.io.*;
 
class FileSingleData
   {
   public static void main(String[] args) throws IOException
      {
     BufferedReader br = new  BufferedReader(new FileReader("input.txt"));
	 
      PrintWriter pw = new PrintWriter(new FileWriter("outputFileExtraction22222.txt"));
	  String line=br.readLine();
	  boolean available =false;
	  while(line!=null)
	    {
	     BufferedReader br2 = new  BufferedReader(new FileReader("outputFileExtraction22222.txt"));
     	 String line2 =br2.readLine();
		 while(line2!=null)
		 {
		 if(line.equals(line2))
		   {
			available=true;
		    break;
		   }   
		   line2=br2.readLine();pw.flush();
 
		 }
	  	 if(available==false)
			 {   
		    pw.println(line);
			 }
			 line=br.readLine();
		}
			
			
		   
		 
		
		
	  
	
	  //br.close();
	  pw.close();
	
	  }
   
   }
   
   