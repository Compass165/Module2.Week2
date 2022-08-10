package designAnddevelopTriangle;

import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("Blueeee", false);
//        shape.setColor("Blue");
//        shape.setFilled(true);
//        System.out.println(shape);

        Triangle triagle = getTriangle();
        System.out.print("nhập màu: ");
        triagle.setColor(scanner.nextLine());
        System.out.print("có muốn fill không Y/N: ");
        String option = scanner.nextLine();
        switch (option) {
            case "y":
            case "Y":
                break;
            default:
                triagle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triagle.toString());

    }

    private static Triangle getTriangle() {
        System.out.print("nhập 3 cạnh a,b,c: ");
        String input = scanner.nextLine();
        if (!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("không hợp lệ");
            System.out.print("nhập 3 cạnh a,b,c: ");
            input = scanner.nextLine();
        }
        String[] triagle = input.split(",");
        Triangle outTriangle = new Triangle(
                Double.parseDouble(triagle[0]),
                Double.parseDouble(triagle[1]),
                Double.parseDouble(triagle[2])
        );
        if (!outTriangle.isValid()) {
            System.out.println("tam giác không hợp lệ!");
            outTriangle = getTriangle();
        }
        return outTriangle;
    }


}
