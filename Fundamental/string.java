/*
-	programmer:Mayank
-	./string.java
*/

/*
-	String is class in Java that present in "java.lang.String" package.
-	there object are immutable(read-only) one the object has been created there is no way to modify the string of text t represent.
-	Create string object 2 type { implicit & explicit }.

-	Java JVM store string value in "_STRING_CONSTRANT_POOL_" that inside value not (modify or duplicate).
-	not duplicate : if some value give by different variable so string constract pool occur old value refernce that variable also.
-	not modifiy : if some value not referered by any variable in string constract pool that not CLEARED by "garbage collecter".

-	implicit value save in only string constrant pool.

[ syntax ]

	String string_variable_name = "value of string";

-	explicit value save in string constrant pool either save in heap memory.

[ syntax ]

	String object_name = new String("string value");

*/
class Test
{
	public static void main(String args[])
	{
		String a = "First";		// "First" addin _STRING_CONSTRANT_POOL_

		String b, c = "Devil";	// "Devil" addin _STRING_CONSTRANT_POOL_

		a = c;	// "Devil" refernceby A eithervalue "First" presentin _STRING_CONSTRANT_POOL_

		b = a;	// "Devil" refernceby B

		String d = new String("Second");	// "Second" addin _STING_CONSTRANT_POOL_ eitherin Heap Memory

		d = "First"; // "Third" overwrite "Second" in HeapMemory

		/*
			HeapMemory { "First" }
			_STRING_CONSTRANT_POOL_ {"First","Devil","Second"}
		*/

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
/*
[ Output ]========================================
First
First
Devil
Second
// -----------------------------------------------
string.java:36: error: variable c might not have been initialized
		String c = b+c;
		             ^
1 error
// -----------------------------------------------
Devil
Devil
Devil
First

*/

/*
String a = " Hello Dear How are you can you know the meaning of friendship ";
        
System.out.println("Paragraph \t"+a);

System.out.println(
				"\n\n indexOf(\"e\") = "+a.indexOf("e")+"\t indexOf(\" Friend \") ="+a.indexOf("Firend")+
				"\n\n lastIndexOf(\"that\") = "+a.lastIndexOf("that")+"\n\n lastIndexOf(\"e\",4) = "+a.lastIndexOf("e",4)+
				"\n\n length() = "+a.length()+
				"\n\n charAt(1) = "+a.charAt(1)+"\t charAt(4) = "+a.charAt(4)+
				"\n\n concat( \" Friend \" ) = "+a.concat(" Friend ")+"\n\n"                
);

String b = "Welcome";

System.out.println("Word \t"+b);

System.out.println(
					"\n\n equal(\"Welcome\") = "+b.equals("Welcome")+
					"\t equalsIgnoreCase(\"welcome\") = "+b.equalsIgnoreCase("welcome")+
					"\n\n compareTo(\"welcome\") = "+b.compareTo("welcome")+
					"\t compareTo(\"welcome\") = "+b.compareToIgnoreCase("welcome")+
					"\n\n startWith(\"We\") = "+b.startsWith("We")+
					"\t startWith(\"We\",2) = "+b.startsWith("We",2)+
					"\n\n endsWith(\"me\") = "+b.endsWith("me")+
					"\n\n regionMatches(4.\"COME\",1,3) = "+b.regionMatches(4,"COME", 1, 3)+
					"\t regionMatches(true,4,\"come\",1,3) = "+b.regionMatches(true, 4,"come", 1, 3)
);
*/