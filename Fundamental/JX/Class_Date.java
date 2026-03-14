
package java5;

import java.util.Date;

class Class_Date 
{
    public Class_Date() 
    {
        Date date = new Date();
        
        System.out.println(" Date "+date);
        
        System.out.println("\n after(date)"+date.after(date)
                +"\n getDay() \t"+date.getDay()
                +"\n getDate() \t"+date.getDate()
                +"\n getHours() \t"+date.getHours()
                +"\n geMinutes() \t"+date.getMinutes()
                +"\n getMonth() \t"+date.getMonth()
                +"\n getSeconds() \t"+date.getSeconds()
                +"\n getTime() \t"+date.getTime()
                +"\n getTimezoneOffset() \t"+date.getTimezoneOffset()
                +"\n getYear() \t"+date.getYear()
                +"\n toGMTString() \t"+date.toGMTString()
                +"\n toLocaleString() \t"+date.toLocaleString()
                +"\n after(date) \t"+date.after(date)
                +"\n clone() \t"+date.clone()
                +"\n setDate() \t"
        );
        
  
        
    }
}
