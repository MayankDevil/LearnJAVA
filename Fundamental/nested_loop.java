/*
-	porgrammer:Mayank
-	./nested_loop.java
*/
/*
-	the nested loop is just loop inside loops.
-	if inner loop stop then control repeat outer loop.
-	if inner loop is infinate so outer loop will be never execute.
*/
class Test
{
	public static void main(String args[])
	{
		boolean execute = true;

		while (execute)
		{
			for (int i = 0; i < 5; i++)
			{
				if (i == 3)
				{
					execute = false;
				}
				else
				{
					System.out.println(i);
				}
			}
		}
	}
}

/*
[ Output ]======================================================
0
1
2
4
*/

