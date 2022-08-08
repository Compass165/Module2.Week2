package Practice;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap do dai cua mang: ");
            size = scanner.nextInt();
            if (size>20)
                System.out.println(" Do dai cua mang khong duoc vuot qua 20!");

        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.print("Phan tu thu " +(i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sach la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max);
            index = j+1;

        }
        System.out.println("GTLN la: " + max + " ,tai vi tri: " + index);


    }



}
