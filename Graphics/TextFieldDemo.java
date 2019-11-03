import java.awt.*;

public class TextFieldDemo
  {
  public static void main(String[] args)
     {
	 Frame f = new Frame("Frame with TextField");
	 TextField l1= new TextField("tej TextField 1");
	 TextField l2 =new TextField("tej2 TextField2");
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