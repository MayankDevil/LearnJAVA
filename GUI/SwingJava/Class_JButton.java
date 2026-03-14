
package java2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Class_JButton implements ActionListener
{
    JButton button1, button2;
    JFrame frame;
    JLabel label;
    
    Class_JButton()
    {
        label = new JLabel();
        
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setText(" Click button to check effect  ");
        label.setBounds(50,10,300,50);
        
        button1 = new JButton();
        
        button1.setText(" Button1 ");
        button1.setBounds(50,100,150,50);
        button1.setFocusable(true);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.MAGENTA);
        button1.addActionListener(this);
        
        button2 = new JButton();
        
        button2.setText(" Button2 ");
        button2.setBounds(200,100,150,50);
        button2.setFocusable(false);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.MAGENTA);
        button2.addActionListener(this);
        
        frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==button1)
        {
            label.setForeground(Color.red);
            button1.setContentAreaFilled(false);
            button1.setFocusPainted(true);
            button1.setBorderPainted(true);
        }
        if(event.getSource()==button2)
        {
            label.setForeground(Color.blue);
        }
    }  
    
}
