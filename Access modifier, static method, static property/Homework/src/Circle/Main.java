package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"yellow");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(10, 3, "pink");
        System.out.println(cylinder.toString());
    }
}
