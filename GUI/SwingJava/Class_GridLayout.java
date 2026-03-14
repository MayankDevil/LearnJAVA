
package java1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;
import java.awt.Button;

class Class_GridLayout
{
    Button[] button = new Button[10];
    
    Class_GridLayout()
    {
        GridLayout grid = new GridLayout(5,2,30,30);
        
//        grid.setColumns(3);
//        grid.setRows(4);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.getColumns();
//        grid.getRows();
//        grid.getHgap();
//        grid.getVgap();
        
        
        Frame frame = new Frame();
        
        frame.setLayout(grid);
        frame.setBounds(300,200,400,400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent event)
                {
                    System.exit(0);
                }
            }
        );
        for(int i =0; i < button.length; i++)
        {
            frame.add(button[i] = new Button("BUTTON"+i));
        }
    }
}
