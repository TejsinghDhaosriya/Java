import java.awt.*;

public class ScrollbarDemo
  {
  public static void main(String[] args)
     {
	 Frame f = new Frame("Frame with Scrollbar");
	 Scrollbar h= new Scrollbar(Scrollbar.HORIZONTAL,0,10,50,100);
	 Scrollbar v =new Scrollbar(Scrollbar.VERTICAL,0,10,50,100);
	 f.resize(500,500);
	 h.setBounds(100,100,50,50);
	 v.setBounds(200,200,100,100);
	 f.add(h);
	 f.add(v);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setBackground(Color.blue);
	 f.show();
	 }
  
  }