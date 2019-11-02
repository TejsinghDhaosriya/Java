import java.io.*;

class BufferReader
    {
	public static  void main(String[] args) throws IOException
	  {
	  FileReader fr = new FileReader("rrr.txt");
	  BufferedReader br = new BufferedReader(fr);
	  String line = br.readLine();
	  while(line!=null)
	    {
		 System.out.println(line);
		 line=br.readLine();
		 
		
		}
	  br.close();
	  
	  }
	
	}