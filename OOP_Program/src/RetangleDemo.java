import javax.swing.*;;
public class RetangleDemo {
    public static void main(String[] args) {
        double width = Double.parseDouble(JOptionPane.showInputDialog("Inpput width"));
        double length  = Double.parseDouble(JOptionPane.showInputDialog("Input Length"));
        String color = JOptionPane.showInputDialog("Input Color");

        Rectangle rec = new Rectangle(width, length, color);
        JOptionPane.showMessageDialog(null, rec + "\nArea of Retangle");
    }
}
