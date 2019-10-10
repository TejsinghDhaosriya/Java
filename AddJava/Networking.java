import java.net.*;

class Networking
 {
 public static void main(String[] args) throws UnknownHostException
    {
	try{
	 URL url = new URL("https://www.google.com");
	   InetAddress obj1 = InetAddress.getByName("www.google.com");
	   InetAddress obj2 = InetAddress.getByName(url.getHost());
	   boolean x = obj1.equals(obj2);
	   System.out.println(x);
	   }
	  catch(Exception e){}
	}
 
 }