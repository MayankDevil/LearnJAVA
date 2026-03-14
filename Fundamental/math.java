/*
-	programmer : Mayank
-	./math.java
*/

/*
-   Math class is present in "java.lang" package
-   Math class provides method for comman mathematical operation and constants, offering a utility for numeric calculations
-   Math class only one constructor that private so not create this object
-   Math class all member are static use directly by class_name
*/

class Test
{
    public static void main(String args[])
    {
        // java.lang.Math m = new java.lang.Math(); // only private constructor

        System.out.println(Math.E);

        /* E final static variable : return the base of natural logarithm value 2.718281828459045 */

        System.out.println(Math.PI);

        /* PI final static variable : return the Math PI value 3.141592653589793 */

        System.out.println(Math.abs(0.5));

        /* absolute function abs(x) : return the absolute value of x argument { int long float double } */

        System.out.println(Math.random());

        /* random() function random() : return the pseudo=random number greater than or equal to 0.0 and less than 1.0 */

        System.out.println(Math.round(1.4));

        /* round-of function round() : return before value if x is less x.4 else after value */

        System.out.println("x"+Math.rint(3.5));

        /* round half of even function rint(x) : return banker round of value */

        System.out.println(Math.max(1,0));

        /* maximun function max(x,y) : return the maximum between x and y number */

        System.out.println(Math.min(0,1));

        /* minumn function min(x,y) : return the minumn between x and y number */

        System.out.println(Math.pow(2,3));

        /* power function pow(x,y) : return value of x number that power y */

        System.out.println(Math.sqrt(16));

        /* square root function sqrt(x) : return the square root of x */

        System.out.println(Math.cbrt(9.0));
                                
        /* cube root function cbrt(x) : return the cubroot of x */
        
        System.out.println(Math.log(16));

        /* logarithm function log(x) : return the natural number logarithm (base) of x */

        System.out.println(Math.ceil(7.8));
                                
        /* ceil function ceil(x) : return the smallest integer that is grater than or equal to parameter x */
        
        System.out.println(Math.floor(7.8));
                                
        /* floor function floor(x) : return the largest integer that is less than or equal to parameter x */

        System.out.println(Math.exp(2.0));

        /* exponent function exp(X) : return the natural number e (=2.718) raised to the power of x */

        System.out.println(Math.sin(Math.PI/2));
                                
        /* sin function sin(x) : return the trignometric sine of angle a in radians */
        
        System.out.println(Math.cos(Math.PI/2));
                                
        /* cos function cos(x) : return the trignometric consine of angle a in radians */
                                
        System.out.println(Math.tan(Math.PI/4));
                                
        /* tan function tan(x) : return the trignometric tangent of angle a in radians */
                                
        System.out.println(Math.asin(1));     
        
        /* asin function asin(x) : return the arc sine of y */
                                
        System.out.println(Math.acos(0));
                                
        /* Return the arc cosine of y */
                                
        System.out.println(Math.atan(1));
                                
        /* atan function atan(x ) : return the arc tangent of y */ 

        System.out.println(Math.signum(4.2));

        /* signum function signum(x) : return { -0.1 | 0 | 0.1 } respectively x */

        System.out.println(Math.nextUp(3));

        /* greater than function nextUp(x) : return next greater floating point value respective x */

        System.out.println(Math.nextDown(3));

        /* less than function nextDown(x) : return previous less floating point value respective x */

        System.out.println(Math.nextAfter(2,3));

        /* between than nextAfter(x,y) : return floating point value between x and y */
    }
}
/*
Compiled from "Math.java"
public final class java.lang.Math {
  public static final double E;
  public static final double PI;
  static double twoToTheDoubleScaleUp;
  static double twoToTheDoubleScaleDown;
  static final boolean $assertionsDisabled;
  public static double sin(double);
  public static double cos(double);
  public static double tan(double);
  public static double asin(double);
  public static double acos(double);
  public static double atan(double);
  public static double toRadians(double);
  public static double toDegrees(double);
  public static double exp(double);
  public static double log(double);
  public static double log10(double);
  public static double sqrt(double);
  public static double cbrt(double);
  public static double IEEEremainder(double, double);
  public static double ceil(double);
  public static double floor(double);
  public static double rint(double);
  public static double atan2(double, double);
  public static double pow(double, double);
  public static int round(float);
  public static long round(double);
  public static double random();
  public static int addExact(int, int);
  public static long addExact(long, long);
  public static int subtractExact(int, int);
  public static long subtractExact(long, long);
  public static int multiplyExact(int, int);
  public static long multiplyExact(long, int);
  public static long multiplyExact(long, long);
  public static int incrementExact(int);
  public static long incrementExact(long);
  public static int decrementExact(int);
  public static long decrementExact(long);
  public static int negateExact(int);
  public static long negateExact(long);
  public static int toIntExact(long);
  public static long multiplyFull(int, int);
  public static long multiplyHigh(long, long);
  public static int floorDiv(int, int);
  public static long floorDiv(long, int);
  public static long floorDiv(long, long);
  public static int floorMod(int, int);
  public static int floorMod(long, int);
  public static long floorMod(long, long);
  public static int abs(int);
  public static long abs(long);
  public static float abs(float);
  public static double abs(double);
  public static int max(int, int);
  public static long max(long, long);
  public static float max(float, float);
  public static double max(double, double);
  public static int min(int, int);
  public static long min(long, long);
  public static float min(float, float);
  public static double min(double, double);
  public static double fma(double, double, double);
  public static float fma(float, float, float);
  public static double ulp(double);
  public static float ulp(float);
  public static double signum(double);
  public static float signum(float);
  public static double sinh(double);
  public static double cosh(double);
  public static double tanh(double);
  public static double hypot(double, double);
  public static double expm1(double);
  public static double log1p(double);
  public static double copySign(double, double);
  public static float copySign(float, float);
  public static int getExponent(float);
  public static int getExponent(double);
  public static double nextAfter(double, double);
  public static float nextAfter(float, double);
  public static double nextUp(double);
  public static float nextUp(float);
  public static double nextDown(double);
  public static float nextDown(float);
  public static double scalb(double, int);
  public static float scalb(float, int);
  static double powerOfTwoD(int);
  static float powerOfTwoF(int);
  static {};
}
*/