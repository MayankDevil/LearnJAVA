/*
-	programmer:Mayank
-	./array,java
*/
/*
-	array is special type vairable that can store inside mutiple value.
-	in java all value same datatype.
-	the value is control by index number.
-	index started by index[0] 'ZERO' number and end (Array Length - 1).
-	in Java array is dynamic that memory allocation in heap memory.

[ syntax ]

	datatype array_name[];	// declartion

	array_name = new dataype[Size]; // memory allocation

	array_name[index] = value;	// assign

[ explain ]

	array make dynamic linklist use reference of next index

	index	[0]	[1]	[2]	[3]
			 |	 |	 |	 |
	value	(9)	(2)	(1)	(1)

*/
class Test
{
	public static void main(String args[])
	{
		int a[]; 	// declartion

		a = new int[3]; 	// memory allocation

		a[0] = 1; 		// assign
		a[1] = 2;
		a[2] = 3;

		try
		{
			for (int i = 0; i < a.length; i++)
				System.out.print("\n index["+i+"] = "+a[i]);
		}
		catch(ArrayIndexOutOfBoundsException error)
		{
			System.out.print(error);
		}

	}
}
/*
[ Output ]==================================================

 index[0] = 1
 index[1] = 2
 index[2] = 3

*/
