import java.util.Scanner;

public class ugly_num {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int count,flag=0;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                count=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        count++;
                }
                if(count==0 && (i==2 || i==3  || i==5))
                    flag++;
            }
        }
        if(flag==3)
            System.out.println("It is an ugly number");
        else
            System.out.println("It is not an ugly number");
    }
}
