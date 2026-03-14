/*
-   programmer:MayankDevil
-   31. Java Program to find area of rhombus
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter the diagonal 1:");

        double n1 = input.nextDouble();

        System.out.println("Enter the diagonal 2:");

        double n2 = input.nextDouble();

        /* area of rhombus is [ diagonal square / 2 ] */ 

        System.out.println("Area of Rhombus is: " +((d1 * d2) / 2));
    }
}
// the end