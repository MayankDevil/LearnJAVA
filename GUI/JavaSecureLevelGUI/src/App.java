/*
-   JavaSecureLevelGUI
-   Copyright by https://github.com/MayankDevil/
-   Developed by Mayank
-   ./src/App.java
*/
class App extends javax.swing.JFrame implements java.awt.event.ActionListener
{
    javax.swing.JPanel center_panel ;
    
    javax.swing.JLabel statement_label;

    javax.swing.JTextField password_field;

    javax.swing.JButton validate_button;
    
    int level = 0;

    String primary = "#007bff", secondary = "#6c757d";

    /*
        ---------------
        | constructor |
        ---------------
    */
    
    App(boolean isActive)
    {
        if (!isActive) return;
        
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);

        this.setSize(500,500);
        
        this.setTitle("https://github.com/MayankDevil/");

            // center panel -----
        
            center_panel = new javax.swing.JPanel();
            
            center_panel.setBackground(java.awt.Color.WHITE);
            
            center_panel.setLayout(null);

                // password field -----
                
                password_field = new javax.swing.JTextField();
                
                fieldStyle(password_field); // self function
                
                // validate button -----
                
                validate_button = new javax.swing.JButton("Security Level");
            
                buttonStyle(validate_button); // self function

                // title label -----

                statementLayout(); // self function
            
            center_panel.add(password_field);
            
            center_panel.add(validate_button);

            center_panel.add(statement_label);
            
        this.add(center_panel);       
    }
    
    /*
        -----------------------------------------------------------------------------
        | myFont function return new Font object with the specified style and size  |
        -----------------------------------------------------------------------------
    */
    
    java.awt.Font myFont(int style, int size)
    { 
        if (style == 1)
        {
            style = java.awt.Font.ITALIC;
        }
        else if (style == 2)
        {
            style = java.awt.Font.BOLD;
        }
        else
        {
            style = java.awt.Font.PLAIN;
        }            
        return new java.awt.Font("-apple-system, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica Neue, Arial, Noto Sans,Liberation Sans, sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol,Noto Color Emoji",style,size);
    }
    
    /*
        -------------------------------------------------------------------------
        | fieldStyle function Applies custom styling to the provided JTextField |
        -------------------------------------------------------------------------
    */
    
    void fieldStyle(javax.swing.JTextField field)
    {
        field.setBounds(100,50,300,40);
        
        // field.setSize(300,40);
        
        field.setFont(myFont(3,14));
        
        field.setForeground(java.awt.Color.BLACK);
        
        field.setBackground(java.awt.Color.WHITE);
        
        field.setOpaque(true);
        
        field.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.decode("#80bdff"),1));
    }
    
    /*
        -----------------------------------------------------------------------
        | buttonStyle function Applies custom styling to the provided JButton |
        -----------------------------------------------------------------------
    */
    
    void buttonStyle(javax.swing.JButton button)
    {
        button.setBounds(100,120,150,40);
        
        // button.setSize(200,40);
        
        button.setFont(myFont(2,14));
        
        button.setFocusable(false);
        
        button.setForeground(java.awt.Color.WHITE);
        
        button.setBackground(java.awt.Color.decode(primary));
        
        button.setOpaque(true);
        
        button.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        
        button.addActionListener(this); // add action listener
    }

    /*
        ------------------------------------------------------------------
        | statementLayout function set the layout of the statement label |
        ------------------------------------------------------------------
    */
    
    void statementLayout()
    {
        statement_label = new javax.swing.JLabel();
                
        statement_label.setBounds(100,200,300,50);
        
        statement_label.setFont(myFont(2,14));
        
        statement_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }

    // @Override method ActionListener ------------------------------
    
    public void actionPerformed(java.awt.event.ActionEvent event)
    {
        if (event.getSource() == validate_button)
        {
            System.out.println("_[ button Active ]");
        
            String password = password_field.getText();

            if (password.isEmpty())
            {
                statement_label.setText("Field is Empty?");

                levelColorScheme(0);
            }
            else if (password.matches(".*[ ].*"))
            {
                statement_label.setText("Unexpected Space!");

                levelColorScheme(0);
            }
            else
            {
                level = hasSecureLevel(password);
                
                System.out.println(password+" security level is "+level); 

                statement_label.setText("Password level is "+level+"% secure ");

                levelColorScheme(level);
            }
        }
    }

    /*
        -------------------------------------------------------------------------
        | hasSecureLevel function return the password security level as integer |
        -------------------------------------------------------------------------
    */

    int hasSecureLevel(java.lang.String password)
    {
        int level = new java.util.Random().nextInt(5);

        if (password.matches(".*\\d.*"))
        {
            level += 15;
        }
        if (password.matches(".*[a-zA-Z].*"))
        {     
            if (password.matches(".*[a-z].*"))
            {
                level += 20;
            }
            if (password.matches(".*[A-Z].*"))
            {
                level += 20;
            }
            level += 5;
        }
        if (password.matches(".*[!@#$%^&*()?:;.,+=-_].*"))
        {
            level += 15;
        }
        if (password.length() >= 4)
        {
            level += 5;
        } 
        else if (password.length() >= 8)
        {
            level += 10;
        }
        else if (password.length() > 15)
        {
            level += 5;
        }
        return level;
    }

    /*
        ---------------------------------------------------------------------------------------------
        | levelColorScheme function set statement color scheme based on the provided security level |
        ---------------------------------------------------------------------------------------------
    */

    void levelColorScheme(int level)
    {
        if (level >= 90)
        {
            statement_label.setForeground(java.awt.Color.decode("#0a3622"));
            statement_label.setBackground(java.awt.Color.decode("#d1e7dd"));
        }
        else if (level >= 75)
        {
            statement_label.setForeground(java.awt.Color.decode("#055160"));
            statement_label.setBackground(java.awt.Color.decode("#cff4fc"));
        }
        else if (level >= 50)
        {
            statement_label.setForeground(java.awt.Color.decode("#664d03"));
            statement_label.setBackground(java.awt.Color.decode("#fff3cd"));
        }
        else if (level >= 30)
        {
            statement_label.setForeground(java.awt.Color.decode("#ce5c00"));
            statement_label.setBackground(java.awt.Color.decode("#ffdbbc"));
        }
        else if (level >= 15)
        {
            statement_label.setForeground(java.awt.Color.decode("#58151c"));
            statement_label.setBackground(java.awt.Color.decode("#f8d7da"));
        }
        else
        {
            statement_label.setForeground(java.awt.Color.decode("#0d6efd"));
            statement_label.setBackground(java.awt.Color.decode("#212529"));
        }
        statement_label.setOpaque(true);
    }
    
    /*
        [ main function ] ===========================================
    */

    public static void main(String args[])
    {
        new App(true).setVisible(true);        
    }
}
// the end