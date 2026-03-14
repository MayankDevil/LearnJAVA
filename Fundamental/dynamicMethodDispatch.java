/*
-	programmer : Mayank
-	./dynamicMethodDispatch.java
*/
class SuperClass
{
	void display()
	{
	}
}
class SubClass extends SuperClass
{
	void display()
	{
		System.out.println(" i am display ");
	}
	void get()
	{
		System.out.println(" i am get ");
	}
}
class Test
{
	public static void main(String args[])
	{
		SuperClass reference_variable = new SubClass();

		reference_variable.display();

//		reference_variable.get();
	}
}
/*
-	Dynamic Method Dispatch condition require that inheritance.
-	Dynamic Method Dispatch is say that any SuperClass give reference of over SubClass object.
-	but SuperClass reference variable only use your aquire member.
*/
