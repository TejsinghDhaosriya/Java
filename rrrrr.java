import java.io.*;

public class rrrrr
      {
	  public static void main(String[] args) throws Exception
	     {
		 FileWriter fw = new FileWriter("rrr.txt");
         BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Tejsingh is ");
	 bw.write("dumb");
	 bw.newLine();
	 bw.write("boy");
	 bw.newLine();
	 bw.flush();
	 bw.close();		 
		 }
	  
	  
	  
	  }