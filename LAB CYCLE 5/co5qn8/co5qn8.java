package co5;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class co5qn8 extends Applet implements KeyListener
{
String msg="***   Key Events   ***";
int x=60,y=100;
public void init()
{
addKeyListener(this);
requestFocus();
}
public void keyTyped(KeyEvent key)
{
msg+=key.getKeyChar();
repaint();
}
public void keyReleased(KeyEvent key)
{
showStatus("Key Up!");
}
public void keyPressed(KeyEvent key)
{
showStatus("Key Down!");
}
public void paint(Graphics G)
{
G.drawString(msg,x,y);
}
}