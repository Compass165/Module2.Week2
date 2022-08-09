package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day la mau chuong trinh dang aX2 + bY + c = 0");
        System.out.println("Moi nhap a: ");
        System.out.println("Moi nhap b: ");
        System.out.println("Moi nhap c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        quadraticEquation.checkDelta();
        if (quadraticEquation.getDiscriminant()>0) {
            System.out.println("Phuong trinh co 2 nghiem la: "+quadraticEquation.getRoot1()+" va "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep la: "+quadraticEquation.getDoubleSolution());
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }

    }


}
