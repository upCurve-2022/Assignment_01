import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("X = ");
        int x = s.nextInt();
        System.out.print("n = ");
        int n = s.nextInt();
        int a = 1;
       for (int i=1;i<=n;i++) {
           a = a * x;
       }
        System.out.println(a);
    }
}
