/*
-	programmer:Mayank
-	./stringBuffer.java
*/
/*
-	StringBuffer is class in Java that present inside "java.lang.StringBuffer" package.
-	StringBuffer class object value is mutable.
-	it only store in heap memory.
-	in it value assign by constructor with function.

[ syntax ]

	StringBuffer object_name = new StringBuffer("string value");

*/

class Test
{
	public static void main(String args[])
	{
		StringBuffer a = new StringBuffer("first");

		System.out.println(a+" length is "+a.length());

		a.append("second");

		System.out.println(a+" charAt 4 "+a.charAt(4));

		a.setCharAt(4,'i');

		System.out.println(a.charAt(4));

		a.replace(0,5,"third");

		System.out.println(a);

		System.out.println(a.reverse());

		StringBuffer b = a;	// string buffer reference pass

		System.out.println(" a equals( b ) "+a.equals(b));


		String c = "four";

		String d = c; // string d = c

		System.out.println(" c equals( d )"+c.equals(d));

		System.out.println(" c equals( a )"+c.equals(a));

//		c = b; // error: incompatible types: StringBuffer cannot be converted to String

		System.out.println(" a equals( c )"+a.equals(c));

		a.delete(0,a.length());

		System.out.println(a);
	}
}
/*
[ Output ]=====================================================
first length is 5
firstsecond charAt 4 t
i
thirdsecond
dnocesdriht
 a equals( b ) true
 c equals( d )true
 c equals( a )false
 a equals( c )false

*/
