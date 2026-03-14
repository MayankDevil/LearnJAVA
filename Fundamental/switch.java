/*
-	programmer:Mayank
-	./switch.java
*/
class Test
{
	public static void main(String args[])
	{
		int n = 0, n1 = 2, n2 = 3;

		switch (3)
		{
			case 1 : n = n1 + n2; break;

			case 2 : n = n1 + n2; break;

			case 3 : n = n1 + n2; break;

			case 4 : n = n1 + n2; break;

			case 5 : n = n1 + n2; break;

			default : n = 0;
		}
		System.out.println(n);
	}
}
/*
-	switch is control statement that control flow of execution.
-	it use if we are compare case value then execute code.
-	we are use "break" keyword for stop for execute next case.
-	we have "default" case in last that execute if not case work.
-	but we are use also create some code with the help of "nested if else".

[ syntax ]

	switch (expression) { case value : //code break; case value : //code break; ... defautl : //code }

[ control flow ]

	1.check switch expression.
	2.match case first to last.
	3.if case match execute code.
	4.if not any case match execute default.

*/
