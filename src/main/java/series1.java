import java.util.Scanner;

public class series1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        for(int i=1;a<=n;i++)
        {
            if(i%2!=0)
                System.out.print(a + " ");
            else
                System.out.print("-" + a + " ");
            a = a + (int)Math.pow(i,2);
        }
    }
}
