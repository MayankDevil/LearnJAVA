
package java1;

import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Class_CheckboxGroup implements ActionListener
{
    Button button;
    Checkbox male,female;
    CheckboxGroup sex;
    Class_CheckboxGroup()
    {
        
        Font font = new Font("ARIAL",Font.BOLD,11);
        
        button =  new Button("Button");
        
        button.setFont(font);
        button.setBounds(250,50,100,30);
        button.addActionListener(this);
        
        
        sex = new CheckboxGroup();
        
        male = new Checkbox();
        
        male.setLabel("Male");
        male.setState(false);
        male.setCheckboxGroup(sex);
        male.setFont(font);
        male.setBounds(50,50,100,30);
        male.setFocusable(false);
        //male.setIgnoreRepaint(false);
        //male.setVisible(false);
        
        female = new Checkbox("Female",false,sex);
        
        female.setFont(font);
        female.setBounds(150, 50, 100, 30);
        female.setFocusable(false);
        
        Frame frame = new Frame();
       
        frame.setVisible(true);
        frame.setSize(400,100);
        frame.setResizable(true);
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
        frame.add(male);
        frame.add(female);
        frame.add(button);

    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==button)
        {
            System.out.println(
                    "\n CheckboxGroup = "+male.getCheckboxGroup()+
                    "\n Label = "+male.getLabel()+
                    "\n Status = "+male.getState()+
                    "\n CheckboxGroup = "+female.getCheckboxGroup()+
                    "\n Label = "+female.getLabel()+
                    "\n Status = "+female.getState()
                    );
            male.setEnabled(true);
            female.setEnabled(true);
        }
    }   // TODO code application logic here
}
