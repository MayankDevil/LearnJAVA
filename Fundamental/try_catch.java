/*
-	programmer:Mayank
-	./try_catch.java
*/
/*
-	try catch block is use for handling {Checked OR Unchecked} both Exceptions.
-	try block inside programmer write exception code and stop to crase program.
-	catch function that use to exception handling.
-	catch function take arugments as "java.lang.Exception";
-	we are use multiple  try catch in one program.
-	we are use multiple catch function with one try.

[ syntax ]

	try{ //exception code }catch(ExceptionClass error_object){ //handling  }

[ follow control ]

	1.if try block code cause exception  control goto catchfunction.
	2.catch funtion check if exception class handle exception.
	3.if handle so execute catch block else go next catch function.
	4.if exception handled so control follow try ctach last end block out side.

*/
class Test
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(args[0]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException error)
		{
			System.out.println(" PLEASE PASS ARGUMENT AT INTERATE TIME");
		}
		catch(Exception error)
		{
			System.out.println(" UNSEEN ERROR "+error);
		}
		System.out.println(" execute");
	}
}
/*
[ Output ]=======================================================
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at Test.main(try_catch.java:24)

// --------------------------------------------------------------
 PLEASE PASS ARGUMENT AT INTERATE TIME
 execute

*/
