import java.awt.*;

public class ListDemo
  {
  public static void main(String[] args)
     {
	 Frame f = new Frame("Frame with List");
	 List l1= new List(5);
	
	 f.resize(500,500);
	 l1.setBounds(100,100,250,520);

	 l1.add("apple");
	  l1.add("banana");
	 
	 l1.add("mango");
	 l1.add("orange");
	 l1.add("pineapple");
	 f.add(l1);
	 f.setLayout(null);
	 f.setVisible(true);
	// f.setBackground(Color.blue);
	 f.show();
	 }
  
  }