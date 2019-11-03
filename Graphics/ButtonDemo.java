import java.awt.*;

public class ButtonDemo
   {
   public static void main(String[] args)
      {
	  Frame f = new Frame("Frame With Panel");
	  f.resize(500,500);
	  f.setBackground(Color.blue);
	  f.setLayout(null);
	   Button b = new Button("click me");
	  b.setBounds(200,100,40,30);
	  b.setBackground(Color.red);
	  f.add(b);
	  f.setVisible(true);
	  f.show();
	  
	  
	  }
   
   
   }