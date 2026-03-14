
package java2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class_JTextField implements ActionListener
{
    JButton button;
    JTextField textfield;
    
    Class_JTextField()
    {
              
        textfield = new JTextField(40);
        
        textfield.setFont(new Font("arial",Font.PLAIN,18));
        textfield.setBackground(Color.gray);
        textfield.setForeground(Color.blue);
        textfield.setBounds(50,50,200,40);
        textfield.setFocusable(true);
        textfield.setColumns(5);
        textfield.setText("Mr ");
        
        
        button = new JButton("Enter");
        
        button.setBounds(50,100,200,40);
        button.addActionListener(this);
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.add(textfield);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()==button)
        {
            textfield.setEditable(true);
            textfield.setEnabled(true);
            textfield.setDisabledTextColor(Color.green);
            System.out.println(textfield.getText());
        }
    }
       
}
