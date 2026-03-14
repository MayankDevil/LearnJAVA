/*
-   programmer:MayankDevil
-   6. Write a Java program to swap two variables
*/ 
class Test
{
    public static void main(String args[])
    {
        int n1, n2, n; // variables
        
        n1 = 0;
        n2 = 1; 

        // asign value

        System.out.println("n1 = "+n1+" n2 = "+n2); // check value

        // swap to variable

        n = n1;
        n1 = n2;    
        n2 = n;

        System.out.println("n1 = "+n1+" n2 = "+n2); // again check value
    }
}
// the end