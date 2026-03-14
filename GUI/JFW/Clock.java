
package java4;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Class_Clock extends JFrame
{
    Calendar calendar;
    SimpleDateFormat time_Format, day_Format, date_Format;
    JLabel time_label, day_label, date_label;
    String time, day, date;
    
    public Class_Clock()
    {
        
        Font font = new Font("Arial",Font.PLAIN,20);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300,400);
     
        time_Format = new SimpleDateFormat("hh:mm:ss a"); 
        day_Format = new SimpleDateFormat("EEEE");
        date_Format = new SimpleDateFormat("MMMM dd, yyyy");  

        time_label = new JLabel();
        day_label = new JLabel();
        date_label = new JLabel();
        
        time_label.setBounds(50,50,200,50);
        day_label.setBounds(50,100,200,50);
        date_label.setBounds(50,150,200,50);
        
        time_label.setFont(font);
        day_label.setFont(font);
        date_label.setFont(font);

        time_label.setText( time_Format.format(Calendar.getInstance().getTime()));
        day_label.setText(day_Format.format(Calendar.getInstance().getTime()));
        date_label.setText(date_Format.format(Calendar.getInstance().getTime())); 
 
        
        this.add(date_label);
        this.add(day_label);
        this.add(time_label);
        
        this.setVisible(true); 
    }
}
