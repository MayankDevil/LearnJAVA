// package JDBC;
/*
-   LearnJDBC " Learn Java Database Connectivity "
-   Developed by MayankDevil
-   https://github.com/MayankDevil/LearnJDBC
-   ./statementDDL.java
*/

/*

*/ 
class StatementExecutionUpdate
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // set driver class
            
            // connection establised
            
            java.sql.Connection connect = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

            /*
                if connection is closed : return error message
            */
            if (connect.isClosed())
            {
                System.out.println("Connection is Closed?");
                
                System.exit(0);
            }
            // ------------------------------------------------------

            java.sql.Statement state = connect.createStatement();

            String insert_query = "INSERT INTO mytable (id,name) VALUES (123,'Hero')";
            
            int result = state.executeUpdate(insert_query);

            if (result > 0) System.out.println(result+" row(s) inserted.");

            state.close();

            // -----------------------------------------------------

            connect.close();    // closed connection
        }
        catch(ClassNotFoundException error)
        {
            System.out.print(error.getMessage());
        }
        catch(java.sql.SQLException error)
        {
            System.out.print(error.getMessage());
        }
    }
}
/* java -cp "D:\44\javaPrograms\jd\JDBC;C:\mysql-connector-j-8.2.0.jar" StatementExecutionUpdate */

// the end  =====

/*

*/