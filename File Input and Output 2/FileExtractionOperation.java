import java.io.*;
 
class FileExtractionOperation
   {
   public static void main(String[] args) throws IOException
      {
     BufferedReader br = new  BufferedReader(new FileReader("input.txt"));
	 
      PrintWriter pw = new PrintWriter(new FileWriter("outputFileExtraction.txt"));
	  String line=br.readLine();
	  boolean available =false;
	  while(line!=null)
	    {
	     BufferedReader br2 = new  BufferedReader(new FileReader("delete.txt"));
     	 String line2 =br2.readLine();
		 while(line2!=null)
		 {
		 if(line.equals(line2))
		   {
			available=true;
		    break;
		   }   
		   line2=br2.readLine();
 
		 }
	  	 if(available==false)
			 {   
		    pw.println(line);
			 }
			 line=br.readLine();
		}
			pw.flush();
			
		   
		 
		
		
	  
	
	  //br.close();
	  pw.close();
	
	  }
   
   }
   
   