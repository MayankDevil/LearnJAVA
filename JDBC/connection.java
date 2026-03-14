// package JDBC;
/*
-   LearnJDBC " Learn Java Database Connectivity "
-   Developed by MayankDevil
-   https://github.com/MayankDevil/LearnJDBC
-   ./connection.java
*/

/*
-   JDBC (Java Database Connectivity) is a Java-based API (Application Programming Interface) that allows Java applications to interact with relational databases.
-   It provides a standard interface for connecting to and executing SQL queries against databases. 

1.  Import the Necessary Packages :
    
    To use the JDBC API in your Java program, you simply import the `java.sql` package.

    [ syntax ]

        java.sql.Connection

        java.sql.DriverManager

2.  Load the Database Driver :

    Database drivers help Java understand and talk to databases, which speak a different language called SQL.

    [ syntax ]

        Class.forName("com.mysql.cj.jdbc.Driver");

3.  Establish a Database Connection :

    This code sets up a connection to a MySQL database with a specific URL, username, and password.

    [ syntax ]

        DriverManager.getConnection( url, username, password );

4.  Execute SQL Queries :

    Executing SQL queries means telling the database to do something, like getting data or making changes, by sending it a command in SQL language.

5.  Close the Connection :

    Always close the database connection and related resources like statements and result sets when you're done to save resources and prevent memory issues using the close() method.

    [ syntax ]

        connection_reference.closed();

*/ 
class ConnectionEstablished
{
    public static void main(String[] args)
    {
        try
        {
            /*
                This line of code tells Java to find and load the MySQL database driver.
            */
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch(java.lang.ClassNotFoundException error)
            {
                System.out.println("the driver class specified in Class.forName() or the JDBC URL is not found.");
            }
            /*
                [ getConnection() ] connection establish and return Connection & argument { url | username | password }
            */
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "";
            
            java.sql.Connection connect = java.sql.DriverManager.getConnection(url,username,password);

            // [ isClosed() ] function return true if connection is closed else false

            if (!(connect.isClosed()))
            {
                System.out.println("Connection Established!");
            }
            connect.close();    // closed connection

            if (connect.isClosed())
            {
                System.out.println("Connection Closed!");
            }
        }
        catch(java.sql.SQLException error)
        {
            System.out.print(error.getMessage());
        }
    }
/* java -cp "D:\44\javaPrograms\jd\JDBC;C:\mysql-connector-j-8.2.0.jar" ConnectionEstablished */
}
// the end

/*
Compiled from "DriverManager.java"
public class java.sql.DriverManager {
  static final java.sql.SQLPermission SET_LOG_PERMISSION;
  static final java.sql.SQLPermission DEREGISTER_DRIVER_PERMISSION;
  public static java.io.PrintWriter getLogWriter();
  public static void setLogWriter(java.io.PrintWriter);
  public static java.sql.Connection getConnection(java.lang.String, java.util.Properties) throws java.sql.SQLException;
  public static java.sql.Connection getConnection(java.lang.String, java.lang.String, java.lang.String) throws java.sql.SQLException;
  public static java.sql.Connection getConnection(java.lang.String) throws java.sql.SQLException;
  public static java.sql.Driver getDriver(java.lang.String) throws java.sql.SQLException;
  public static void registerDriver(java.sql.Driver) throws java.sql.SQLException;
  public static void registerDriver(java.sql.Driver, java.sql.DriverAction) throws java.sql.SQLException;
  public static void deregisterDriver(java.sql.Driver) throws java.sql.SQLException;
  public static java.util.Enumeration<java.sql.Driver> getDrivers();
  public static java.util.stream.Stream<java.sql.Driver> drivers();
  public static void setLoginTimeout(int);
  public static int getLoginTimeout();
  public static void setLogStream(java.io.PrintStream);
  public static java.io.PrintStream getLogStream();
  public static void println(java.lang.String);
  static {};
}
*/

