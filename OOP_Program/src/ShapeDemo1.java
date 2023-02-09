import java.util.*;
public class ShapeDemo1 {
    static Scanner scan = new Scanner (System.in);
     public static void main(String[] args) {
        System.out.print("Input radius :");
        double radius = scan.nextDouble();
        System.out.print("Input height :");
        double height = scan.nextDouble();

        Circle  circle = new Circle(radius, null);
        System.out.print("Circle["+circle+"]");
        System.out.println();
        System.out.println("Circle[area = "+circle.getArea()+"]");

        Cylinder cylinder =new Cylinder(radius, height);
        System.out.print("Cylinder["+cylinder+"]");
        System.out.println();
        System.out.print("Ctlinder[area = "+cylinder.getArea()+"]");
        System.out.println();
        System.out.print("Cylinder[volume="+cylinder.getVolume()+"]");


   } 
}
