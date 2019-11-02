import java.applet.Applet;
import java.awt.Graphics;

public class appletDemo extends Applet
   {
   public void paint(Graphics g)
     {
	 g.drawString("tejsingh",150,150);
	 }
	
   }
   
   // Main class Question5
public class Question5{
 public static void main(String[] args) {
  //Object of class shapeG is created and display methods are called.
  ShapeG circle = new ShapeG();
  circle.display1();
  circle.display2();
 }
}







// Interface ShapeX is created
interface ShapeX {
 public String base = "This is Shape1";
 public void display1();
}

// Interface ShapeY is created which extends ShapeX
interface ShapeY extends ShapeX {
 public String base = "This is Shape2";
 public void display2();
}

// Class ShapeG is created which implements ShapeY
class ShapeG implements ShapeY {
 public String base = "This is Shape3";
 //Overriding method in ShapeX interface
 public void display1() {
  System.out.println("ShapeX: " + base);
 }
 // Override method in ShapeY interface
  System.out.println("ShapeY: " + base);
}