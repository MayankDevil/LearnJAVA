/*
-   programmer:MayankDevil
-   28. Java Program to find area of rectangle
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print(" enter length  = ");

        float l = input.nextFloat(); 
        
        System.out.print(" enter breath  = ");

        float b = input.nextFloat(); 

        /* area of rectangle is [ length * breath]*/ 

        System.out.println("area of rectangle is "+(l * b));
    }
}
// the end