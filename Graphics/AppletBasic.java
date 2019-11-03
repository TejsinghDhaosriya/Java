import java.awt.*;
import java.applet.*;

public class AppletBasic extends Applet
  {
	  String msg;
    public  void init()
	 {
	 setBackground(Color.cyan);
	 setForeground(Color.red);
	 msg =" 1....init()....";
	 }  
	 
	public void start()
	  {
	  msg =msg +"--2--start()--";
	  
	  }
	  
	  public void paint(Graphics g)
	    {
		msg +="--3---paint()--";
		g.drawString(msg,10,30);
		
		}
  }