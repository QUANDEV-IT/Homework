import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Bai tap mon lap trinh java", " ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}