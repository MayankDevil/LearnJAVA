/*
-   programmer:MayankDevil
-   25. Write a Java program to add two numbers without using any arithmetic operators
*/ 
class Test
{
    public static void main(String args[])
    {
        int n1 = 4;
        int n2 = 4;

        int n;
        
        while (n2 != 0) 
        {
            n = n1 & n2;
            System.out.println(n);
            n1 = n1 ^ n2;
            System.out.println(n1);
            n2 = n << 1;
            System.out.println(n2);
        }
        System.out.println("The sum of the two numbers is "+n1);
    }
}
// the end