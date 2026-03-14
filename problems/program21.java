/*
-   programmer:MayankDevil
-   21. Write a Java program to swap the first and last elements of an array and create a new array
*/ 
class Test
{
    public static void main(String args[])
    {
        int a1[] = new int[4];

        int a2[] = new int[4];

        int n = 0;  // default number

        // asign index value

        a1[0] = 3;
        a1[1] = 6;
        a1[2] = 9;
        a1[3] = 0;

        for(int i : a1) System.out.println(i);  // before traversal

        // set array 2 value against array 1
        
        for (int i = 0; i < a1.length; i++) a2[i] = a1[i];  

        // swap array first or last index

        n = a2[0];

        a2[0] = a2[a2.length - 1];
        
        a2[a2.length - 1] = n;

        for(int i : a2) System.out.println(i);  // after traversal
    }
}
// the end