package Practice;

import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit the Project");
            System.out.print("Mời bạn nhập vào đây: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Mời bạn nhập độ Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit: " + fahrenheit + " Celcius: "+FtoC(fahrenheit));
                    break;
                case 2:
                    System.out.print("Mời bạn nhập độ Celcius: ");
                    celcius = sc.nextDouble();
                    System.out.println("Celcius: " +celcius +" fahrenheit: " +CtoF(celcius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

    }

    public static double CtoF(double celcius) {
        double fahrenheit = (9.0/5) * celcius +32;
        return fahrenheit;
    }

    public static double FtoC(double fahrenheit) {
        double celsius;
        return  celsius = (5.0/9) *(fahrenheit - 32);
    }

}
