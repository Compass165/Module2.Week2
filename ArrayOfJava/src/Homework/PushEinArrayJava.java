package Homework;

import java.util.Scanner;

public class PushEinArrayJava {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong phan tu cua mang(<10 phan tu): ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1)+" là: ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Các phần tử có trong mảng: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
//        int arr1[] = pushIn(arr);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i] + "\t");
//        }
        int[] newArr = addNewElement(arr, 2, 100);
        for (int e:
             newArr) {
            System.out.println(e);
        }



    }

//    public static int[] pushIn(int[] arr1){
//        int index = -1;
//        int value;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so can chen vao mang: ");
//        value = scanner.nextByte();
//        System.out.println("Nhap vi tri muon chen vao mang: ");
//        index = scanner.nextByte();
//        if (index <= -1 && index >= arr1.length-1) {
//            System.out.println("Không chèn được phần tử vào mảng!");
//        } else {
//            for (int i = 0; i < arr1.length; i++) {
//                if (index-1 == i) {
//                    for (int j = arr1.length-1; j > i ; j--) {
//                        arr1[j] = arr1[j-1];
//
//                    }
//                    arr1[i] = value;
//                }
//            }
//        }
//        return arr1;
//    }

    public static int [] addNewElement(int[] srcArr, int index, int newValue) {
        int[] newArr = new int[srcArr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i] = srcArr[i];
        }
        newArr[index] = newValue;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = srcArr[i-1];
        }
        return newArr;
    }

}
