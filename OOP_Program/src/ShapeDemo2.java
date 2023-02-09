import java.util.*;
public class ShapeDemo2 {
    public static void main(String[] args) {
        Cylinder [] cylinders = new Cylinder [5];
        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < cylinders.length;i++){
            System.out.print("input radius of Cylinder "+(i+1)+" : ");
            double radius = scan.nextDouble();
            System.out.print("input height of Cylinder " + (i+1)+" : ");
            double height = scan.nextDouble();
            cylinders[i] =new Cylinder(radius, height);
        }
        for(int i = 0 ; i < cylinders.length;i++){
            System.out.println("Cylinder "+ (i+1) + ", volume = "+cylinders[i].getVolume());
        }
        scan.close();
    }
}
