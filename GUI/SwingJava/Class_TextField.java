
package java1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Class_TextField
{
    static TextField textfield;
    static Button button;
       
    Class_TextField() 
    {
        Font font = new Font("Calibri",Font.PLAIN,15);
        Color color1 = new Color(0x000000);
        Color color2 = new Color(0xFFFFFFF);
        
        textfield = new TextField(20);

        textfield.setForeground(Color.WHITE);
        textfield.setBackground(color1);
        textfield.setFont(font);
        textfield.setSize(100, 50);
        
        button = new Button("Enter");
        
        button.setFont(font);
        button.setBackground(color1);
        button.setForeground(color2);
        button.setFocusable(false);
        button.setSize(100,50);
        button.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent event) 
                    {
                        if(event.getSource()==button)
                        {
                             System.out.println(textfield.getText());
                             textfield.setEditable(false);
                             textfield.setText("Username Entered");
                        }
                       
                    }
                }
        );
        
        Frame frame = new Frame();
        
        frame.setSize(500,100);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        
        frame.add(textfield);
        frame.add(button);
        
        frame.addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );
        
        
    } 
    
}   // the end : System.exit(0);

