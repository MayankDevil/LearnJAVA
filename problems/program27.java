/*
-   programmer:MayankDevil
-   27. Java program to find area of circle
*/ 
class Test
{
    public static void main(String args[])
    {
        System.out.print(" enter radius of circle  = ");

        float radius = new java.util.Scanner(System.in).nextFloat();

        /* area of circle is [ pi * radius square]*/ 

        System.out.println("area of circle is "+(3.14 * radius * radius));
    }
}
// the end