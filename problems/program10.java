/*
-   programmer:MayankDevil
-   10. Write a Java program and compute the sum of the digits of an integer
*/ 
class Test
{
    public static void main(String args[])
    {
        int n = 0;

        int num = 123;  // take number

        /* if divide any number by 10 return reminder equal to last digit  */

        /* if divide any number by 10 that last digit is zero so zero element */ 

        while (num != 0)
        {
            n += num % 10;   // add the last digit to the n
            num /= 10;      // movet to the next digit
        }

        System.out.println(num+" sum of digit is "+n);
    }
}
// the end