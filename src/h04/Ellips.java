package h04;

import java.awt.*;
import java.applet.*;


public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100, 150, 100, 50, 90, 360);
    }
}