import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac phan tu cua mang: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = arr[0];
        int min = arr[0];
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] > max){
                max = arr[i];

            }
            if ( arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la " + min);
    }
}