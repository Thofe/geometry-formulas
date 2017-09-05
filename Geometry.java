
/**
 * Write a description of class Geometry here.
 * 
 * @author Blake Mitrick
 * @version 8/30/2017
 */
public class Geometry 
{
    /**
     * Returns the area of a triangle 
     * 
     * @param base (as a double) the base of the triangle
     * @param height (as a double) the height of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Returns the area of a rectangle 
     * 
     * @param length (as a double) the length of the rectangle
     * @param width (as a double) the width of the rectangle
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Returns the volume of a sphere
     * 
     * @param radius (as a double) the radius of the sphere
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Returns the area of a parallelogram 
     * 
     * @param base (as a double) the base of the parallelogram
     * @param height (as a double) the height of the parallelogram
     */
    public static double parallelogramArea(double base, double height)
    {
        return base * height;
    }
    
    /**
     * Returns the area of a trapezoid
     * 
     * @param base1 (as a double) one of the bases of the trapezoid
     * @param base2 (as a double) the other base of the trapezoid
     * @param height (as a double) the height of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height)
    {
        return ((base1 + base2)/2)* height;
    }
    
    /**
     * Returns the volume of a rectangular prism
     * @param length (as a double) the length of the rectangular prism
     * @param height (as a double) the height of the rectangular prism
     * @param width (as a double) the width of the rectangular prism
     */
    public static double rectangleVolume(double length, double height, double width)
    {
        return length * width * height;
    }
    
    /**
     * Returns the volume of a cone 
     * 
     * @param radius (as a double) the radius of the cone
     * @param height (as a double) the height of the cone
     */
    public static double coneVolume(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * (height/ 3.0);
    }
    
    /**
     * Returns the surface area of a rectangle
     * 
     * @param width (as a double) the width of the rectangle
     * @param height (as a double) the height of the rectangle
     */
    public static double surfaceAreaRectangle(double width, double height)
    {
        return width * height;
    }    
    
    /**
     * Returns the surface area of a sphere
     * 
     * @param radius (as a double) the radius of the sphere
     */
    public static double surfaceAreaSphere(double radius)
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Returns the length of a right angles hypotenuse when given the other 2 sides
     * 
     * @param leg1 (as a double) one of the 2 legs of the triangle
     * @param leg2 (as a double) the other lege of the triangle
     */
    public static double hypotenuse(double leg1, double leg2)
    {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }
    
    /**
     * Returns the distance between 2 points
     * 
     * @param x1 (as a double) the x value of the first coord
     * @param y1 (as a double) the y value of the first coord
     * @param x2 (as a double) the x value of the second coord
     * @param y2 (as a double) the y value of the second coord
     */
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
    }    
    
    /**
     * Returns the slope of the line when given 2 points
     * 
     * @param x1 (as a double) the x value of the first coord
     * @param y1 (as a double) the y value of the first coord
     * @param x2 (as a double) the x value of the second coord
     * @param y2 (as a double) the y value of the second coord
     */
    public static double pointSlope(double x1, double y1, double x2, double y2)
    {
        return (y2-y1)/(x2-x1);
    }
    
    /**
     * Returns the area of a triangle given all 3 sides
     * 
     * @param side1 (as a double) the first side of the triangle
     * @param side2 (as a double) the second side of the triangle
     * @param side3 (as a double) the third side of the triangle
     */
    public static double tripleSideArea(double side1, double side2, double side3)
    {
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
    
    /**
     * Runs the program
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        System.out.println(ta1);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
        
        double par1 = parallelogramArea(2.0, 5.0);
        System.out.println(par1);
        
        double tra1 = trapezoidArea(7.0, 30.0, 2.0);
        System.out.println(tra1);
        
        double rect1 = rectangleVolume(1.0, 2.0, 3.0);
        System.out.println(rect1);
        
        double cone1= coneVolume(3.0, 100.0);
        System.out.println(cone1);
        
        double rect2 = surfaceAreaRectangle(13.0, 19.0);
        System.out.println(rect2);
        
        double sphere = surfaceAreaSphere(10.0);
        System.out.println(sphere);
        
        double hyp = hypotenuse(5.0, 7.0);
        System.out.println(hyp);
        
        double dist = distance(1.0, 2.0, 9.0, 12.0);
        System.out.println(dist);
        
        double slope = pointSlope(1.0, 2.0, 9.0, 12.0);
        System.out.println(slope);
        
        double heron = tripleSideArea(24.0, 12.0, 15.0);
        System.out.println(heron);
    }
}
