/*
-	programmer:Mayank
-	./nested_if.java
*/
class Test
{
	public static void main(String args[])
	{
		byte n = 3;
		/*
			if set not limit or else part is optional.
		*/
		if (n == 1)
		{
			n = 11;
		}
		if (n == 2)
		{
			n = 22;
		}
		if (n == 3)
		{
			n = 33;
		}
		else
		{
			n = 0;
		}

		System.out.println(n);
		/*
			inner if else use multiple if else is optional
		*/
		if (false)
		{
			if (true)
			{
				n = 12;
			}
		}
		else
		{
			if (true)
			{
				if (false)
				{
					n = 13;
				}
				if (true)
				{
					n = 23;
				}
				else
				{
					n = 10;
				}
			}
			else
			{
				n = 20;
			}
		}
		System.out.println(n);
	}
}
/*
-	nested if else is using multiple "if else" combine.
-	nested ness is two type inner and rooter.
*/
