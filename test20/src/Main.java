import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cout = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi s tu ban phim: ");
        String s = sc.nextLine();
        for ( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                cout++;
            }
        }
        System.out.println("So lan xuat hien ky tu so trong chuoi s la : " + cout );
    }
}