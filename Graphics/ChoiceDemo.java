import java.awt.*;

public class ChoiceDemo
  {
  public static void main(String[] args)
     {
	 Frame f = new Frame("Frame with Choice");
	 Choice c= new Choice();
	
	 f.resize(500,500);
	 c.setBounds(100,100,250,520);

	 c.add("apple");
	  c.add("banana");
	 
	 c.add("mango");
	 c.add("orange");
	 c.add("pineapple");
	 f.add(c);
	 f.setLayout(null);
	 f.setVisible(true);
	// f.setBackground(Color.blue);
	 f.show();
	 }
  
  }