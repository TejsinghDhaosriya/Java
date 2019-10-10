import java.io.*;
class FileWriterDemo
{
public static void main(String[] args) throws IOException
   {
   FileWriter f =new FileWriter("abc.txt",true);
   f.write(97);  //a will be addded
   char [] c={'t','e','j'};
   f.write(c);
   f.write("tejubhai");
   f.flush();
   f.close();
   
   
   
   }

}