/*
Compiled from "Connection.java"
public interface java.sql.Connection extends java.sql.Wrapper,java.lang.AutoCloseable {
  public static final int TRANSACTION_NONE;
  public static final int TRANSACTION_READ_UNCOMMITTED;
  public static final int TRANSACTION_READ_COMMITTED;
  public static final int TRANSACTION_REPEATABLE_READ;
  public static final int TRANSACTION_SERIALIZABLE;
  public abstract java.sql.Statement createStatement() throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String) throws java.sql.SQLException;
  public abstract java.sql.CallableStatement prepareCall(java.lang.String) throws java.sql.SQLException;
  public abstract java.lang.String nativeSQL(java.lang.String) throws java.sql.SQLException;
  public abstract void setAutoCommit(boolean) throws java.sql.SQLException;
  public abstract boolean getAutoCommit() throws java.sql.SQLException;
  public abstract void commit() throws java.sql.SQLException;
  public abstract void rollback() throws java.sql.SQLException;
  public abstract void close() throws java.sql.SQLException;
  public abstract boolean isClosed() throws java.sql.SQLException;
  public abstract java.sql.DatabaseMetaData getMetaData() throws java.sql.SQLException;
  public abstract void setReadOnly(boolean) throws java.sql.SQLException;
  public abstract boolean isReadOnly() throws java.sql.SQLException;
  public abstract void setCatalog(java.lang.String) throws java.sql.SQLException;
  public abstract java.lang.String getCatalog() throws java.sql.SQLException;
  public abstract void setTransactionIsolation(int) throws java.sql.SQLException;
  public abstract int getTransactionIsolation() throws java.sql.SQLException;
  public abstract java.sql.SQLWarning getWarnings() throws java.sql.SQLException;
  public abstract void clearWarnings() throws java.sql.SQLException;
  public abstract java.sql.Statement createStatement(int, int) throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int, int) throws java.sql.SQLException;
  public abstract java.sql.CallableStatement prepareCall(java.lang.String, int, int) throws java.sql.SQLException;
  public abstract java.util.Map<java.lang.String, java.lang.Class<?>> getTypeMap() throws java.sql.SQLException;
  public abstract void setTypeMap(java.util.Map<java.lang.String, java.lang.Class<?>>) throws java.sql.SQLException;
  public abstract void setHoldability(int) throws java.sql.SQLException;
  public abstract int getHoldability() throws java.sql.SQLException;
  public abstract java.sql.Savepoint setSavepoint() throws java.sql.SQLException;
  public abstract java.sql.Savepoint setSavepoint(java.lang.String) throws java.sql.SQLException;
  public abstract void rollback(java.sql.Savepoint) throws java.sql.SQLException;
  public abstract void releaseSavepoint(java.sql.Savepoint) throws java.sql.SQLException;
  public abstract java.sql.Statement createStatement(int, int, int) throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int, int, int) throws java.sql.SQLException;
  public abstract java.sql.CallableStatement prepareCall(java.lang.String, int, int, int) throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int) throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int[]) throws java.sql.SQLException;
  public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, java.lang.String[]) throws java.sql.SQLException;
  public abstract java.sql.Clob createClob() throws java.sql.SQLException;
  public abstract java.sql.Blob createBlob() throws java.sql.SQLException;
  public abstract java.sql.NClob createNClob() throws java.sql.SQLException;
  public abstract java.sql.SQLXML createSQLXML() throws java.sql.SQLException;
  public abstract boolean isValid(int) throws java.sql.SQLException;
  public abstract void setClientInfo(java.lang.String, java.lang.String) throws java.sql.SQLClientInfoException;
  public abstract void setClientInfo(java.util.Properties) throws java.sql.SQLClientInfoException;
  public abstract java.lang.String getClientInfo(java.lang.String) throws java.sql.SQLException;
  public abstract java.util.Properties getClientInfo() throws java.sql.SQLException;
  public abstract java.sql.Array createArrayOf(java.lang.String, java.lang.Object[]) throws java.sql.SQLException;
  public abstract java.sql.Struct createStruct(java.lang.String, java.lang.Object[]) throws java.sql.SQLException;
  public abstract void setSchema(java.lang.String) throws java.sql.SQLException;
  public abstract java.lang.String getSchema() throws java.sql.SQLException;
  public abstract void abort(java.util.concurrent.Executor) throws java.sql.SQLException;
  public abstract void setNetworkTimeout(java.util.concurrent.Executor, int) throws java.sql.SQLException;
  public abstract int getNetworkTimeout() throws java.sql.SQLException;
  public default void beginRequest() throws java.sql.SQLException;
  public default void endRequest() throws java.sql.SQLException;
  public default boolean setShardingKeyIfValid(java.sql.ShardingKey, java.sql.ShardingKey, int) throws java.sql.SQLException;
  public default boolean setShardingKeyIfValid(java.sql.ShardingKey, int) throws java.sql.SQLException;
  public default void setShardingKey(java.sql.ShardingKey, java.sql.ShardingKey) throws java.sql.SQLException;
  public default void setShardingKey(java.sql.ShardingKey) throws java.sql.SQLException;
}
*/

/*
    ClassNotFoundException:
        Occurs when the driver class specified in Class.forName() or the JDBC URL is not found.
        Example: Class.forName("com.mysql.cj.jdbc.Driver") may throw ClassNotFoundException if the MySQL driver is not in the classpath.

    SQLException:
        A broad exception class that covers various SQL-related exceptions.
        Common reasons include incorrect SQL syntax, database server not available, authentication issues, etc.

    SQLSyntaxErrorException:
        Occurs when the SQL query has a syntax error.
        Example: A SQL query like "SELEC * FROM table" (misspelled "SELECT") will result in this exception.

    SQLDataException:
        Raised when there is a data-related issue, such as trying to insert a value into a database column of the wrong data type.

    SQLIntegrityConstraintViolationException:
        Happens when you violate a constraint, like trying to insert a duplicate primary key into a table.

    SQLTimeoutException:
        Occurs when a database operation takes longer than the specified timeout period.

    SQLNonTransientConnectionException:
        Indicates a problem with the database connection itself, such as network issues or the database server being unavailable.

    NullPointerException:
        May occur if you attempt to use a ResultSet, Statement, or Connection object that is not properly initialized.

    OutOfMemoryError:
        This is a severe error, not an exception. It can happen if you don't close resources correctly, leading to memory leaks.
*/