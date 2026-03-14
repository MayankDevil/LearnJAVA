
package java1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

class Class_TextArea implements ActionListener
{
    TextArea textarea;
    Frame frame;
    JButton button1, button2;
    
    Class_TextArea()
    {
        Font font = new Font("forte",Font.PLAIN,18);
        
        button1 = new JButton("Enter");
        button1.setBounds(0,200,250,100);
        button1.setFont(font);
        button1.addActionListener(this);
        
        button2 = new JButton("Clear");
        button2.setBounds(250,200,250,100);
        button2.setFont(font);
        button2.addActionListener(this);
        
        textarea = new TextArea();
        
        textarea.setBounds(0,20,500,200);
        textarea.setBackground(Color.BLACK);
        textarea.setForeground(Color.white);
//        textarea.setEditable(false);
//        textarea.setEnabled(false);
//        textarea.setRows(20);
//        textarea.setColumns(10);
//        textarea.setName("Welcome");
        textarea.setFont(font);
        textarea.setFocusable(true);
        
        frame = new Frame();
        
        frame.setVisible(true);
        frame.setBounds(300,200,500,300);
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
        frame.add(textarea);
        frame.add(button1);
        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()==button1)
        {
            System.out.println(textarea.getText());
            System.out.println(textarea.getColumns());
            System.out.println(textarea.getRows());
            
        }
        if(event.getSource()==button2)
        {
            textarea.setText("");
        }
    }
}
