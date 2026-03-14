/*
    ./src/databyte.java
*/

class Databyte
{
    java.io.ByteArrayInputStream in_byte_array;
    
    java.io.ByteArrayOutputStream out_byte_array;
    
    java.lang.String data, filename;

    java.util.Scanner input;
    
    byte[] databyte;

    Databyte()
    {
        input = new java.util.Scanner(System.in);
        
        System.out.println("\n[set file name or root] = ");
        filename = input.next();
        
        System.out.println("\n[insert data in file] = ");        
        data = input.nextLine();
        
        databyte = data.getBytes();
        
        writeFile(databyte, filename);
    }
    
    void writeFile(byte[] databyte, String filename)
    {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream(databyte);
        
        try
        {
            java.io.FileOutputStream fos = new java.io.FileOutputStream(filename);
            
            for (int i = 0; i < baos.length; i++)
                fos.write(boas[i]);
            
            fos.close();         
        }
        catch(java.io.IOException error)
        {
            error.printStackTrace();   
        }
    }
    
    public static void main()
    {
        new Databyte();
    }
}
/*

Compiled from "ByteArrayInputStream.java"

public class java.io.ByteArrayInputStream extends java.io.InputStream {
  protected byte[] buf;
  protected int pos;
  protected int mark;
  protected int count;
  public java.io.ByteArrayInputStream(byte[]);
  public java.io.ByteArrayInputStream(byte[], int, int);
  public synchronized int read();
  public synchronized int read(byte[], int, int);
  public synchronized byte[] readAllBytes();
  public int readNBytes(byte[], int, int);
  public synchronized long transferTo(java.io.OutputStream) throws java.io.IOException;
  public synchronized long skip(long);
  public synchronized int available();
  public boolean markSupported();
  public void mark(int);
  public synchronized void reset();
  public void close() throws java.io.IOException;
}

Compiled from "ByteArrayOutputStream.java"

public class java.io.ByteArrayOutputStream extends java.io.OutputStream {
  protected byte[] buf;
  protected int count;
  public java.io.ByteArrayOutputStream();
  public java.io.ByteArrayOutputStream(int);
  public synchronized void write(int);
  public synchronized void write(byte[], int, int);
  public void writeBytes(byte[]);
  public synchronized void writeTo(java.io.OutputStream) throws java.io.IOException;
  public synchronized void reset();
  public synchronized byte[] toByteArray();
  public synchronized int size();
  public synchronized java.lang.String toString();
  public synchronized java.lang.String toString(java.lang.String) throws java.io.UnsupportedEncodingException;
  public synchronized java.lang.String toString(java.nio.charset.Charset);
  public synchronized java.lang.String toString(int);
  public void close() throws java.io.IOException;
}


*/
