
package java4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Class_Open_Page implements ActionListener
{
    JFrame home_frame;
    JButton button;
    
    Class_Open_Page()
    {
            
        button = new JButton();
        
        button.setBounds(50,100,200,50);
        button.setText(" Home Page ");
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.addActionListener(this);

        
        home_frame = new JFrame();
        
        home_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home_frame.setResizable(true);
        home_frame.setBounds(300,300,300,200);
        home_frame.setVisible(true);
        home_frame.setLayout(null);
        
        home_frame.add(button);
          
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==button)
        {
            System.out.println("ACTION WORK");
            button.setContentAreaFilled(true);
            
           new Home_page();
            home_frame.dispose();

        }
    }
}

class Home_page
{
    JFrame Open_frame;
    JLabel label;
    Home_page()
    {
        label = new JLabel("Welcome To The New Window");
        
        
        Open_frame = new JFrame();
        
        Open_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Open_frame.setResizable(true);
        Open_frame.setBounds(100,100,300,400);
        Open_frame.setVisible(true);
        
        Open_frame.add(label);
    }
}
