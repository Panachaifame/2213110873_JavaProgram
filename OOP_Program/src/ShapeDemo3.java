

import javax.swing.*;
public class ShapeDemo3 {
    public static void main(String[] args) {
        Cylinder[]cylinders = new Cylinder[5];
        double[] radius = new double [5];
        double[] height = new double [5];
        String [] input = new String [5];
        for(int i = 0 ; i<cylinders.length;i++){
            input[i] = JOptionPane.showInputDialog("Input radius and height");
            String[] split = input[i].split("");
            radius [i] = Double.parseDouble(split[0]);
            height [i] = Double.parseDouble(split[1]);
            cylinders[1] = new Cylinder(radius[i], height[i]);
        }
        int i = 0;
        for(Cylinder _cylinder : cylinders) {
			JOptionPane.showMessageDialog(null, "Cylinder" + (i+1) + ", volume=" + cylinders[i].getVolume());
            i++;    
            }
    }
}
