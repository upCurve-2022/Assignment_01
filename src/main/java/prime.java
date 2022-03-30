import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count;
        System.out.print("n = ");
        int n = s.nextInt();
        System.out.print("m = ");
        int m = s.nextInt();
        for (int i=n;i<=m;i++) {
            count=0;
            for (int j=2;j<=i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==1)
                System.out.println(i);
        }
    }
}
