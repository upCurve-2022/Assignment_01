import java.util.Scanner;

public class series3 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1,b=2;
        for (int i=1;a<=n || b<=n;i++) {
            if(i%2!=0) {
                System.out.print(a + " ");
                a = a + 3;
            }
            else {
                System.out.print("-" + b + " ");
                b = b + 4;
            }
        }
    }
}
