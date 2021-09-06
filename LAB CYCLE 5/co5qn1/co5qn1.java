//Program to draw Circle, Rectangle, Line in Applet. 
package co5;
import java.applet.*;
import java.awt.*;

public class co5qn1 extends Applet
{
	public void paint(Graphics g)
  {
	  g.drawOval(20, 90, 70, 70);
	  g.drawRect(20, 240, 150, 80);
	  g.drawLine(20, 40, 200, 40);
  }
}