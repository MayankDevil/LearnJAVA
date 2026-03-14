/*
-	programmer : Mayank
-	./final.java
*/

// final class SuperClass
class SuperClass
{
	final int i = 12;

	final function display()
	{}
}
class SubClass extends SuperClass
{
	function display()
	{
		System.out.println(" not override final function"+i);
	}
}
class Test
{
	public static void main(String args[])
	{
		SubClass sub = new SubClass();
		SuperClass sup = new SuperClass();
	}
}
/*
-	final is keyword that mean commitedlast.
-	final use with { class | function | variable }.

-	if we define final class they not be inherit with other class.
-	we only use final class with create object.
-	we are never use abstract or final keyword with together.

-	if we define final function they not override.

-	if we are define final variable they value not be change.

*/
