import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int t = s.nextInt();
        int r = s.nextInt();
        int SI = (p*t*r)/100;
        System.out.println("Simple Interest - " + SI);
    }
}
