public class Main {
    public static void main(String[] args) {
        //Input
        int sum = 0;
        //Process
        for (int i = 1; i <= 100; i++){
            if ( i % 7 == 0){
                sum += i;
            }
        }
        //Output
        System.out.println(sum);
    }
}