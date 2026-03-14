/*
    ./src/fileiostream.java
*/

class FileIOStream
{
    /*
        java.io.FileInputStream
        
        - subclass of java.io.InputStream
        
        - byte-oriented class for reading file as byte sequence
        
        java.io.FileOutputStream
        
        - subclass of java.io.OutputStream
        
        - byte-oriented class for writeing file as byte sequence
           
    */
    
    public static void main(String args[])
    {
        int i;
        
        try
        {
            // write byte ---
            
            java.io.FileOutputStream fos = new java.io.FileOutputStream("my.dat");
            
            for (i = 0; i < 10; i++)
                if((i%2) == 0)
                    fos.write(i);
            
            fos.close();
        
            // read byte ---
        
            java.io.FileInputStream fis = new java.io.FileInputStream("my.dat");
            
            while((i = fis.read()) != -1)
                System.out.println(i);
            
            fis.close();
        }
        catch(java.io.IOException error)
        {
            error.printStackTrace();
        }
    }
}
/*

Compiled from "FileInputStream.java"
public class java.io.FileInputStream extends java.io.InputStream {
  public java.io.FileInputStream(java.lang.String) throws java.io.FileNotFoundException;
  public java.io.FileInputStream(java.io.File) throws java.io.FileNotFoundException;
  public java.io.FileInputStream(java.io.FileDescriptor);
  public int read() throws java.io.IOException;
  public int read(byte[]) throws java.io.IOException;
  public int read(byte[], int, int) throws java.io.IOException;
  public long skip(long) throws java.io.IOException;
  public int available() throws java.io.IOException;
  public void close() throws java.io.IOException;
  public final java.io.FileDescriptor getFD() throws java.io.IOException;
  public java.nio.channels.FileChannel getChannel();
  protected void finalize() throws java.io.IOException;
  static {};
}


Compiled from "FileOutputStream.java"
public class java.io.FileOutputStream extends java.io.OutputStream {
  public java.io.FileOutputStream(java.lang.String) throws java.io.FileNotFoundException;
  public java.io.FileOutputStream(java.lang.String, boolean) throws java.io.FileNotFoundException;
  public java.io.FileOutputStream(java.io.File) throws java.io.FileNotFoundException;
  public java.io.FileOutputStream(java.io.File, boolean) throws java.io.FileNotFoundException;
  public java.io.FileOutputStream(java.io.FileDescriptor);
  public void write(int) throws java.io.IOException;
  public void write(byte[]) throws java.io.IOException;
  public void write(byte[], int, int) throws java.io.IOException;
  public void close() throws java.io.IOException;
  public final java.io.FileDescriptor getFD() throws java.io.IOException;
  public java.nio.channels.FileChannel getChannel();
  protected void finalize() throws java.io.IOException;
  static {};
}


*/
