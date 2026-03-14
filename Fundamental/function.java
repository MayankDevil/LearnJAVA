/*
- programmer : mayank
- ./function.java
*/
class Test
{
	public static void main(String args[])
	{
		Test t = new Test();

		t.null_function();

		t.perimeter_function(true);

		System.out.println(return_function());
	}
	void null_function()
	{
		System.out.println("just execute code");
	}
	void perimeter_function(boolean arguments)
	{
		System.out.println("if pass argument that it call");
	}
	static int return_function()
	{
		return 3;
	}
}
/*
-	function is set of code in bloack that have name.
-	in java we have not declare function we complusary to define, not in case interface.
-	we are not call non-static funtion without object.
-	we are called mutliple time one function.
-	we only call function inside the function.
-	default accesspecifier is [ defualt ] type.

[ syntax ]

	accesspecifer returntype function_name(datatype argument,...){ //code }

-	we have three type function.
	1. void function : that return type void mean null.
	2. perimeter function : that call we can pass arguments.
	3. return function : that return some data.

*/
