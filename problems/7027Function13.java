/*
    13. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false. 
*/
class Test
{
    static boolean isVowel(char character)
    {
        return (character == 'a')? true : (character == 'e')? true : (character == 'i')? true : (character == 'o')? true : (character == 'u')? true : false; 
    }
    static boolean isStringInsideVowel(String line)
    {
        for (int i = 0; i < line.length(); i++)
            if (isVowel(line.charAt(i)))
                return true; 
        return false;
    }
    public static void main(String args[])
    {
        System.out.println(Test.isStringInsideVowel("Mxyz"));

        System.out.println(Test.isStringInsideVowel("hello"));
    }
}