
package java2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Class_JPanel 
{
    
    Class_JPanel() 
    {
        JFrame frame = new JFrame("Program:JPanel");
        
        JLabel label1 = new JLabel(" JPanel 1  : OK");
        JLabel label2 = new JLabel(" JPanel 2  : OK");
        JLabel label3 = new JLabel(" JPanel 3  : OK");
        
        
        JPanel panel1 = new JPanel();
        
        JPanel panel2 = new JPanel();
        
        JPanel panel3 = new JPanel();
        
        panel1.setBounds(0,0,400,100);
        panel1.setBackground(Color.white);
        panel1.setLayout(new BorderLayout());
        panel1.add(label1);
        
        panel2.setBounds(0,100,200,100);
        panel2.setBackground(Color.darkGray);
        panel2.setLayout(new BorderLayout());
        panel2.add(label2);
        
        panel3.setBounds(200,100,200,100);
        panel3.setBackground(Color.lightGray);
        panel3.setLayout(new BorderLayout());
        panel3.add(label3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,400,200);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
    
}   // The End Of Program


