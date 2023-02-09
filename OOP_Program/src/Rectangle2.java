import javafx.geometry.Rectangle2D;

public class Rectangle2 implements Shape2{
    private double width;
    private double length;

    public Rectangle2(double width, double Length){
        this.length = length;
        this.width = width;

    }
    public  double getWidth(){
        return this.width;
    }
    public double getlength(){
        return this.length;
    }
    public double getArea(){
        return getWidth()*getlength();
        
    }
    public String toString(){
        return "Rectangle[width="+getWidth()+",length="+getlength()+","+color;
    }
}
    

