import java.util.Scanner;

public class Main {
    //Process
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Moi ban nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Moi ban nhap so thu hai: ");
        int b = sc.nextInt();

        // Output
        int result = gcd(a, b);
        System.out.println("Uoc so chung lon nhat cua " + a + " va " + b + " la: " + result);
    }
}
