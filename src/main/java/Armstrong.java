import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n,r,a=0;
        while(m>0) {
            r = m%10;
            a = a + (int)Math.pow(r,3);
            m = m/10;
        }
        if(a==n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an armstrong Number");
    }
}
