
package java2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;


class Class_JTextArea implements ActionListener
{
    JFrame frame;
    JButton button1, button2;
    JTextArea textarea;
    Class_JTextArea()
    {
        button1 = new JButton("SUBMIT");
        
        button1.setBounds(50,300,150,50);
        button1.addActionListener(this);
        
        button2 = new JButton("RESET");
        
        button2.setBounds(200, 300, 150, 50);
        button2.addActionListener(this);
        
        textarea = new JTextArea();
        
        textarea.setBounds(50,50,300,200);
        //textarea.setColumns(200);
        //textarea.setRows(50);
        textarea.setBorder(null);
        textarea.setEditable(true);
        textarea.setFont(new Font("candara",Font.ITALIC,11));
        
        frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(textarea);
        frame.add(button1);
        frame.add(button2);
        
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==button2)
        {
            textarea.setText(" ");
        }
        if(event.getSource()==button1)
        {
            System.out.println(textarea.getText()+"\n "+
                    textarea.getColumns()+"\n"+
                    textarea.getRows()+"\n"+
                    textarea.getName());
            
            textarea.setEditable(false);
            textarea.setText("NOT TO WRITE");
            textarea.setBackground(Color.LIGHT_GRAY);
            textarea.setForeground(Color.red);
        }
    }
}
