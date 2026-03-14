/*
*	./src/file.java
*/

/*

	a file refers to a specific storage area on media where data can be stored, for example on a harddisk, CD etc.

	The java.io.File class is a utiliy class used for working wiht files and directories.

	PACKAGE java.io.File

	CONSTRUCTOR : 4 public consturctor

		File(String pathname)

		File(String pathname, String filename)

		File(java.io.File dir, String filename)

		File(java.net.URI)
		
	LIMITATIONS: While File provides basic file operations, it has some limitations, such as not providing support for asynchronous I/O, file locking, or symbolic links.

*/

class File
{
	public static void main(String args[])
	{
	    java.io.File file;
        
        file = new java.io.File("my.txt");
        
	    
	    // isFile() return true else false
	    
	    // isDirectory() return true else false
	    
	    // is Hidden() return true else false
	    
	    if (file.isFile())
	    {
	        /* boolean exists() that return true if file exist otherwise false  */

		    if (!file.exists())
	        {
	            try
	            {
	                file.createNewFile(); // create new file
	            }
	            catch(java.io.IOException error)
	            {
	                System.out.println("\n_[file not found]");
	            }
	        }
            
            // getPath(): Returns the pathname string of this abstract pathname.
            // getAbsolutePath(): Returns the absolute pathname string of this abstract pathname.
            // getCanonicalPath(): Returns the canonical pathname string of this abstract pathname.
	        
	        System.out.println("\nfile path : "+file.getPath()+"\n absolute path : "+file.getAbsolutePath());
	        
	        // getParent() return parent folder name as string
	        
	        System.out.println("parent folder is "+file.getParent());
	    
	        System.out.println("this is file ...");
	        
	        // canRead() return true if readable
	        
	        // boolean setReadable(boolean) return ture if set Readable as true
	        
            if (file.setReadable(false))
            {
                System.out.println("file read "+file.canRead());	                
            }
            
            // canWrite() return true if writeable
            
            // boolean setWritable(boolean) return true if set Writable as true
            
            if (file.setWritable(false))
            {
                System.out.println("file write "+file.canWrite());
            }
            
            // canExecute() return true if executable
            
            // boolean setExecutable(boolean) return true if set Executable as true
	        
	        if (file.setWritable(false))
            {
                System.out.println("file execute "+file.canExecute());
            }
	        
	    }
        else if (file.isDirectory())
        {
            System.out.println("this is directory ...");
            
            // file.listFiles() return java.io.File array of files or directories
            
            // file.list() return java.lang.String array of files or directories
            
            for (String i : file.list())
            {
                System.out.println(i);
            }
            
            // mkdir(): Creates the directory named by this abstract pathname.
            
            // mkdirs(): Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
 
            file.mkdirs();
            
            // return space information as long
            
            System.out.println("total space "+file.getTotalSpace()+"byte free space "+file.getFreeSpace()+"byte used space "+file.getUsableSpace()+"byte");
        }
        else if (file.isHidden())
        {
            System.out.println("this is hidden ...");
        }
        
        System.out.println(" last modified "+file.lastModified());
        
        
        // true if file name rename or it take java.io.File
		
		if (file.renameTo(new java.io.File(".//me.md")))
		{
		    System.out.println("file rename ..."+file.getName()); // return reference object file name as string
		}
		
		// delete() return true if delete
		
		// if (file.delete()) System.out.println("file deleted ...");
		
		// file.setReadOnly(); // only read this not write
		
		file.deleteOnExit();    // used a file or directory for deletion when the JVM exits
	}
}

/*
Compiled from "File.java"
public class java.io.File implements java.io.Serializable, java.lang.Comparable<java.io.File> {
  public static final char separatorChar;
  public static final java.lang.String separator;
  public static final char pathSeparatorChar;
  public static final java.lang.String pathSeparator;
  static final boolean $assertionsDisabled;
  final boolean isInvalid();
  int getPrefixLength();

  public java.io.File(java.lang.String);
  public java.io.File(java.lang.String, java.lang.String);
  public java.io.File(java.io.File, java.lang.String);
  public java.io.File(java.net.URI);

  public java.lang.String getName();

  public java.lang.String getParent();

  public java.io.File getParentFile();

  public java.lang.String getPath();

  public boolean isAbsolute();

  public java.lang.String getAbsolutePath();

  public java.io.File getAbsoluteFile();

  public java.lang.String getCanonicalPath() throws java.io.IOException;

  public java.io.File getCanonicalFile() throws java.io.IOException;

  public java.net.URL toURL() throws java.net.MalformedURLException;
  public java.net.URI toURI();

  public boolean canRead();
  public boolean canWrite();
  public boolean exists();

  public boolean isDirectory();
  public boolean isFile();
  public boolean isHidden();

  public long lastModified();
  public long length();
  public boolean createNewFile() throws java.io.IOException;
  public boolean delete();
  public void deleteOnExit();

  public java.lang.String[] list();
  public java.lang.String[] list(java.io.FilenameFilter);

  public java.io.File[] listFiles();
  public java.io.File[] listFiles(java.io.FilenameFilter);
  public java.io.File[] listFiles(java.io.FileFilter);

  public boolean mkdir();
  public boolean mkdirs();

  public boolean renameTo(java.io.File);
  public boolean setLastModified(long);
  public boolean setReadOnly();
  public boolean setWritable(boolean, boolean);
  public boolean setWritable(boolean);

  public boolean setReadable(boolean, boolean);
  public boolean setReadable(boolean);

  public boolean setExecutable(boolean, boolean);
  public boolean setExecutable(boolean);
  public boolean canExecute();

  public static java.io.File[] listRoots();
  public long getTotalSpace();
  public long getFreeSpace();

  public long getUsableSpace();

  public static java.io.File createTempFile(java.lang.String, java.lang.String, java.io.File) throws java.io.IOException;
  public static java.io.File createTempFile(java.lang.String, java.lang.String) throws java.io.IOException;

  public int compareTo(java.io.File);

  public boolean equals(java.lang.Object);

  public int hashCode();
  public java.lang.String toString();
  public java.nio.file.Path toPath();
  public int compareTo(java.lang.Object);
  static {};
}
*/
