/*
-	programmer:Mayank
-	./staticMethod.java
*/

/*
-	a static method should be called using the class name rather than an object reference variable.
-	a static method is good for a utility method that doesn't depend upon a particular instance variable value.
-	a static method cn neither access a non-static field a non static method.
-	if you have a class with only static methods and yoiu don't want the class to be instantiated, you can mark the constructor private.
*/
class Hello
{
	static int n1 = 1;

	int n2 = 2;

	static void display1()
	{
		System.out.println(n1);
	}

	void display2()
	{
		System.out.println(n1+n2);
	}
}
class Test
{
	public static void main(String args[])
	{
		Hello.display1();

		// Hello.display2();

		new Hello().display2();
	}
}

/*
[ Output ]=============================================
staticMethod.java:27: error: non-static method display2() cannot be referenced from a static context
		Hello.display2();
		     ^
1 error
// ----------------------------------------------------
staticMethod.java:13: error: non-static variable n2 cannot be referenced from a static context
		System.out.println(n1+n2);
		                      ^
1 error
// ----------------------------------------------------
1
3

*/
