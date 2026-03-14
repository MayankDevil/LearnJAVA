/*
-	programmer:Mayank
-	./2d_array.java
*/
/*
-	2D Array is method to store array inside multiple array.
-	it array have two dimentaional array (row and column).
-	2d array is dynamic in Java.
-	default value is set.

[ syntax ]

	datatype array_name[][];		// declartion

	array_name = new datatype[][];		// memory allocation

	array_name[index][index] = value;		// assign

[ explain ]


	in 2Dimenstional Array we have row inside column

		 [0]	[1]		[2]
		  |		 |		 |
	[0] {(1)	(2)		(3)}

	[1] {(4)	(5)		(6)}

	[2] {(7)	(8)		(9)}

	[0][1] = 2
	[2][2] = 9

*/
class Test
{
	public static void main(String args[])
	{
		int a[][];

		a = new int[3][3];

		a[0][0]	= 1;
		a[0][1]	= 2;
		a[0][2]	= 3;

		a[1][0]	= 4;
		a[1][1]	= 5;
		a[1][2]	= 6;

		a[2][0]	= 7;
		a[2][1]	= 8;
		a[2][2]	= 9;

		for (int o = 0; o < a.length; o++)
			for (int i = 0; i < a[o].length; i++)
				System.out.println("index["+o+"]["+i+"]"+a[o][i]);

	}
}
/*
[ Output ]================================================
index[0][0]1
index[0][1]2
index[0][2]3
index[1][0]4
index[1][1]5
index[1][2]6
index[2][0]7
index[2][1]8
index[2][2]9

*/
