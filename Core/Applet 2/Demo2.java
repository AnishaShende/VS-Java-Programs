import java.applet.*;
import java.awt.*;
public class Demo2 extends Applet implements Runnable{
    String str = "Java Programming ";
    Thread t;
    public void init() {
        // setBackground(Color.red);
        // setForeground(Color.cyan);
    }
    public void start() {
        t = new Thread(this);
        t.start();
    }
    public void run() {
        while(true){
            try{
                repaint();
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
    public void Paint(Graphics g){
        char ch;
        ch = str.charAt(0);
        str = str.substring(1, str.length());
        str += ch;
        g.drawString(str, 50, 50);
    }
}
/*
 * <applet code = "Demo2.class" width = "500" height = "500"></applet>
 */