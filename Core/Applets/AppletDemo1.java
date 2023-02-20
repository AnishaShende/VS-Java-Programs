import java.applet.Applet;
import java.awt.*;

public class AppletDemo1 extends Applet {
    // @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        // System.out.println("Hiii");
        setBackground(Color.green);
        setForeground(Color.black);
        // g.setColor(Color.yellow);
        g.drawString("Hello", 250, 150);
        // g.setColor(Color.pink);
        g.drawRect(200, 130, 100, 30);

    }
    // @Override
    public void init() {
        // TODO Auto-generated method stub
        super.init();
        // System.out.println("Hiii");
    }
}
// <applet code = "AppletDemo1.java" height = "300" width = "500"></applet>
