import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1,b=1,sum=0;
        for(int i=1;a<=n;i++)
        {
            System.out.print(a + " ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
