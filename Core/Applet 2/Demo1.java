package appPack;
import java.applet.*;
import java.awt.*;

public class Demo1 extends Applet{
    String str;
    int count = 0, word = 1;
    char ch;
    public void init(){
        str = getParameter("p1");
    }
    public void paint(Graphics g){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) != ' '){
                count ++;
            }
            else{
                word ++;
            }
        }
        Font f = new Font("courier", Font.BOLD, 20);
        g.setFont(f);
        g.drawString(str, 50, 100);
        g.drawString("Character count : "+count, 50, 130);
        g.drawString("Word count is : "+word, 50, 150);
    }
}

// <applet code = "Demo1.class" width = 400 height = 400>
// <PARAM name = "p1" value = "This is DemoString">
// </applet>