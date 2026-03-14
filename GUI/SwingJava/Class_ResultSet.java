
package java3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Class_ResultSet
{
    static String url, username, password;
    Class_ResultSet()
    {
         try
        {
            url ="jdbc:mysql://localhost:3306/Test" ;
            username = "root";
            password = "912511";
            
            Connection connect = DriverManager.getConnection(url,username,password);
            Statement state = connect.createStatement();
            if(connect.isClosed())
            {
                System.out.println("Connection is Closed");
            }
                  
            
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
    }
}
