/*
- programmer : Mayank
- ./class_and_object.java
*/
class A
{
	int n; // instance variable : that is comman for  member function and it default value is set by javac

	/*
		integer 	0
		float  		0,0
		charactor 	' '
		boolean		false
	*/

	void f()
	{
		n = 10;
	}
}
class B
{
	void f()
	{
		int n; // local variable : that declare in any function have not any default value.
		n = 12; // that not print without assign any value.
	}
}
class C
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();

		a.f();
		b.f();

		System.out.println(" a.n "+a.n);
	}
}
/*
-	class is blue print of any object that have locate memory by create object.
-	class is also is collection of member variables or functions,
-	In java class is also a datatype.
-	object is real entity the is represent class in real world.
-	in java object not take address of class it take only reference of class that make classes secure.

[ syntax ]

	ClassName refference_variable = new Constructor();

-	we are directory call class member by object.

[ syntax ]

	new Constructor().member;

*/
