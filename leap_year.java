import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if (year%400 == 0 || (year%100!=0 && year%4==0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}