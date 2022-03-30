import java.util.Scanner;

public class seq1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=4;
        for(int i=2;a<=n;i++)
        {
            System.out.print(a + " ");
            a = 4*(int)Math.pow(i,2);
        }
    }
}
