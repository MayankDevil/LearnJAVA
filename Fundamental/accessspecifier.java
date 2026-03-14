/*
-	programmer:Mayank
-	./accessspecifier.java
*/

//public class AccessSpecifier
public class accessspecifier
{

}
//protected class Hello
class Hello
{
	public int x = 6;
	private int n = 5;

	protected void display()
	{
		System.out.println("private n access : "+n);
	}
}
class Test
{
	public static void main(String args[])
	{
		Hello hello = new Hello();

		hello.display();

		System.out.println("public x access : "+hello.x);

//		System.out.println(hello.n);
	}
}
/*
-	AccessSpecifier is the define access control mean scope of all classes, functions and variables.
-	it is keywords they use before classes and they members (not include default).

	Java 4type AccessSpecifier in order (lowest to highest) scope =
	[
		1 : private
		2 : default
		3 : protected
		4 : public
	]

								SamePackage							OtherPackage
									|									|
					---------------------------------				-----------------
					|				|				|				|				|

	Access		SameClass		SubClass		OtherClass		SubClass		OtherClass

	private			X				-				-				-				-

	default			X				X				X				-			 	-

	protected		X				X				X				X			 	-

	public 			X				X				X				X			 	X

[ important ]

-	private is very small scope only self class.
-	default is not any keyword.
-	if you are not default any accessspecifier is be default.
-	public class is once in one source_file.
-	public class have be same name of source_filename.

*/
/*
[ Output ]==================================================

accessspecifier.java:6: error: class AccessSpecifier is public, should be declared in a file named AccessSpecifier.java
public class AccessSpecifier
       ^
accessspecifier.java:10: error: modifier protected not allowed here
protected class Hello

accessspecifier.java:21: error: modifier private not allowed here
private class Test
        ^
accessspecifier.java:32: error: n has private access in Hello
		System.out.println(hello.n);
		                        ^
4 errors

------------------------------------------------------------
private n access : 5
public x access : 6


*/
