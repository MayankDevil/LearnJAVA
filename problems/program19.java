/*
-   programmer:MayankDevil
-   19. Write a Java program to convert seconds to hours, minutes, and seconds
*/ 
class Test
{
    public static void main(String args[])
    {
        int seconds = 240000;

        System.out.println("seconds "+seconds+" minutes"+(seconds / 60)+"hours"+((seconds / 60) / 60));
    }
}
// the end