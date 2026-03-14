
package java1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Class_Panel 
{
    Class_Panel()
    {
        
       Panel panel1 = new Panel();
       
       panel1.setBounds(0,0,400,100);
       panel1.setBackground(Color.gray);
       panel1.add(new Label("Good demo of Panel Class and panel use with idea",Label.CENTER));

       Panel panel2 = new Panel();
       
       panel2.setBounds(0,100,200,100);
       panel2.setBackground(Color.darkGray);
       panel2.add(new Label("Button 1",Label.CENTER));

       Panel panel3 = new Panel();
       
       panel3.setBounds( 200,100,200,100);
       panel3.setBackground(Color.lightGray);
       panel3.add(new Label("Button2",Label.CENTER));

       Frame frame = new Frame();
       
       frame.setVisible(true);
       frame.setSize(400,200);
       frame.setResizable(true);
       frame.setLayout(null);
       frame.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent event)
                {            
                    System.exit(0);   
                }
            }
       );
       frame.add(panel1);
       frame.add(panel2);
       frame.add(panel3);
     
    }    
}   // the end
