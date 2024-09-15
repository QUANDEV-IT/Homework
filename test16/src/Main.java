import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap a: ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap b: ");
        int b = sc.nextInt();
        float x;
        if ( a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem !");
            }
            else{
                System.out.println("Phuong trinh vo nghiem !");
            }

        }
        else {
             x = (float) -b / a;
             System.out.println(x);
        }

        }
    }
