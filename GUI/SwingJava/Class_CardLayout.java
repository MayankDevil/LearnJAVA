
package java1;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Class_CardLayout implements ActionListener
{
    CardLayout card = new CardLayout(100,200);
    Button button1 = new Button("Button1");
    Button button2 = new Button("Button2");
    Button button3 = new Button("Button3");
    Class_CardLayout()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        Frame frame = new Frame();
        
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        frame.addWindowListener
        (
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent event)
                    {
                        System.exit(0);
                    }
                }
        );
        frame.setLayout(card);
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        
        if(event.getSource() == button1)
        {
        }
        if(event.getSource() == button2)
        {
        }
        if(event.getSource() == button3)
        {
        }
    }
}
