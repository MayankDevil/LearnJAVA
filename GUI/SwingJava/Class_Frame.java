
package java1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Class_Frame  
{
    
    Class_Frame() 
    {
        Frame  frame = new Frame();
        
        frame.setTitle(" Program : Frame of Java ");
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setBackground(Color.lightGray);
        frame.setResizable(true);
        frame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );

    }   // System.exit(0);
    
}   //  the end 
