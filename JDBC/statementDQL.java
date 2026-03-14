// package JDBC;

// java -cp "D:\44\javaPrograms\jd\JDBC;C:\mysql-connector-j-8.2.0.jar" DataOquery

class DataQuery
{
    public static void main(String[] args)
    {
        try
        {
            // set driver at class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connection establised : { jdbc:database://url:portnumber/database_name username | password }

            java.sql.Connection connect = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

            // if connection is closed : return error message

            if (connect.isClosed())
            {
                System.out.println(" Your Connection is Closed!");
                System.exit(0);
            }

            // ------------------------------------------------------

            System.out.println(" Your Connection is Establised ");

            java.sql.Statement state = connect.createStatement();

            /*
                Execute the Statement: Once the Statement object is created, there are three ways to execute it1:

                boolean execute(String SQL):
                If the ResultSet object is retrieved, then it returns true else false is returned. It is used to execute SQL DDL statements or for dynamic SQL1.

                int executeUpdate(String SQL):
                Returns the number of rows that are affected by the execution of the statement, used when you need a number for INSERT, DELETE, or UPDATE statements1 DML.
                
                ResultSet executeQuery(String SQL):
                Returns a ResultSet object. Used similarly as SELECT is used in SQL1 DQL.
            */ 

            // String insert_query = "insert into mytable values(1)";

            String select_query  = "select * from mytable";

            java.sql.ResultSet result = state.executeQuery(select_query);

            while (result.next())
            {
                System.out.println(""+result.getString("id")+" "+result.getString("name"));
            }
            // -----------------------------------------------------
            
            connect.close();    // closed connection

            if (connect.isClosed()) System.out.println(" Successfully Connection is Closed!");
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

