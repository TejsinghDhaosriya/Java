import java.io.*;

public class BufferedWriterDemo
   {
   public static void main(String[] args) throws IOException
     {
	 FileWriter fw  = new FileWriter("rst.txt");
	 BufferedWriter bw = new BufferedWriter(fw);
	 bw.write("Tejsingh is ");
	 bw.write("dumb");
	 bw.write("boy");
	 bw.newLine();
	 bw.flush();
	 bw.close();
	 }
   
   
   }