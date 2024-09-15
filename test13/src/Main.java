import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Input
          Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        //Proces
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}