import java.awt.*;

 class BorderLayoutDemo
   {
   public static void main(String[] args)
      {
	  Frame f = new Frame("Frame With BorderLayout");
	  f.resize(500,500);
	  f.setBackground(Color.blue);
	 // f.setLayout(new BorderLayout(BorderLayout.LEFT));
	   Button b = new Button("click me");
	   Button b2 = new Button("click me 2");
	   Button b3 = new Button("click me3");
	   Button b4 = new Button("click me4");Button b5 = new Button("click me5");
	 
	  b.setBounds(200,100,40,30);
	  b.setBackground(Color.red);
	  
	  f.add(b,BorderLayout.CENTER);
	  f.add(b2,BorderLayout.EAST);
	  f.add(b3,BorderLayout.WEST);
	  f.add(b4,BorderLayout.NORTH);
	  f.add(b5,BorderLayout.SOUTH);
	

	  
	  f.setVisible(true);
	  f.show();
	  
	  
	  }
   
   
   }