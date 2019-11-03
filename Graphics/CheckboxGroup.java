import java.awt.*;

public class CheckboxGroup
   {
   public static void main(String[] args)
      {
	  Frame f = new Frame("Frame With Checkboxes");
	  f.resize(500,500);
	  f.setBackground(Color.blue);
	  f.setLayout(null);
	  CheckboxGroup cbg = new CheckboxGroup();
	   Checkbox c1 = new Checkbox("-------1-------",cbg,false);
	  c1.setBounds(100,100,50,50);
	  c1.setBackground(Color.red);
	  Checkbox c2 = new Checkbox("-------2-------",cbg,true);
	  c2.setBounds(100,150,50,50);
	  c2.setBackground(Color.red);
	  
	  f.add(c1);
	  f.add(c2);
	  f.setVisible(true);
	  f.show();
	  
	  
	  }
   
   
   }