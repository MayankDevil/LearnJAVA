/*
-	programmer : Mayank
-	./suerpFunction.java
*/
class SuperClass
{
	int n = 10;

	/*SuperClass()
	{
		System.out.println(" class A ");
	}*/

	SuperClass(boolean code)
	{}
}

class SubClass extends SuperClass
{
	SubClass()
	{
		super(true);
		System.out.println(" class Super "+n);
	}
}

class Test
{
	public static void main(String args[])
	{
		new SubClass();
	}
}
/*
- 	in the case of inheritance

[ explain control ]

	1. call subclass object call to subClass Constructor.
	2. subClass Constructor call to superClass Constructor.
	3. SuperClass Constructor scan SuperClass.
	4. After Scan SuperClass complete constructor code.
	5. Next complete code go back to subclass constructor.
	6. Than subclass constructor scan subclass.
	7. Afterend subclass constructor execute your code.
	8. finally object return sacn classes reference.

-	than we call subclass constructor it call your superclass constructor after firstline of code.
-	if superclass have no default constructor so require call perimeter constructor.
-	super() function is use to call superclass argument constructor.
-	super() always write in the subclass constructor first line.
*/
