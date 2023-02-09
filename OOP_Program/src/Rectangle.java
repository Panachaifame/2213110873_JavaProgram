public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length, String color){
        super(color);
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
        return "Rectangle[width="+getWidth()+",length="+getlength()+","+super.toString();
    }
}
