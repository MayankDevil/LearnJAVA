/*
-	programmer : Mayank
-	./inheritance.java
*/
class SuperClass
{
	int n1,n2;

	int plus(int n1, int n2)
	{
		return (n1 + n2);
	}
}
class SubClass extends SuperClass
{
	void result()
	{
		n1 = 5;
		n2 = 1;

		System.out.println(" sum of "+n1+" and "+n2+" is "+plus(n1,n2));
	}
}
class Test
{
	public static void main(String args[])
	{
		SubClass sub = new SubClass();

		sub.result();
	}
}
/*
-	inheritance is technique to extends one class to another class and make change inside
-	inheritacne always need more than one class first super_Class that we -extends- with sub_Class
-	we use extends keyword to inherit one class in sub_Class
-	in java one sub class have only one super class
-	one super_class have mutliple sub_class.
-	we are aquire and change superclass member in subclass without object
*/
