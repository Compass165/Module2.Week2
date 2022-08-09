package RectangleClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap vao chieu rong: ");
        double width = scanner.nextDouble();
        System.out.print("Moi ban nhap vao chieu dai: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Hinh chu nhat ma ban khoi tao \n" +rectangle.display());
        System.out.println("Chu vi hinh chu nhat la: "+rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat la: "+rectangle.getArea());

    }

}
