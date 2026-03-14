/*
-	programmer : Mayank
-	./method_overload.java
*/
class Test
{
	Test()
	{
		System.out.println("hello ");
	}
	Test(boolean args)
	{
		System.out.println(" hello true ");
	}
	public static void main(String args[])
	{
		Test t = new Test();

		new Test(true);

		System.out.println(t.punk(2));
		// System.out.println(t.punk(2));
		System.out.println(t.punk(2,3));
	}
	int punk(int n)
	{
		return (n + 1);
	}
	/*float punk(int n)
	{
		return (n);
	}*/
	float punk(int n1, int n2)
	{
		return (n1 / n2);
	}
}
/*
-	overload is situation than over method is fail by arguments.
-	so solving this problem we create overloading function accroding to arguments.
-	we are create multiple function with same name but different arguments and different return type.
-	it compiler responsiblity to select funtion according arguments.

-	contructor is also a function that we are protect to overload
*/
