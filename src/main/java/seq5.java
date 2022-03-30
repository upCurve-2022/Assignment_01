import java.util.Scanner;

public class seq5 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        for(int i=2;a<=n;i++)
        {
            if(i%4==0)
                continue;
            System.out.print(a + " ");
            a = (int) Math.pow(i,2);
        }
    }
}
