
/**
 * Write a description of class Geometry here.
 * 
 * @author Blake Mitrick
 * @version 8/30/2017
 */
public class Geometry 
{
    
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double parallelogramArea(double base, double height)
    {
        return base * height;
    }
    
    public static double trapezoidArea(double base1, double base2, double height)
    {
        return ((base1 + base2)/2)* height;
    }
    
    public static double rectangleVolume(double length, double height, double width)
    {
        return length * width * height;
    }
    
    public static double coneVolume(double radius, double height)
    {
        return Math.PI * Math.pow(radius, 2) * (height/ 3.0);
    }
    
    public static double surfaceAreaRectangle(double width, double height)
    {
        return width * height;
    }    
    
    public static double surfaceAreaSphere(double radius)
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    public static double hypotenuse(double leg1, double leg2)
    {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }
    
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
    }    
    
    public static double pointSlope(double x1, double y1, double x2, double y2)
    {
        return (y2-y1)/(x2-x1);
    }
    
    public static double tripleSideArea(double side1, double side2, double side3)
    {
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
    
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
