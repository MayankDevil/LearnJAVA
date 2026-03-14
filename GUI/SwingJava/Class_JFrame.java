package java2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Class_JFrame
{
    
    Class_JFrame()
    {
                
        JFrame frame  = new JFrame();
        
        ImageIcon image = new ImageIcon("");
        
       frame.setIconImage(image.getImage());
       frame.setTitle("Program : JFrame ");
       frame.setSize(500, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(true);
       frame.setVisible(true);
       frame.getContentPane().setBackground(Color.black);
    }
    
}
