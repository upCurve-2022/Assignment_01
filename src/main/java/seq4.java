import java.util.Scanner;

public class seq4 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1,b=4,c=7,sum=0;
        for(int i=1;a<=n;i++)
        {
            System.out.print(a + " ");
            sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
    }
}
