import java.util.Scanner;

class cmeth{
    int add(int a , int b){
        int ans = a+b;
        return ans;
    }
}
public class Cmethod {


    static void welcome(){
        System.out.println("welcome to my world");

    }



    public static void main(String[] args) {
        welcome();
        cmeth obj = new cmeth();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("sum of input numbers is ");
        int ans = obj.add(a , b);
        System.out.println(ans);
        welcome();




    }
}
