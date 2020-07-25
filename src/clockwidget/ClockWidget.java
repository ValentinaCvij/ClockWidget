package clockwidget;

import javax.swing.JFrame;

public class ClockWidget {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setLocation(500,500);
        frame.add(new Clock());
        frame.setVisible(true);  
    }
}