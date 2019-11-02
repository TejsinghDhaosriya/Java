import java.io.*;

class PrintWriterDemo
  {
  public static void main(String [] args) throws IOException
     {
	  FileWriter  bw = new FileWriter("printwriter.txt");
	 
	 PrintWriter pw = new PrintWriter(bw);
	  bw.write("work load ");
	  bw. write(100);
	  pw.println("hey what are you doing");
	  pw.println(4000);
	  pw.flush();
	  pw.close();
	 
	 
	 }  
  
  }