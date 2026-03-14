
package java2;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class Class_JCheckBox 
{
    Class_JCheckBox()
    {
        JCheckBox box1 = new JCheckBox();
        
        
        box1.setBounds(50,50,100,50);
        
        
         JFrame frame = new JFrame();
            
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setSize(500,200);
         frame.add(box1);
    }
}
