
package java1;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Class_Checkbox
{
    Class_Checkbox()
    {
        Font  font = new Font("FORTE",Font.ITALIC,15);
        
        Checkbox afrikan = new Checkbox();
        
        afrikan.setLabel("Afrikan");
        afrikan.setState(true);
        afrikan.setBounds(50,50,100,50);
        afrikan.setFont(font);
        afrikan.setBackground(Color.black);
        afrikan.setForeground(Color.white);
        afrikan.addItemListener(null);
        
        Checkbox russian = new Checkbox("Russian",false);
        
        russian.setBounds(200,50,100,50);
        russian.setFont(font);
        russian.setBackground(Color.black);
        russian.setForeground(Color.white);
        
        Checkbox chinese = new Checkbox();
        
        chinese.setLabel("Chinese");
        chinese.setState(false);
        chinese.setBounds(350,50,100,50);
        chinese.setFont(font);
        chinese.setBackground(Color.black);
        chinese.setForeground(Color.white);
        
        Frame frame = new Frame();
       
        frame.setVisible(true);
        frame.setSize(500,100);
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
        frame.add(afrikan);
        frame.add(russian);
        frame.add(chinese);
       
        System.out.println(" Label : "+afrikan.getLabel()+" "+russian.getLabel()+" "+chinese.getLabel());
        System.out.println(" State :  "+afrikan.getState()+" "+russian.getState()+" "+chinese.getState());
        
        
    }
}

