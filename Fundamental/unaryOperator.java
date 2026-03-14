/*
-	programmer:Mayank
-	./unaryOperator.java
*/
/*
-	if opertor perform operation upon singal operend.
-	we have been only tow unary operator {incremetn & decrement}.

-	Unary increment operator increase 1 value of oprend.

[ syntax ]

	oprend ++;

-	Unary decrement operator decrease 1 value of oprend.

[ syntax ]

	oprend --;
-	you are use also operator before oprend.

*/
class Test
{
	public static void main(String args[])
	{
		int n = 12;

		System.out.println("Increment "+(n++)+" "+(++n)+"\nDecrement"+(--n)+" "+(n--));
	}
}
/*
[ Output ]================================
Increment 12 14
Decrement13 13

*/
