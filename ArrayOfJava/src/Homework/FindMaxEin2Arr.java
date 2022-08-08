package Homework;
import java.util.Random;
import java.util.Scanner;

public class FindMaxEin2Arr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mảng nhập vào có số hàng: ");
        int m = input.nextInt();
        System.out.println("Mảng nhập vào có số cột: ");
        int n = input.nextInt();
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Nhập vào giá trị ở vị trí %d x %d là:", i, j);
                array[i][j] = input.nextInt();

            }
        }
            int max = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (max < array[i][j]) max = array[i][j];
                }
            }
            System.out.print("Giá trị lớn nhất của mảng 2 chiều là:");
            System.out.println(max);
        }
}


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\n\nNhập số dòng, số cột: ");
//        int d = input.nextInt();  //dòng
//        int c = input.nextInt();   //cột
//        int b[][] = new int[d][c];
//        NhapMaTran(b, d, c);
//        System.out.print("Nội dung ma trận: ");
//        XuatMaTran(b, d, c);
//        System.out.print(fMax(b));
//    }
//
//    //Nhập Ma Trận
//    public static void NhapMaTran(int b[][], int d, int c) {
//        Random rand = new Random();
//        for (int i = 0; i < d; i++)
//            for (int j = 0; j < c; j++)
//                b[i][j] = rand.nextInt(30);
//    }
//
//    //Xuất Ma Trận
//    public static void XuatMaTran(int b[][], int d, int c) {
//        for (int i = 0; i < d; i++) {
//            System.out.println();
//            for (int j = 0; j < c; j++)
//                System.out.print("\t" + b[i][j] + "\t");
//
//        }
//    }
//    public static int fMax(int[][] arr) {
//        int max;
//        max = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//        }
//        return max;
//    }

