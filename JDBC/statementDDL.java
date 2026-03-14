// package JDBC;
/*
-   LearnJDBC " Learn Java Database Connectivity "
-   Developed by MayankDevil
-   https://github.com/MayankDevil/LearnJDBC
-   ./statementDDL.java
*/

/*
-   The `Statement` class in JDBC is used to execute SQL queries against a database.
-   It's a basic way to send SQL statements to the database, but it's not suitable for handling user input safely because it doesn't support parameterization.

1.  Creation of a Statment  :
    
    You create a `Statement` to interact with a database by first establishing a connection.

    [ syntax ]

        java.sql.Statement state = connection_reference.createStatement()

2.  Execution of SQL Statements :

    With a Statement object, you can run SQL commands like SELECT, INSERT, UPDATE, DELETE, and even CREATE TABLE or DROP TABLE in your database.

    -   executeQuery(String sql) [ DDL ]
        : This method is used to execute SELECT statements and retrieve the result set. It returns a ResultSet object containing the query results.
    -   executeUpdate(String sql) [ DML ]
        : The `execute` method can run both query and non-query SQL statements, and it returns `true` for a `ResultSet` (SELECT) and `false` for an update count or no result.
    -   execute(String sql) [ DQL ]
        : The `execute` method can handle both query and non-query SQL statements, returning `true` for SELECT queries (result available) and `false` for other statements (no result).

3.  Limitations and Concerns :

    No Parameterization : Simple Statements can't use parameters, so you include values directly in your SQL queries, which can make your code vulnerable to SQL injection if not handled carefully.

    SQL Injection Risk : Simple Statements don't use parameters, and this can make your code vulnerable to SQL injection if you include values directly in your SQL queries.

4. Resource Management  :

    When finished with a Statement, close it to save resources. If you have a ResultSet, close that too.

    [ syntax ]

    statement_reference.close()

5.  Performance Considerations :

    Simple Statements aren't great for running the same query with various values. Use PreparedStatement for that; it precompiles the SQL statement for efficiency and parameterization.

*/ 
class StatementExecution
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

            String update_table_query = " ALTER Table mytable ADD Column name char(30) DEFAULT NULL;";
            /*
                execute() : function get Query as String & return boolean { True/False }
            */
            Boolean result = state.execute(update_table_query);

            if(result)
            {
                System.out.println("Statement executed!");
            }
            state.close()   // close statement

            // -----------------------------------------------------
            
            connect.close();    // closed connection
        }
        catch(java.sql.SQLException error)
        {
            System.out.print(error.getMessage());
        }
    }
}
/* java -cp "D:\44\javaPrograms\jd\JDBC;C:\mysql-connector-j-8.2.0.jar" StatementExecution */

// the end

/*
Compiled from "Statement.java"
public interface java.sql.Statement extends java.sql.Wrapper,java.lang.AutoCloseable {
  public static final int CLOSE_CURRENT_RESULT;
  public static final int KEEP_CURRENT_RESULT;
  public static final int CLOSE_ALL_RESULTS;
  public static final int SUCCESS_NO_INFO;
  public static final int EXECUTE_FAILED;
  public static final int RETURN_GENERATED_KEYS;
  public static final int NO_GENERATED_KEYS;
  public abstract java.sql.ResultSet executeQuery(java.lang.String) throws java.sql.SQLException;
  public abstract int executeUpdate(java.lang.String) throws java.sql.SQLException;
  public abstract void close() throws java.sql.SQLException;
  public abstract int getMaxFieldSize() throws java.sql.SQLException;
  public abstract void setMaxFieldSize(int) throws java.sql.SQLException;
  public abstract int getMaxRows() throws java.sql.SQLException;
  public abstract void setMaxRows(int) throws java.sql.SQLException;
  public abstract void setEscapeProcessing(boolean) throws java.sql.SQLException;
  public abstract int getQueryTimeout() throws java.sql.SQLException;
  public abstract void setQueryTimeout(int) throws java.sql.SQLException;
  public abstract void cancel() throws java.sql.SQLException;
  public abstract java.sql.SQLWarning getWarnings() throws java.sql.SQLException;
  public abstract void clearWarnings() throws java.sql.SQLException;
  public abstract void setCursorName(java.lang.String) throws java.sql.SQLException;
  public abstract boolean execute(java.lang.String) throws java.sql.SQLException;
  public abstract java.sql.ResultSet getResultSet() throws java.sql.SQLException;
  public abstract int getUpdateCount() throws java.sql.SQLException;
  public abstract boolean getMoreResults() throws java.sql.SQLException;
  public abstract void setFetchDirection(int) throws java.sql.SQLException;
  public abstract int getFetchDirection() throws java.sql.SQLException;
  public abstract void setFetchSize(int) throws java.sql.SQLException;
  public abstract int getFetchSize() throws java.sql.SQLException;
  public abstract int getResultSetConcurrency() throws java.sql.SQLException;
  public abstract int getResultSetType() throws java.sql.SQLException;
  public abstract void addBatch(java.lang.String) throws java.sql.SQLException;
  public abstract void clearBatch() throws java.sql.SQLException;
  public abstract int[] executeBatch() throws java.sql.SQLException;
  public abstract java.sql.Connection getConnection() throws java.sql.SQLException;
  public abstract boolean getMoreResults(int) throws java.sql.SQLException;
  public abstract java.sql.ResultSet getGeneratedKeys() throws java.sql.SQLException;
  public abstract int executeUpdate(java.lang.String, int) throws java.sql.SQLException;
  public abstract int executeUpdate(java.lang.String, int[]) throws java.sql.SQLException;
  public abstract int executeUpdate(java.lang.String, java.lang.String[]) throws java.sql.SQLException;
  public abstract boolean execute(java.lang.String, int) throws java.sql.SQLException;
  public abstract boolean execute(java.lang.String, int[]) throws java.sql.SQLException;
  public abstract boolean execute(java.lang.String, java.lang.String[]) throws java.sql.SQLException;
  public abstract int getResultSetHoldability() throws java.sql.SQLException;
  public abstract boolean isClosed() throws java.sql.SQLException;
  public abstract void setPoolable(boolean) throws java.sql.SQLException;
  public abstract boolean isPoolable() throws java.sql.SQLException;
  public abstract void closeOnCompletion() throws java.sql.SQLException;
  public abstract boolean isCloseOnCompletion() throws java.sql.SQLException;
  public default long getLargeUpdateCount() throws java.sql.SQLException;
  public default void setLargeMaxRows(long) throws java.sql.SQLException;
  public default long getLargeMaxRows() throws java.sql.SQLException;
  public default long[] executeLargeBatch() throws java.sql.SQLException;
  public default long executeLargeUpdate(java.lang.String) throws java.sql.SQLException;
  public default long executeLargeUpdate(java.lang.String, int) throws java.sql.SQLException;
  public default long executeLargeUpdate(java.lang.String, int[]) throws java.sql.SQLException;
  public default long executeLargeUpdate(java.lang.String, java.lang.String[]) throws java.sql.SQLException;
  public default java.lang.String enquoteLiteral(java.lang.String) throws java.sql.SQLException;
  public default java.lang.String enquoteIdentifier(java.lang.String, boolean) throws java.sql.SQLException;
  public default boolean isSimpleIdentifier(java.lang.String) throws java.sql.SQLException;
  public default java.lang.String enquoteNCharLiteral(java.lang.String) throws java.sql.SQLException;
}
*/
