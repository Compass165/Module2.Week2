package Homework;

public class testPushIn {

    public static void main(String[] args) {
        int[] a = {3,4,5,6};
        int[] b = addNewElement(a, 2, 100);
        for (int e:b) {
            System.out.println(e);
        }
    }

    public static int[] addNewElement(int[] srcArr, int index, int newValue ) {
        int[] newArr = new int[srcArr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i] = srcArr[i];
        }
        newArr[index] = newValue;
        for (int i = (index+1); i < newArr.length; i++) {
            newArr[i]=srcArr[i-1];
        }
        return newArr;
    }

}
