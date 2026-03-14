/*
-	programmer:Mayank
-	./package.java
*/

package mypackage;

import java.lang.Integer;

class Test
{
	public static void main(String args[])
	{
		java.lang.String number = "10";

		System.out.println((Integer.parseInt(number) + 2));
	}
}
/*
-	packages are the collection of classes, interfaces and other packages.
-	a pakages can havae multiple classes and multiple interface.
-	all the inbuild packages are lowercase.
-	by default package is imported in ever source file that is ( java.lang.* ).
-	The represent package is two why.

	1.Qualified Name :
	- in it use to we define all path with interface or class.
	- with it compiler find the full calss path of bytecode.

	[ syntax ]

		new java.util.Scanner(System.in).nextLine();

	[]

	2.UnQualified Name :
	- in it use import keyword add all class or interface with your source_file.
	- it is use beforbegin of all source_code and afterend of package_name.

	[ syntax ]

		import java.util.Scanner;	// call single bytecode
		import java.util.*;			// call all in package
*/
// ------------------------------------------------------------------------
/*
-	we also create programmer define package.
-	first line of souce_code use keyword [ package package_name; ].
-	we are make multiple source_file with in same package.
-	but don't use samename (class or interface) in same pacakge it overwrite first.
-	package is treit like directory.
-	package define file compile use { javac -d / source_file.java  }.
*/

/*
 [ output ]==================================

12
$ tree
.
├── mypackage
│   └── Test.class
├── README.md
└── package.java

2 directories, 34 files

*/
