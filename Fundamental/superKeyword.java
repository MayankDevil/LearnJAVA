/*
-	programmer : Mayank
-	./super.java
*/
class SuperClass
{
	SuperClass()
	{
		System.out.println(" in SuperClass \n o value is "+o+"\n datatype o is "+x);
	}
	int x = 10;
	int o = 12;
}
class SubClass extends SuperClass
{
	SubClass()
	{
		System.out.println(" in SubClas \n o vlaue is "+o+"\n x datatype is "+x+"\n super.o value is "+super.o+"\n suerp.x datatype is "+super.x);
	}
	char x = 'A';
	int o = 10;
}
class Test
{
	public static void main(String args[])
	{
		new SubClass();
	}
}
/*
-	super keyword is use for call superclass vairable that overwrite in subclass.
-	it compulsoary to inheritence.
-	it use to super keyword before variable is overwrite datatype else value.
*/
