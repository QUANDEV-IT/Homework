import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap mot so tu ban phim: ");
        int numbers = sc.nextInt();
        if (numbers <= 1){
            System.out.println( "Khong la so nguyen to.");
        }
        else if ( numbers == 2 || numbers == 3){
            System.out.println(numbers + " la so nguyen to");
        }
        else{
            boolean isPrime = true;
            int i = 5;
            while( i * i <= numbers){
                if (numbers % i == 0 || numbers % ( i + 2) == 0){
                    isPrime = false;
                    break;
                }
                i += 6;
            }
            if (isPrime){
                System.out.println(numbers + " la so nguyen to.");
            }
            else{
                System.out.println(numbers + " khong la so nguyen to.");
            }
        }

}
}