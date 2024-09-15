import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cout = 0;
        char characters = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap vao mot chuoi bat ki: ");
        String strings = sc.nextLine();
        for ( int i = 0; i < strings.length(); i++){
            if (strings.charAt(i) == characters){
                cout++;
            }
        }
        System.out.println("So la xuat hien cua bien " + characters + " trong chuoi la " + cout);
    }
}