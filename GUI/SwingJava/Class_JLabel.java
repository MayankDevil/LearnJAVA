
package java2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Class_JLabel
{
    
    Class_JLabel() 
    {
        JFrame frame = new JFrame("Program:JLabel");
        
        ImageIcon icon = new ImageIcon("");
        
        Border border = BorderFactory.createLineBorder(Color.cyan,2);
        
        JLabel label = new JLabel();
        
        label.setIcon(icon);
        label.setText("WELECOME TO JAVA");
        label.setHorizontalTextPosition(JLabel.CENTER);     // LEFT, RIGHT, CENTER
        label.setVerticalTextPosition(JLabel.TOP);      // TOP, BOTTOM, CENTER
        label.setForeground(new Color(16777215));
        label.setFont(new Font("Arial",Font.BOLD,11));
        label.setIconTextGap(100);
        label.setBackground(new Color(0,0,0));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);     // LEFT, RIGHT, CENTER
        label.setHorizontalAlignment(JLabel.CENTER);      // TOP, BOTTOM, CENTER
        label.setBounds(0,0,500,500);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        frame.setLayout(null);
        //frame.pack();
           
    }
    
}   // The End Of Program


