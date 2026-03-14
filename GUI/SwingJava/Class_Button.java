
package java1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;


class Class_Button implements ActionListener
{
    JFrame frame;
    JButton button;
    
    Class_Button()
    {
            
        button = new JButton();
        
        button.setBounds(50,100,200,50);
        button.setText(" Home Page ");
        button.setFocusPainted(false);

        frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setBounds(300,300,300,200);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.add(button);
          
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==button)
        {
            System.out.println("Button is working");
        }
    }
}