package clockwidget;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.GregorianCalendar;

public class Clock extends Component {
    
    GregorianCalendar calendar;
    int sec,minute,hour;
    public Clock(){
        calendar = (GregorianCalendar)GregorianCalendar.getInstance();
    }
    
    @Override
    public void paint(Graphics g){
        
        calendar = (GregorianCalendar)GregorianCalendar.getInstance();
        sec = calendar.get(GregorianCalendar.SECOND);
        minute = calendar.get(GregorianCalendar.MINUTE);
        hour = calendar.get(GregorianCalendar.HOUR); 
        
        double secan = ((360/60)*sec)-180;
        double houran = ((360/12)*hour)-180;
        double minutean = ((360/60)*minute)-180; 
        
        Graphics2D g2 = (Graphics2D)g;
        g2.translate(100, 100); 
        g2.drawOval(-50, -50, 100, 100); 
        
        AffineTransform savedTransform = g2.getTransform(); 
        g2.rotate(Math.toRadians(secan));
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, 1, 50); 
        g2.setColor(Color.red);
        
        g2.setTransform(savedTransform);
        g2.rotate(Math.toRadians(minutean));
        g2.fillRect(0, 0, 1, 45); 
        g2.setColor(Color.green);
        
        g2.setTransform(savedTransform);
        g2.rotate(Math.toRadians(houran));
        g2.fillRect(0, 0, 1, 25);  
        repaint(1000);
    }
}