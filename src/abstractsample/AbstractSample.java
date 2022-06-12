package abstractsample;

public class AbstractSample {

    public static void main(String[] args) {
        Shape r=new Rectangle("Rectangle", 12, 6);
        r.PrintName();
        System.out.println("Area of the Rectangle ==> "+r.area());
        
        Shape c=new Circle("Circle", 13);
        c.PrintName();
        System.out.println("Area of the Rectangle ==> "+c.area());
        
    }
    
}
