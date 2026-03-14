/*
-   programmer:MayankDevil
-   14. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
*/ 
class Test
{
    public static void main(String args[])
    {
        System.out.println("enter number = ");

        int n = new java.util.Scanner(System.in).nextInt(); // get input number

        for (int o = 1; o <= n; o++)    /* outer loop : 1 to number */
        {
            for (int i = 0; i <o; i++)  System.out.print("n");  /* inner loop : 0 to outer & print n */
            
            if (o != n) System.out.print("+");  /* if outer not equal to number */
        }
    }
}
// the end