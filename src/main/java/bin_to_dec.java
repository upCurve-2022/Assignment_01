import java.util.Scanner;

public class bin_to_dec {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int bin = s.nextInt();
        int dec=0,i=0;
        while (bin>0) {
            dec = dec + (bin%10)*(int)Math.pow(2,i);
            bin = bin/10;
            i++;
        }
        System.out.println(dec);
    }
}
