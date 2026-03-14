/*
-   programmer:MayankDevil
-   7. Write a Java program to convert a decimal number to binary numbers
*/ 
class Test
{
    public static void main(String args[])
    {
        int decimal = 0123; // decminal number

        // in-build function Integer wrapper class decminal to binary return

        String binary = Integer.toBinaryString(decimal);

        System.out.println(decimal+" decimal to binary is "+binary); // convert to binary
    }
}
// the end