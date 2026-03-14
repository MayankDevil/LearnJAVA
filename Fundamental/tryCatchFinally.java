/*
-	programmer:Mayank
-	./tryCatchFinally.java
*/
/*
- 	finally is last block of trycatch that compulsary to execute.
-	we are skip catch between try finllay than finally first execute after expection execute.
-	we are not use finally without try.
-	we are use only once finally with one try statement.

[ syntax ]

	try{ //exception code }catch(ExceptionClass error_object){ //handling code }finally{ //compulsary code }

*/
class Test
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(3/0);
		}
		catch(java.lang.ArithmeticException error)
		{
			System.out.println("ZERO IS NOT DIVIDE BY ANY NUMBER, SIR");
		}
		catch(java.lang.Exception error)
		{
			System.out.println("UNSEENED ERROR "+error);
		}
		finally
		{
			System.out.println("PROGRAM HAVE SOME EXCEPTION");
		}
		System.out.println("execute");
	}
}
/*
[ Output ]================================================
PROGRAM HAVE SOME EXCEPTION
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Test.main(tryCatchFinally.java:21)
// -------------------------------------------------------
ZERO IS NOT DIVIDE BY ANY NUMBER, SIR
PROGRAM HAVE SOME EXCEPTION
execute
// -------------------------------------------------------
tryCatchFinally.java:31: error: 'finally' without 'try'
		finally
		^
1 error


*/
