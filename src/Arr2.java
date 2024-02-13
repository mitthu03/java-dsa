import java.util.Scanner;
public class Arr2 {
    static void printA(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    static void changeAr(int[] arr){
        for (int i =0; i<arr.length; i++){
            arr[i] =0;
        }
    }
    static void changeVal(int a){
        a=104;

    }

    public static void main(String[] args) {
        int a =5;
        changeVal(a);
        System.out.println(a); // a=5 not changes occur due to pass by value
        int[] arry = new int[3];
        arry[0] = 4;
        arry[1] = 4;
        arry[2] = 4;

        changeAr(arry);
        printA(arry);

    }
}
