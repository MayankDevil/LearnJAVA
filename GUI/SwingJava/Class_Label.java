
package java1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Class_Label 
{
    
    Class_Label() 
    {
        Frame frame = new Frame();
        
        Label label = new Label();
        
        label.setText("Handsup if you ready for the fight \n  ");
        label.setForeground(Color.blue);
        label.setBackground(Color.gray);
        label.setAlignment(Label.CENTER);   // LEFT, RIGHT, CENTER
        label.setFont(new Font("Arial",Font.BOLD,14));
        label.setVisible(true);
        
        
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent event)
                    {
                        System.exit(0);
                    }
                }
        );
        
        frame.add(label);
        
    }   // System.exit(0);
    
}   // the end

