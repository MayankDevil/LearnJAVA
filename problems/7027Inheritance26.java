/*
    26. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape 
*/
abstract class GeometricShape
{
    abstract double area();
    abstract double perimeter();
}
class Triangle extends GeometricShape
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Override
    double area()
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    // Override
    double perimeter()
    {
        return side1 + side2 + side3;
    }
}
class Square extends GeometricShape
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }
    // Override
    double area()
    {
        return side * side;
    }
    // Override
    double perimeter()
    {
        return 4 * side;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        Square square = new Square(2.5);

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}