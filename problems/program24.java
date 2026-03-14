/*
-   programmer:MayankDevil
-   24. Write a Java program to check if a positive number is a palindrome or not
*/ 
class Test
{
    public static void main(String args[])
    {
        int number = 1233210;    // get number

        int original_number = number;   // save number as is it
        
        int reverse_number = 0;     // reverse number 

        /* reverse number */
        
        while (number > 0)
        {   
            reverse_number *= 10 + (number % 10);   // add last digit
            
            number /= 10;  // remove last digit
        }
        
        /* if number equal to self after reverse is called palindrome */
        
        if (original_number == reverse_number)
            System.out.println(original_number + " is a palindrome number.");
        else
            System.out.println(original_number + " is not a palindrome number.");
    }
}
// the end