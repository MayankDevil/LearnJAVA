/*
-   programmer:MayankDevil
-   30. Java Program to find area of equilateral triangle
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print(" enter base  = ");

        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("The area of the equilateral triangle is " + area);
    }
}
// the end