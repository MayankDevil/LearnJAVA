/*
-   programmer:MayankDevil
-   8. Write a Java program to convert a binary number to decimal number
*/ 
class Test
{
    public static void main(String args[])
    {
        String binary = "1010011";  // binary number

        // in-build function Integer wrapper class  binary to decmial return integer

        int decimal = Integer.parseInt(binary, 2);

        System.out.println(binary+" binary to decmial is "+decimal); // convert to decmial
    }
}
// the end