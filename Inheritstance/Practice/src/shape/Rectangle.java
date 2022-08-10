package shape;

public class Rectangle extends Shape{

    private double width = 1.0;
    private double height = 1.0;

    public Rectangle () {

    }
    public Rectangle (double width, double height) {
        this.width=width;
        this.height=height;

    }
    public Rectangle (double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth (double width) {
        this.width=width;
    }
    public void setHeight (double height) {
        this.height=height;
    }
    public double getArea () {
        return width*this.height;
    }
    public double getPerimeter (){
        return (width+this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "width = " + getWidth() +
                ", height = " + getHeight() +
                ", which is subclass of "
                + " Area: " + getArea()
                + " Perimeter " +getPerimeter()
                + '\t'
                + super.toString();
    }
}
