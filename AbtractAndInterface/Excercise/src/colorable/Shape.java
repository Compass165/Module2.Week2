package colorable;
import colorable.Colorable;

import java.net.InterfaceAddress;

public abstract class Shape implements Colorable {

    private String color = "black";
    private boolean filled = false;

    public void setShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static boolean isColorable(Shape shape) {
        return Colorable.class.isInstance(shape);
    }

    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
