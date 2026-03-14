/*
-   programmer:MayankDevil
-   35. Java Program to find volume of cylinder
*/ 
class Test
{
    public static void main(String args[])
    {        
        double radius = 2.0;
        
        double height = 4;
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        
        System.out.printf("The volume of the cylinder is %.2f cubic units.", volume);
    }
}
// the end