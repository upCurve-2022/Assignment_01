import java.util.Scanner;

public class Swap3num {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        System.out.print("c = ");
        int c = s.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
