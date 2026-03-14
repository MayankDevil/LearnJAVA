/*
- programmer : Mayank
- ./method_override.java
*/

class SuperClass
{
	void display()
	{
		System.out.print(4+5);
	}
}
class SubClass
{
	void display()
	{
		System.out.println("override function functionality");
	}
}
class Test
{
	public static void main(String args[])
	{
		new SubClass().display(); // anonymous function that not any variable track reference
	}
}
/*
-	it is use to update or chagne function functionality.
-	overrideing is method to change superclass function functionality in subclass.
-	method override is require inhertance.
-	require same { returntype | functionname | arugments }.
-	but accesspecifer require same or higher.

[ syntax ]

	same_or_higher_accessspecifer samereturntype samefunctionname(samearguments){ // override code }

*/
