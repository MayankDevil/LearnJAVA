/*
-   programmer:MayankDevil
-   26. Write a Java program to add all the digits of a given positive integer
*/ 
class Test
{
    public static void main(String args[])
    {
        int n = 12345;

        int num = 0;

        while (n > 0)
        {
            num += n % 10;

            n /= 10;
        }
        System.out.println("sum of digit is "+num);
    }
}
// the end