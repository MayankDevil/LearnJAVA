// package JDBC;

// java -cp "D:\44\javaPrograms\jd\JDBC;C:\mysql-connector-j-8.2.0.jar" PreStatement

class PreStatement
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
            }
            // ---------------------------------------------------

            String query = "insert into mytable(id,name) values(?,?)";

            java.sql.PreparedStatement pre_state = connect.prepareStatement(query);

            pre_state.setInt(1, 4);

            pre_state.setString(2, "benTen");
            
            // pre_state.setNull(0, 0, query);

            // pre_state.setLong(0, 0);

            // ---------------------------------------------------
            connect.close();    // closed connection

            if (connect.isClosed())
            {
                System.out.println(" Successfully Connection is Closed!");
            }

            // if(clos)
            // {
            //     System.out.println(" Your Connection is Establised ");
            // }
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
