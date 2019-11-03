import java.awt.*;

public class CardLayoutDemo extends java.applet.Applet
 {
  CardLayout cd;
 public void init()
  {
  cd=new CardLayout();
  setLayout(cd);
  add("1",new Button("Card1"));
  add("2",new Button("Card2"));
  add("3",new Button("Card3"));
  add("4",new Button("Card4"));
  add("5",new Button("Card5"));  }
  public boolean keyDown(Event e,int key)
  {
	  cd.previous(this);
	  return (true);
	  
  }
 }
 
/*
<html>
<body>
 <object width="500" height="500" code="CardLayoutDemo.class">
 </object>
 </body>
</html>
*/