/*
-	programmer:Mayank
-	./binaryOperator
*/

/*
-	The operator perform operation between two operend that called "binary operator".
-	They are.

[ operator list ]

	* Arithemetic
	* Logical
	* Relation
	* Assignment
	* Bitwise
*/
class Test
{
	public static void main(String args[])
	{
		// Arithmetic Operator

		System.out.println(
			"\n addition "+(1 + 2)+
			"\n subtraction "+(2 - 1)+
			"\n Multiplication "+(2 * 3)+
			"\n Divition "+(9 / 3)+
			"\n Modulas "+(7 % 3)
		);

		// Logical Operator

		System.out.println(
			"\n logical AND "+(true & true)+
			"\n logical OR "+(false | true)+
			"\n logical exclusive OR (XOR) "+(false ^ true)+
			"\n conditional AND "+(true && false)+
			"\n conditional OR "+(true || false)+
			"\n logical negation "+(!(true))
		);

		// Relational Operator

		System.out.println(
			"\n greater than "+(1 > 2)+
			"\n lower than "+(1 < 2)+
			"\n greater and equal to "+(2 >= 3)+
			"\n lower and equal to "+(4 <= 3)+
			"\n equal to "+(2 == 2)+
			"\n not equal to "+(3 != 5)
		);

		// Assignment Operator

		short n1 = 5;

		System.out.println(
			"\n += "+(n1 += 2)+
			"\n -= "+(n1 -= 3)+
			"\n *= "+(n1 *= 3)+
			"\n /= "+(n1 /= 2)+
			"\n %= "+(n1 %= 2)
		);

		// Bitwise Operator

		short x = 20, y = 0xaf;

		short z = -24;

		System.out.println(
			"\n Bitwise AND "+(x & y)+
			"\n Bitwise OR "+(x | y)+
			"\n Bitwise Exclusive "+(x ^ y)+
			"\n Bitwise Complement "+(~x)+
			"\n Bitwise Shift Left "+(x << y)+
			"\n Bitwise Shift Right "+(x >> y)+
			"\n Bitwise Shift Right zero fill "+(x >>> y)
		);
	}
}
/*
[ Output ]==================================

 addition 3
 subtraction 1
 Multiplication 6
 Divition 3
 Modulas 1

 logical AND true
 logical OR true
 logical exclusive OR (XOR) true
 conditional AND false
 conditional OR true
 logical negation false

 greater than false
 lower than true
 greater and equal to false
 lower and equal to false
 equal to true
 not equal to true

 += 7
 -= 4
 *= 12
 /= 6
 %= 0

 Bitwise AND 4
 Bitwise OR 191
 Bitwise Exclusive 187
 Bitwise Complement -21
 Bitwise Shift Left 655360
 Bitwise Shift Right 0
 Bitwise Shift Right zero fill 0


*/
