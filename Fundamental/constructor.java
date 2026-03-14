/*
-	constructor is special type function of class without any return type
-	it call by create object of class
-	in java constructor have must in class if program not create any constructor compiler create public accessifer default constructor
-	if program define any constructor so compiler never create any constructor in bytecode
- 	we are not create object without constructor
-	constructor are three type
*/


class A
{
	A()
	{
		System.out.println(" class A default constructor ");
	}
	// if we are not create default constructor so we are not use class without pass arguments in construcotor
}
class Test
{
	public static void main(String args[])
	{
		new A(); // call default constructor
	}
}
