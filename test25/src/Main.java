import java.util.Scanner;
public class Main {
    //Input
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so luong n: ");
        int numbers = sc.nextInt();
        int sum = 0;
        //Process
        for ( int i = 0; i < numbers; i++){
            System.out.println("So nguyen thu: " + ( i + 1) + ":");
            int number = sc.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}