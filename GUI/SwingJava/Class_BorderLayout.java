
package java1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Class_BorderLayout
{

    Class_BorderLayout()
    {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        JPanel panel_one = new JPanel();
        JPanel panel_two = new JPanel();
        JPanel panel_three = new JPanel();
        JPanel panel_four = new JPanel();
        JPanel panel_five = new JPanel();

        panel_one.setBackground(Color.red);
        panel_two.setBackground(Color.blue);
        panel_three.setBackground(Color.darkGray);
        panel_four.setBackground(Color.lightGray);
        panel_five.setBackground(Color.white);

        panel_one.setPreferredSize(new Dimension(100,100));
        panel_two.setPreferredSize(new Dimension(100,100));
        panel_three.setPreferredSize(new Dimension(100,100));
        panel_four.setPreferredSize(new Dimension(100,100));
        panel_five.setPreferredSize(new Dimension(100,100));

        frame.add(panel_one,BorderLayout.NORTH);
        frame.add(panel_two,BorderLayout.SOUTH);
        frame.add(panel_three,BorderLayout.EAST);
        frame.add(panel_four,BorderLayout.WEST);
        frame.add(panel_five,BorderLayout.CENTER);
    }
}
