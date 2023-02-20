import java.applet.Applet;
import java.awt.*;

public class AppletDemo2 extends Applet implements Runnable{
    // String msg = "A simple moving banner";
    String msg = "I am Anisha Shende ";
    Thread t = null;
    int state;
    boolean stopflag;
    @Override
    public void init() {
        // TODO Auto-generated method stub
        super.init();
        setBackground(Color.cyan);
        setForeground(Color.red);
        System.out.println("Init");
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        super.start();
        t = new Thread(this);
        stopflag = false;
        t.start();
        System.out.println("Start");
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        char ch;
        for( ; ; ){
            try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if(stopflag){
                    break;
                }
            } catch(InterruptedException e){}
        }
        System.out.println("Run");
    }
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        super.stop();
        stopflag = true;
        t = null;
        System.out.println("Stop");
    }
    public void paint(Graphics g){
        g.drawString(msg, 80, 150);
    }
}
// <applet code = "AppletDemo2.java" height = "300", width = "300"></applet>