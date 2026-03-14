/*
-	programmer:Mayank
-	./throws.java
*/
class Test
{
	public static void main(String args[]) throws Exception
	{
//		System.out.println(args[0]); // comipler unchecked exception

		char x = (char) System.in.read();

		System.out.println(x);
	}
}
/*
-	Exception is the run time error that break control or execution of program.
-	So handling those exception java have mutliple inbuild classes that called exception class.
-	Inbuild Exception class Twotype =
	{
		CHECKED :
		those exception for the java compiler enfore to hand you.

		UNCHECKED :
		those exception for the java compiler not force to hand you.
	}

-	throws clause is exception handling mechanisum.
-	throws is overpass the compiler exception detecting.

[ syntax ] :

	returntype functionName() throws ExceptionClassName { //code }

*/

/*
[ Output ]======================================================

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at Test.main(throws.java:9)
----------------------------------------------------------------

throws.java:11: error: unreported exception IOException; must be caught or declared to be thrown
		char x = (char) System.in.read();
		                              ^
1 error

----------------------------------------------------------------
6
6

*/
