import java.awt.*;

 class GridLayoutDemo
   {
   public static void main(String[] args)
      {
	  Frame f = new Frame("Frame With GridLayout");
	  f.resize(200,200);
	  f.setBackground(Color.blue);
	  f.setLayout(new GridLayout(2,2));
	   Button b = new Button("click me");
	   Button b2 = new Button("click me 2");
	   Button b3 = new Button("click me3");
	   Button b4 = new Button("click me4");Button b5 = new Button("click me5");
	   Button b6 = new Button("click me6");
	   Button b7 = new Button("click me7");
	   Button b8 = new Button("click me8");
	   Button b9 = new Button("click me9");
	   Button b10 = new Button("click me10");
	//  b.setBounds(200,100,40,30);
	  b.setBackground(Color.red);
	  
	  f.add(b);
	  f.add(b2);
	  f.add(b3);
	  f.add(b4);
	  f.add(b5);
	  f.add(b6);
	  f.add(b7);
	  f.add(b8);
	  f.add(b9);
	  f.add(b10);

	  
	  f.setVisible(true);
	  f.show();
	  
	  
	  }
   
   
   }