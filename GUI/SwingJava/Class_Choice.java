
package java1;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Class_Choice implements ActionListener
{
    Button button;
    Choice choice1, choice2, choice3;
    Class_Choice()
    {
        choice1 = new Choice();
        
        choice1.setBounds(50,50,100,50);
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        
        choice1.add("January");
        choice1.add("Feburary");
        choice1.add("March");
        choice1.add("April");
        choice1.add("May");
        choice1.add("June");
        choice1.add("July");
        choice1.add("August");
        choice1.add("September");
        choice1.add("October");
        choice1.add("November");
        choice1.add("December");
        
        choice2 = new Choice();
        
        choice2.setBounds(200,50,50,50);
        choice2.setIgnoreRepaint(true);
        
        for(int day=1; day<31; day++)
        {
            choice2.add(" "+day+" ");
        }
        
        String[] year = { "1990","2000","2012","2016" };
        
        choice3 = new Choice();
        choice3.setFocusable(true);
        for(int i=1; i<year.length; i++)
        {
            choice3.add(" "+year[i]+" ");
        }
        
        choice3.setBounds(300, 50, 100, 50);
        
        button = new Button("ENTER");
        
        button.setBounds(100,100,200,50);
        button.addActionListener(this);
        
         
        Frame frame = new Frame();
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setBounds(300,200,400,200);
        frame.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent event)
                {
                    System.exit(0);
                }
            }
        );
        frame.add(choice1);
        frame.add(choice2);
        frame.add(choice3);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()==button)
        {
            
            System.out.println(choice1.getSelectedItem()+"\t"+choice2.getSelectedItem()+"\t"+choice3.getSelectedItem());
            System.out.println(choice1.getItem(1)+"\t"+choice2.getItem(1)+"\t"+choice3.getItem(1));
            System.out.println(choice1.getName()+"\t"+choice2.getName()+"\t"+choice3.getName());
            
            choice1.remove("March");
            choice2.removeAll();
            choice3.remove(2);
            
//            choice1.setEnabled(true);
//            choice3.setEnabled(true);
        }
    }

}
