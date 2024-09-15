import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        //Process
      if ( n % 2 == 0){
          for (int i = 1; i <= n; i+=2){
              sum += i;
          }
      }
      else{
          for (int i = 1; i <= n; i+=2){
              sum += i;
          }
      }
      //Output
        System.out.println(sum);
    }
}