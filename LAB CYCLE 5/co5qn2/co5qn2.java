//Program to find maximum of three numbers using AWT.
package co5;
import java.awt.*;
import java.applet.*;

public class co5qn2 extends Applet
{
  TextField Txt1,Txt2,Txt3;

  public void init(){
      Txt1 = new TextField(10);
      Txt2 = new TextField(10);
      Txt3 = new TextField(10);

      add(Txt1);
      add(Txt2);
      add(Txt3);

      Txt1.setText("0");
      Txt2.setText("0");
      Txt3.setText("0");
  }

  public void paint(Graphics g){
      int a, b, c,result;
      String str;

      g.drawString("Enter your values to Check the Maximum of 3 ",10,50);

      str=Txt1.getText();
      a=Integer.parseInt(str);
      str=Txt2.getText();
      b=Integer.parseInt(str);
      str=Txt3.getText();
      c=Integer.parseInt(str);

      g.setColor(Color.red);
      if (a>b) {
          if (a>c)
              result=a;
          else
              result=c;
      }
      else{
          if (b>c)
              result=b;
          else
              result=c;
      }
      g.drawString("Maximum No is "+result,10,70);
      showStatus("MAXIMUM OF 3 NUMBERS");
  }

  public boolean action(Event e, Object o){
      repaint();
      return true;
  }
}