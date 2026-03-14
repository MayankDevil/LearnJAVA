
package java5;

class Class_Enum 
{
    public Class_Enum() 
    {
        Planet planet = Planet.EARTH;
        
        if(planet==Planet.EARTH)
        {
            System.out.println("ordinal "+planet.ordinal()+" name  "+planet.name()+" hashCode "+planet.hashCode());
            System.out.println(""+planet.data);
        }
    } 
}

enum Planet
{
    MERCURY("first planet"),
    VENUS("second planet"),
    EARTH("She is the my motherland and i live in "),
    MARS("fouth planet"),
    JUPITER("fifth planet"),
    SATURN("sixth planet"),
    URANUS("seventh planet"),
    NEPTUNE("eight planet"),
    PLUTO("last planet");
    String data;
    Planet(String data)
    {
        this.data=data;
    }
}