
package java5;

import java.util.Calendar;
import java.util.Locale;

class Class_Clander 
{
    public Class_Clander() 
    {
        Calendar c1 = Calendar.getInstance();
        
        System.out.println(
                "\n get(Calendar.DATE)  \t"+c1.get(Calendar.DATE)
                +"\n get(Calendar.YEAR)  \t"+c1.get(Calendar.YEAR)
                +"\n get(Calendar.MONTH) \t"+c1.get(Calendar.MONTH)
                +"\n get(Calendar.DAY_OF_MONTH) \t"+c1.get(Calendar.DAY_OF_MONTH)
                +"\n get(Calender.Day_OF_WEEK) \t"+c1.get(Calendar.DAY_OF_WEEK)
                +"\n get(Calendar.DAY_OF_YEAR) \t"+c1.get(Calendar.DAY_OF_YEAR)
                +"\n get(Calendar.DAY_OF_WEEK_IN_MONTH) \t"+c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)
                +"\n get(Calendar.HOUR) \t"+c1.get(Calendar.HOUR)
                +"\n get(Calendar.MINUTE) \t"+c1.get(Calendar.MINUTE)
                +"\n get(Calendar.SECOND) \t"+c1.get(Calendar.SECOND)
                +"\n  \t"+c1.get(Calendar.MILLISECOND)
        );
        
        System.out.println(" "+c1.getTime());
         
        
        
    }   
}
