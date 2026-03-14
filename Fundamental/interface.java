/*
-	programmer : Mayank
-	,/interface.java
*/
interface MyIdea
{
	void display();
	int n = 10;
}
interface JustIdea
{
	int n = 0;
}
interface CopyIdea extends MyIdea
{
	void display();
}
class Test implements CopyIdea,JustIdea
{
	public void display()
	{
		System.out.println(" JustIdea n is "+JustIdea.n+" MyIdea n is "+MyIdea.n);
	}
	public static void main(String args[])
	{
		// Test t =

		new Test().display();
	}
}
/*
-	interface is idea that collect inside declare public abtract function AND initialize public static final variales.
-	we are not create interface object.
-	we are implements one or multiple interface with class either other interfaces.
-	if we are add interface with class so we are overide all fuction another your class is abstract.

[ syntax ] :

	Accessspecifer class  classname implements Interface,Interface,...{ //code }


-	if we are add interface and superclass in subclass we follow order.

[ syntax ] :

	ACCESSIFER class SubClassName extends SuperClassName implements Interface,Interface,... { //code }

*/

