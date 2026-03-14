/*
-	programmer:Mayank
-	./staticVariable.java
*/
class Hello
{
	static int n = 0;

	int num = 0;

	void display()
	{
		System.out.println("\n hello system "+(Hello.n+5));
	}
}
class Test
{
	public static void main(String args[])
	{
		Hello object_one = new Hello();

		Hello object_two = new Hello();

		Hello.n = 1;

		object_two.n = 2;

		// Hello.num = 11;		// not access without object

		object_one.num = 3;

		object_two.num = 4;

		System.out.println(
			" Hello n value is "+Hello.n+
			"\n Hello object two n value is "+object_two.n+
			"\n Hello object one num value is "+object_one.num+
			"\n Hello object two num value is "+object_two.num
		);

		object_two.display();
	}
}
/*
-	static is keyword in java that mean comman for all.
-	there is only one copy of static field in a class which is shared among all the object of the class.
-	a static field can be accessed before any object of a class is created, without reference to any object.

[ example ]

	class_name.static_field

-	To make a static constant in Java, make a variable as both static and field.

[ syntax ]

	final static datatype variable_name = value;

*/
