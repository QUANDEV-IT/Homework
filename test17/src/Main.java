import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhan so n tu ban phim: ");
        int n = sc.nextInt();
        //Process
        if ( n % 2 == 0){
            System.out.println("So " + n + " la so chan.");
        }
        else if ( n % 2 != 0){
            System.out.println("So " + n + " la so le.");
        }
        else if ( n == 0){
            System.out.println("Zero");
        }
        //Output la cac lenh in ra chan le trong if else if (System.....)
    }
}