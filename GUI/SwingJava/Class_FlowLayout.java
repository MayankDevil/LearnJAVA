
package java1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Class_FlowLayout
{
    Button[] button = new Button[10];
    
    Class_FlowLayout()
    {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,10);
        
        // flow.setAlignment(FlowLayout.RIGHT);     //   LEADING, TRAILING, CENTER, LEFT, RIGHT
        // flow.setHgap(20);
        // flow.setVgap(20);
        //flow.setAlignOnBaseline(true);
        // flow.getAlignment()
        // flow.getHgap()
        // flow.getVgap()
        
        
        Frame frame = new Frame();
        
        frame.setBounds(300,200,400,400);
        frame.setVisible(true);
        frame.setLayout(flow);
        frame.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent event)
                {
                    System.exit(0);  
                }
            }
        );
        for(int i = 0; i<button.length; i++ )
        {
            frame.add(button[i] = new Button("BUTTON"+i));
        }
        
    }
}
