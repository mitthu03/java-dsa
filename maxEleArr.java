import java.util.Scanner;

public class maxEleArr {
    static int repeatElem(int[] arr){
        int n= arr.length;

        for (int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;


    }
    static int secndMx(int[] arr){
        int mx= findMax(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]== mx){
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int secndMx = findMax(arr);
        return secndMx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("maximum element: " +findMax(arr));
        System.out.println("second maximum: " +secndMx(arr));
        System.out.println("first repeat element: " +repeatElem(arr));
    }
}





