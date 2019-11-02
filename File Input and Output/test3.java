import java.io.*;

public class test3
      {
	  public static void main(String[] args)
	     {
		 FileWriter fw = new FileWriter("rrr.txt");
         BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Tejsingh is ");
	 bw.write("dumb");
	 bw.write("boy");
	 bw.newLine();
	 bw.flush();
	 bw.close();		 
		 }
	  
	  
	  
	  }