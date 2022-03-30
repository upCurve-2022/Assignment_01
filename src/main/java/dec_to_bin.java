import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        while(n>0) {
            str = (n%2) + str;
            n = n/2;
        }
        System.out.println(str);
    }
}
