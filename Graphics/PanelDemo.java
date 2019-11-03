import java.awt.*;

public class PanelDemo
   {
   public static void main(String[] args)
      {
	  Frame f = new Frame("Frame With Panel");
	  f.resize(500,500);
	  f.setBackground(Color.blue);
	  f.setLayout(null);
	  Panel p = new Panel();
	  p.resize(200,100);
	  p.setBackground(Color.red);
	  f.add(p);
	//  p.show();
	  f.show();
	  
	  
	  }
   
   
   }