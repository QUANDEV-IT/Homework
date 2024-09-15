import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so luong so nguyen: ");
        int interger = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= interger; i++){
            System.out.print("Nhap so nguyen thu: " + (i + 1) + ":");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("Tong cac so nguyen la: " + sum);
    }
}