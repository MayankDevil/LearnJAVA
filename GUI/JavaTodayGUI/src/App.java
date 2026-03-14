/*
*   JavaLoginGUI
*   Developed by Mayank
*   Copyright by https://github.com/MayankDevil/
*   ./src/App.java
*/

class App extends javax.swing.JFrame
{
    java.text.SimpleDateFormat date_format, time_format;

    javax.swing.JLabel date_label, time_label;
        
	java.util.Timer timer;
	
	java.lang.String date, time;

    /*
        ---------------
        | constructor |
        ---------------
    */

	App()
	{
		this.setTitle("https://github.com/MayankDevil/");
		
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

		this.setBounds(100,100,400,160);
		
		this.setResizable(false);
		
		this.setLayout(new java.awt.GridLayout(2, 1));
		
		    time_label = new javax.swing.JLabel(time);

		    labelLayout(time_label,true);

		    date_label = new javax.swing.JLabel(date);

		    labelLayout(date_label,false);
		    
		    // simple date format =====

		    time_format = new java.text.SimpleDateFormat("hh::mm::ss a");

		    date_format = new java.text.SimpleDateFormat("dd MMMMM yyyy - EEEE");
    
            timer = new java.util.Timer(true);
            
            timer.scheduleAtFixedRate(new java.util.TimerTask()
            {
                // @Override -----
                public void run()
                {
                    setTime(); // set the time
                }
            }, 0, 1000); // initial delay of 0 ms, repeat every 1000 ms (1 second)

		this.add(date_label);
		
		this.add(time_label);
	}

	/*
	    -----------------------------------------------------------------
	    |setTime function set formated calender date OR time into label |
	    -----------------------------------------------------------------
	*/
	
	void setTime()
	{
		java.util.Calendar calendar = java.util.Calendar.getInstance();

		time_label.setText(time_format.format(calendar.getTime()));
        
		date_label.setText(date_format.format(calendar.getTime()));
	}
	
	/*
        -----------------------------------------------------------------------
        | myFont function : set Font get argument size and return font object |
        -----------------------------------------------------------------------
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
        ---------------------------------------------------
        | labelLayout function : set layout of java label |
        ---------------------------------------------------
    */
	
	void labelLayout(javax.swing.JLabel label,boolean isSpecial)
	{
	    label.setFont(myFont(2,16));
	    
	    label.setForeground(java.awt.Color.GRAY);
	    
	    label.setBackground(java.awt.Color.WHITE);
	    	    
	    label.setHorizontalAlignment(javax.swing.JLabel.CENTER);
	    
	    if (isSpecial)
	    {
	        label.setFont(myFont(0,16));
	        
	        label.setForeground(java.awt.Color.BLACK);
	    }
	    label.setOpaque(true);
	}
}
/* the end */

