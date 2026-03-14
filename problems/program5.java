/*
-   programmer:MayankDevil
-   5. Write a Java program that takes five numbers as input to calculate and print the average of the numbers
*/ 
class Test
{
    public static void main(String args[])
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int n = 0;

        for (int i = 0; i < 5; i++)
            n += input.nextInt();
        
        System.out.println("average of number is "+(n/5));
    }
}
// the end