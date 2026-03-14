/*
-	programmer : Mayank
-	./abstract.java
*/
abstract class SuperClass
{
	// abstract void display();
}
class SubClass extends SuperClass
{
	/*void display()
	{
	}*/
}
class Test
{
	public static void main(String args[])
	{
		SubClass sub = new SubClass();

		System.out.println(" execute ");
	}
}
/*
- 	abstract is keyword that mean incompleted.
-	we not create abstract class object.
-	we only use abstract class by inheritance.
-	if inheritance class have abstract funtion so they make your subclass abstract.
-	abstrac keyword use to create abstract function also abstract class.
-	abstract function make class abstract.
-	for unabstract your subclass we complete abstract function by use to function override.
*/
