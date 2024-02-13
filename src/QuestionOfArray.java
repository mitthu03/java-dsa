import java.util.Arrays;
import java.util.Scanner;

public class QuestionOfArray {
    static void kthSmallestAndLargest(int[] ar1, int x){
        Arrays.sort(ar1);
        System.out.println("smallest kth element : " );
        System.out.println(ar1[x-1]);
        System.out.println("Largest kth element : " );
        System.out.println(ar1[ar1.length-x]);






    }
    static int[] smallAndlarge(int[] ar1){
        Arrays.sort(ar1);
        int[] ans = {ar1[0], ar1[ar1.length-1]};
        return ans;
    }
    static boolean isSorted(int[] ar1){
        boolean cheak = true;
        for (int i =1; i<ar1.length; i++){
            if (ar1[i]< ar1[i-1]){
//                not sorted
                cheak= false;
                break;
            }
        }
        return cheak;
    }
    static int greterElem(int[] ar1, int x){
        int count = 0;
        for(int i=0; i< ar1.length;i++){
            if (ar1[i]>x){
                System.out.print("Elements   " + ar1[i] + " Greater than x :");
                count++;
            }


        }
        return count;
    }
    static int lastOccur(int[] ar1, int x){
        int lastindex = -1;
        for(int i=0; i< ar1.length;i++){
            if (ar1[i] == x){
                lastindex= i;
            }
        }
        return lastindex;

    }

 static int countOccurrence(int[] ar1, int x){
     int count = 0;
     for(int i=0; i< ar1.length;i++){
         if (ar1[i] == x){
             count++;
         }
     }
     return count;

 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] ar1 = new int[n];
        System.out.println("Enter" + n +"elements: ");
        for(int i=0; i< ar1.length;i++){
            ar1[i] = sc.nextInt();
        }
        System.out.println("enter x");
        int x = sc.nextInt();
//        System.out.println("Count of x: " + countOccurrence(ar1, x));
//        System.out.println("Last occurrence of x: " + lastOccur(ar1, x));
//        System.out.println("Count Greater elements of x: " + greterElem(ar1, x));
//        System.out.println("Is sorted: " + isSorted(ar1));
//        int[] ans = smallAndlarge(ar1);
//
//        System.out.println("Smallest: " + ans[0]);
//        System.out.println("Largest: " + ans[1]);
        kthSmallestAndLargest(ar1,x);

    }
}
