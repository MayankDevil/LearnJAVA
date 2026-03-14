/*
-	programmer:Mayank
-	./foreach_loop.java
/*
-	foreach loop is special type loop that purpose to execute array.
-	this is execute until to than next reference is not null.

[ syntax ]

	for (datatype element_name : array) { //code }

[ explain ]

	it similear like linked list traversal function

	1.array variable take head node reference.
	2.that arry variable store in element.
	3.and array reference set next index.
	4.after execute to end block.
	5.repeat loop(1) until to next refernce is not null.

*/
class Test
{
	public static void main(String args[])
	{
		int array[] = {1,2,3,4};	// insalize array at time not compulsary set size

		for (int i : array)
		{
			System.out.println(i);
		}

		System.out.println("2D Array");

		int array2[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};						// insalize 2D array at time not compulsary set size

		for (int o = 0; o < array2[0].length; o++)
		{
			for (int i : array2[o])
			{
				System.out.println(i);
			}
		}
	}
}
/*
[ Output ]=================================================
1
2
3
4
2D Array
1
2
3
4
5
6
7
8
9

*/
