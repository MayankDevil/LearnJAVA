/*
- programmer : Mayank
- ./datatype.java
*/
class Test
{
	public static void main(String args[])
	{
		byte byte_datatype = 1;
		short short_datatype = 12345;
		int int_datatype = 91252222;
		long long_datatype = 232332131;

		float float_datatype = 100.0099f;
		double double_datatype = 2323.00001;

		char char_datatype = 'x';

		boolean boolean_datatype = true;

		System.out.println(
			"\n"+byte_datatype+
			"\n"+short_datatype+
			"\n"+int_datatype+
			"\n"+long_datatype+
			"\n"+float_datatype+
			"\n"+double_datatype+
			"\n"+char_datatype+
			"\n"+boolean_datatype
		);
	}
}
/*

DataType
|
----------------
|              |
Primative      Reference ------------------
(build-in)     (drived)                   |
|                                         --- array
--------------                            |
|            |                            --- class
Numerical     Boolean -------- boolean    |
|                                         --- interface
-----------
|         |
Integral  floatingpoint -----------
|                                 |
------------                      |
|          |                      |
Integer    Character -------      --------
|                          |      |      |
--------------------       |    float   double
|      |      |    |       |
byte   short  int  long    char

-------------------------------------------------------

datatype	size	values

byte 		1byte	integer
short		2byte	integer
int			4byte	integer
long		8byte	integer
float		4byte	real
double		8byte	real
char		2byte	charactor
boolean		1bit	true|false

*/
