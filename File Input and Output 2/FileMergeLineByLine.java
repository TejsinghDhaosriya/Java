import java.io.*;
class FileMergeLineByLine
   {
   public static void main(String[] args)  throws IOException
     {
	 BufferedReader br = new BufferedReader(new FileReader("fileOne.txt"));
	 
	 BufferedReader br2 = new BufferedReader(new FileReader("fileSecond.txt"));
	 PrintWriter pw =new PrintWriter(new FileWriter("combineLineByLine.txt"));
	 String line = br.readLine();
	 String line2= br2.readLine();
	 while(line !=null | line2 !=null)
	   {
	   if(line!=null)
	     {
		   pw.println(line);
		   line=br.readLine();
		 }
	   if(line2!=null)
	     {
		   pw.println(line2);
		   line2=br2.readLine();
		 }
	   }
	 pw.flush();
     br.close();
     br2.close();
     pw.close();	 
	 
	 }
   
   
   }