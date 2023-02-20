// package Core.Applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.io.*;

public class AppletDemo extends Applet {
    // @Override
    public void paint(Graphics g) {
        // // TODO Auto-generated method stub
        // super.paint(g);
        setForeground(Color.black);
        g.drawRect(100, 100, 80, 80);
        g.drawOval(100, 100, 80, 80);
        g.drawLine(100, 140, 180, 140);
        g.drawLine(140, 100, 140, 180);
    }
}
// <applet code = "AppletDemo" width= "300" height = "300"></applet>