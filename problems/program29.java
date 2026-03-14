/*
-   programmer:MayankDevil
-   29. Java Program to find area of triangle
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print(" enter base  = ");

        float b = input.nextFloat(); 
        
        System.out.print(" enter height  = ");

        float h = input.nextFloat(); 

        /* area of triangle is [base * hegiht / 2]*/ 

        System.out.println("area of triangle is "+((b * h) / 2));
    }
}
// the end