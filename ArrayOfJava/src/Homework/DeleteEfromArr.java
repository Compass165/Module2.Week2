package Homework;


import java.util.Scanner;

public class DeleteEfromArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Moi nhap do dai mang: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
        System.out.printf("%-20s%s", "Các phần tử có trong mảng: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int arr1[] = deleteE(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

    }

    public static int[] deleteE(int[] arr1) {
        int value;
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu muon kiem tra: ");
        value = scanner.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == value) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr1.length-1; i++) {
                arr1[i] = arr1[i+1];
            }
            arr1[arr1.length-1] = 0;
        }
        return arr1;
    }

}
