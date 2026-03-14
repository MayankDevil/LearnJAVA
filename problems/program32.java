/*
-   programmer:MayankDevil
-   32. Java Program to find area of parallelogram
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter the base:");

        double b = input.nextDouble();
        
        System.out.println("Enter the height:");
        
        double h = input.nextDouble();

        /* area of parallelogram is [ base * height ] */
        
        System.out.println("Area of Parallelogram is: "+(b * h));
    }
}
// the end