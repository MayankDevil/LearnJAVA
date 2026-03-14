
package java4;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Class_Login_Form
{
    Class_Login_Form()
    {
        
        Security secure = new Security();
        
        Login_Page login = new Login_Page(secure.data());
     
        System.out.println("SUCCESSFUL MASTER MAYANK :)");
        
    }
}

class Security
{
    HashMap<String,String> data = new HashMap<String,String>();
    
    Security()
    {
        data.put("User","Pass");
        data.put("Hritik","void@1234");
        data.put("Poonam", "Icandoit");
    }
    
    HashMap data()
    {
        return data;
    }
}

class Login_Page implements ActionListener
{
    HashMap<String,String> login_data = new HashMap<String,String>();
   
     JFrame frame ;
     JLabel username_label , password_label, message_textarea ;
     JTextField username_textfield;
     JPasswordField password_textfield;
     JButton login_button , reset_button ;
    
    Login_Page(HashMap<String,String> secure_data)
    {
        login_data = secure_data;
        
        Font font1 = new Font("ARIAL",Font.BOLD,16);
        Font font2 = new Font("CALIBRI",Font.PLAIN,16);
        
        username_label = new JLabel();  //  USERNAME LABEL
        
        username_label.setText("Username : ");
        username_label.setBounds(50,50,100,30);
        username_label.setFont(font1);
        username_label.setForeground(Color.black);
        
        password_label = new JLabel();  // PASSWORD LABEL
        
        password_label.setText("Password : ");
        password_label.setBounds(50,100,100,30);
        password_label.setFont(font1);
        password_label.setForeground(Color.black);
        
        username_textfield = new JTextField();  // USERNAME FIELD
        
        username_textfield.setBounds(150, 50, 200, 30);
        username_textfield.setFont(font2);
        username_textfield.setBackground(Color.white);
        username_textfield.setForeground(Color.black);
        
        password_textfield = new JPasswordField();  // PASSWORD FIELD
        
        password_textfield.setBounds(150,100,200,30);
        password_textfield.setFont(font2);
        password_textfield.setBackground(Color.white);
        password_textfield.setForeground(Color.black);
                
        login_button = new JButton();   //  LOGIN BUTTON
        
        login_button.setText("Login");
        login_button.setBounds(80,150,100,30);
        login_button.setFont(font1);
        login_button.setFocusable(false);
        login_button.addActionListener(this);
        login_button.setBackground(Color.gray);
        login_button.setForeground(Color.black);
        
        reset_button = new JButton();   //  RESET BUTTON
        
        reset_button.setText("Reset");
        reset_button.setBounds(220,150,100,30);
        reset_button.setFont(font1);
        reset_button.setFocusable(false);
        reset_button.addActionListener(this);
        reset_button.setBackground(Color.gray);
        reset_button.setForeground(Color.black);
        
        message_textarea = new JLabel();     // MESSAGE BOX
        
        message_textarea.setText("Please Follow the protocal");
        message_textarea.setBounds(50,200,300,50);
        message_textarea.setFont(font1);
        message_textarea.setHorizontalAlignment(JLabel.CENTER);
        
        frame = new JFrame();       //  LOGIN FRAME
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        
        frame.add(username_label);
        frame.add(password_label);
        frame.add(username_textfield);
        frame.add(password_textfield);
        frame.add(login_button);
        frame.add(reset_button);
        frame.add(message_textarea);
    }
   
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()==reset_button)
        {
            username_textfield.setText("");
            password_textfield.setText("");
        }   // reset button function
        
        if(event.getSource()==login_button)
        {
            String username = username_textfield.getText();
            String password = String.valueOf(password_textfield.getPassword());
      
            if(login_data.containsKey(username))
            {
                if(login_data.get(username).equals(password))
                {
                    message_textarea.setForeground(Color.black);
                    message_textarea.setText(" Username & Password is matched \n Login Successful ");
                }
                else
                {
                    message_textarea.setForeground(Color.black);
                    message_textarea.setText(" Password is Not Match ");
                }
            }
            else
            {
                message_textarea.setForeground(Color.black);
                message_textarea.setText(" Username is not not match ");
            }
            
        }   // login button function 
    }

}
