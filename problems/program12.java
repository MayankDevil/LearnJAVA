/*
-   programmer:MayankDevil
-   12. Write a Java program to count the letters, spaces, numbers and other characters of an input string
*/ 
class Test
{
    public static void main(String args[])
    {
        String line = "rtx (500) is ready";

        int string_letter = 0;
        int string_space = 0;
        int string_symbol = 0;

        /* compare is equal | greater | less */

        for (char c : line.toCharArray())
        {
            if  (Character.isWhitespace(c))
                string_space ++;
            if (Character.isLetter(c))
                string_letter ++;
            else
                string_symbol ++;
        }

        System.out.println("string "+line.length()+" length "+string_letter+" letter "+string_symbol+" symbol "+string_space+" space");
    }
}
// the end