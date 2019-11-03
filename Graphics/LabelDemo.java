import java.awt.*;

public class LabelDemo
  {
  public static void main(String[] args)
     {
	 Frame f = new Frame("Frame with Label");
	 Label l1= new Label("tej label 1");
	 Label l2 =new Label("tej2 label2");
	 f.resize(500,500);
	 l1.setBounds(100,100,50,50);
	 l2.setBounds(200,200,100,100);
	 f.add(l1);
	 f.add(l2);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setBackground(Color.blue);
	 f.show();
	 }
  
  }