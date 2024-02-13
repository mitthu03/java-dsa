// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
class ArraysEx{
//    Scanner sc = new Scanner(System.in);
    void searchInArr(){
        int[] arra = {10,5,7,9,33,11,43};
        int x = 33;
        int anw = -1;
        for (int i = 0; i<arra.length; i++){
            if (arra[i] == x){
                anw=i;

            }

        }
        System.out.println(anw);

    }
    void multiArr(){
        int[][] arr =new int[2][3];
//        arr[0][0] = 2;
//        arr[0][1] = 4;
//        arr[0][2] = 6;
//        arr[1][0] = 44;
//        arr[1][1] = 40;
//        arr[1][2] = 48;

//        System.out.println(arr.length);
//using loop print elements of array

        System.out.println("elements of given array :");
        for (int i = 0; i<arr.length;i++)
            for (int j =0; j<arr[i].length;j++)
                System.out.println(arr[i][j]);

        }

    void demoArrays() {

        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = new String[3];
//        ages[0]=1;
//        ages[1]=2;
//        ages[2]=4;

//        weights[0]=12.6f;
//        weights[1]=33.6f;
//        weights[2]=16.6f;

//        adding elements of array

        int sum = 0;
        for (int i =0; i<ages.length;i++){
            sum=sum+ages[i];
        }
        System.out.println("sum of array elements :"+sum);
//print elements of array

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

//        using loops print array elements
        System.out.println("print elements of aaray using loops");
        for (int i=0; i<3; i++){
            System.out.println(ages[i]);

        }

//        System.out.println(weights[0]);
//        System.out.println(weights[1]);
//        System.out.println(weights[2]);
        for (float weight : weights){
            System.out.println(weight);
        }
        int i=0;

        while (i<3){
            System.out.println(ages[i]);

            ++i;
        }
//        calculate max element from given elements of array
        int ans=0;
        for (i=0; i<ages.length;i++){
            if (ages[i]>ans){
                ans= ages[i];

            }
        }
        System.out.println("max element :" +ans);

    }
}
public class Main {
    static void printA(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {

//        takeing input from user of array elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n = sc.nextInt();
        int[] age = new int[n];
        System.out.println("Enter array elements :" +n);
        for (int i = 0; i<age.length; i++) {

            age[i] = sc.nextInt();
        }
        printA(age);
//        copy one array to another array
        System.out.println("copy one array to another");
        int[] age_2 = age;
        printA(age_2);
//        for (int i = 0; i<n; i++){
//            System.out.print(age[i]);
//        }
        ArraysEx obj = new ArraysEx();

//        obj.demoArrays();
//        obj.multiArr();
//        obj.searchInArr();
//        System.out.println(obj);


    }
}