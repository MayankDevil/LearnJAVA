/*
-	programmer:Mayank
-	./charactorOriented.java
*/

/*
-	charactor oriented Input get Input in charactor form that follow Universal Standared Code.
-	charactor oriented get in charactor datatype Input.
-	charactor oriented superime (top most) classes are Reader and Wirter.

[ syntax ]

	public abstract class java.io.Reader implements java.lang.Readable, java.io.Closeable {}

	public abstract class java.io.Writer implements java.lang.Appendabl, java.io.Closeable, java.io.Flushable {}

-	charactor oriented classes package in "java.io".
-	both classes are abstract.

-	we are get charactor oriented input use BufferedReader class.
-	but java.io.BufferedReader class have not any default constructor.

[ syntax ]

	public java.io.BufferedReader(java.io.Reader, int)

	public java.io.BUfferedReader(java.io.Reader)

{ solution }

-	we have ReaderClass sub class [ InputStreamReader ] that give our super class reference.
-	InputStreamReader have 4 constructor but not any deault contructor.

[ syntax ]

	public java.io.InputStreamReader(java.io.InputStream)

	public java.io.InputStreamReader(java.io.InputStream, java.lang.String) throws java.io.UnsupportedEncodingException

	public java.io.InputStreamReader(java.io.InputStream, java.nio.charset.Charset)

	public java.io.InputStreamReader(java.io.InputStream, java.nio.charsetCharsetDecoder)

-   we are set charactor oriented output by use java.io.PrintWriter class.
-   InputStreamReader have 11 constructor but not any deault contructor.
-   but PrintWriter compalsoury to close()

[ syntax ]

    public java.io.PrintWriter(java.io.Writer);

    public java.io.PrintWriter(java.io.Writer, boolean);

    public java.io.PrintWriter(java.io.OutputStream);

    public java.io.PrintWriter(java.io.OutputStream, boolean);

    public java.io.PrintWriter(java.io.OutputStream, boolean, java.nio.charset.Charset);

    public java.io.PrintWriter(java.lang.String) throws java.io.FileNotFoundException;

    public java.io.PrintWriter(java.lang.String, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;

    public java.io.PrintWriter(java.lang.String, java.nio.charset.Charset) throws java.io.IOException;

    public java.io.PrintWriter(java.io.File) throws java.io.FileNotFoundException;

    public java.io.PrintWriter(java.io.File, java.lang.String) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException;

    public java.io.PrintWriter(java.io.File, java.nio.charset.Charset) throws java.io.IOException;

*/

class Test
{
	public static void main(String args[]) throws java.io.IOException
	{
//		java.io.BufferedReader input = ;

		String myLine = new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).readLine();

        java.io.PrintWriter writer = new java.io.PrintWriter(System.out);

        writer.println("="+myLine);
        
        writer.close();
	}
}
/*
[ Output ]==============================================================
Hello world i am able to read write
=Hello world i am able to read write

*/
