/*
-	programmer:Mayank
-	./jacked_array.java
*/
/*
-	jacked array is array inside array.
-	different index difference size define.
-	it not matrix like structure.

[ syntax ]

	datatype array[][] = new datatype[Size][];	// insalize array

	array[index] = new datatype[Size];
	array[index] = new datatype[Size];		// different index different size
	array[index] = new datatype[Size];

[ explain ]


	{X}	[0]	[1]	[2]

	[0]	(1)	(2)	(3)

	[1]	(4)

	[2]	(5)	(6)

*/
class Test
{
	public static void main(String args[])
	{
		// declare

		int a[][] = new int[3][];

		// memory allocation

		a[0] = new int[3];
		a[1] = new int[1];
		a[2] = new int[2];

		// assign

		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;

		a[1][0] = 4;

		a[2][0] = 5;
		a[2][1] = 6;

		// traversal

		for (int o = 0; o < a[0].length; o++)
			for (int i : a[o])
				System.out.println(i);
	}
}
/*
[ Output ]=================================================
1
2
3
4
5
6

*/
