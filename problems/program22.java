/*
-   programmer:MayankDevil
-   22. Write a Java program to count the number of even and odd elements in a given array
*/ 
class Test
{
    public static void main(String args[])
    {
        int a1[] = new int[5];

        int odd_num = 0;

        int even_num = 0;

        // asign index value

        a1[0] = 4;
        a1[1] = 6;
        a1[2] = 9;
        a1[3] = 8;
        a1[3] = 5;

        /* if array loop element reminder equal to zero so even else odd */ 

        for (int i : a1) if (i%2 == 0) even_num ++; else odd_num ++;

        System.out.println(" even "+even_num+" odd "+odd_num);  // check value
    }
}
// the end