/*
-	programmer:Mayank
-	./byteOriented.java
*/
/*
-	byte Oriented Input mean Input in binary (0 & 1).
-	byte Oriented Superime (top most) classes are InputStream and OutputStream
[ syntax ]

	public abstract class java.io.InputStream implements java.io.Closeable {}

	public abstract class java.io.OutputStream implements java.io.Closeable, java.io.Flushable {}

-	byte Oriented Superime Classes in "java.io" package.
-	both abstract classes but they object present in "java.lang.System".

[ syntax ]

	public static final java.io.InputStream in;

	public static final java.io.OutputStream out;

-	Byte oriented method take all datatype Input not include (charactor).
-	Byte oriented input take by Scanner class.

[ syntax ]

	new java.util.Scanner(System.in).next();
	
-   System  : is class inside "java.lang" package
-   out     : is object of jva.io.OutputStream 
-   print   : is function of OutputStream class

*/
class Test
{
	public static void main(String args[])
	{
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("\n enter number = ");

		int n = input.nextInt();

		System.out.print("\n enter decimal = ");

		float f = input.nextFloat();

		System.out.print("\n enter string = ");

		String s = input.next();

		System.out.print("\n enter boolean = ");

		boolean b = input.nextBoolean();

		System.out.println(" "+n+" "+f+" "+s+" "+b);
	}
}
/*
[ Output ]========================================================
 enter number = 1
 enter decimal = 0.1
 enter string = hello sir
 enter boolean = flase
 1 0.1 hello false
*/
